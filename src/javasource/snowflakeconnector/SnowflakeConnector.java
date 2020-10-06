package snowflakeconnector;

import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaObject;
import com.mendix.systemwideinterfaces.core.meta.IMetaPrimitive;
import com.mendix.systemwideinterfaces.core.meta.IMetaPrimitive.PrimitiveType;

import net.snowflake.client.core.QueryStatus;
import snowflakeconnector.proxies.ConnectionBuilder;
import snowflakeconnector.proxies.Enum_QueryStatus;

public class SnowflakeConnector {
	
	public static Connection getConnection(ConnectionBuilder connectionBuilder) throws SQLException {
		
		try {
			Class.forName("net.snowflake.client.jdbc.SnowflakeDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println("Couldn't register Snowflake JDBC driver");
		}

		Properties props = new Properties();

		// Set connection properties
		
	    String accountName = connectionBuilder.getAccountName();
	    String schema = connectionBuilder.getSchema();
		
	 	props.put("user", connectionBuilder.getUser());
		props.put("password", connectionBuilder.getPassword());
	    props.put("db", connectionBuilder.getDb());    
	    props.put("warehouse", connectionBuilder.getWarehouse());   
	    props.put("role", connectionBuilder.getRole());
	    
    	if(schema != null && !schema.isEmpty()) 	{	
    		props.put("schema", schema);
    	}
    
	    Connection con = DriverManager.getConnection("jdbc:snowflake://" + accountName + ".snowflakecomputing.com/", props);
	    
	    return con;
	}
	
	public static Stream<IMendixObject> streamConverter(final Stream<Map<String, Optional<Object>>> resultStream, final IMetaObject metaObject, final IContext context) throws SQLException {

		// Initialize logger
		ILogNode logNode = Core.getLogger("SnowflakeConnector");

		// Get entity name for result object
		String entityName = metaObject.getName();

		// database connector function for mapping stream to mendix objects
		Function<Map<String, Optional<Object>>, IMendixObject> toMendixObject = columns -> {
			
			// Create object
			IMendixObject obj = Core.instantiate(context, entityName);

			BiConsumer<String, Optional<Object>> setMemberValue = (name, value) -> {
				IMetaPrimitive metaPrimitive = metaObject.getMetaPrimitive(name);
				if (metaPrimitive == null) {
					String errorMessage = String.format(
							"Database attribute '%1$s' is not in the entity '%2$s'."
									+ " Please check the entity '%2$s' attribute names with the database column names.",
							name, entityName);
					logNode.error(errorMessage);
					throw new MendixRuntimeException(errorMessage);
				}
				PrimitiveType type = metaPrimitive.getType();
				// convert to suitable value (different for Binary type)
				Function<Object, Object> toSuitableValue = toSuitableValue(type);
				// for Boolean type, convert null to false
				Supplier<Object> defaultValue = () -> type == PrimitiveType.Boolean ? Boolean.FALSE : null;
				// apply two functions declared above
				Object convertedValue = value.map(toSuitableValue).orElseGet(defaultValue);
				// update object with converted value
				if (type == PrimitiveType.HashString)
					throw new MendixRuntimeException(String.format(
							"Attribute type Hashed String for attribute '%1$s' on entity '%2$s' is not supported, "
									+ "please use attribute type 'String' instead",
							name, entityName));
				else
					obj.setValue(context, name, convertedValue);
			};

			columns.forEach(setMemberValue);
			logNode.trace("Instantiated object: " + obj);
			return obj;
		};
		
		// Return IMendixObject stream
		return resultStream.map(toMendixObject);
	}
	
	
	private static Function<Object, Object> toSuitableValue(final PrimitiveType type) {
		return v -> type == PrimitiveType.Binary ? new ByteArrayInputStream((byte[]) v) : v;
	}
	
    public static Enum_QueryStatus fromString(String snowflakeQueryStatus)
    {
            if (snowflakeQueryStatus != null)
                    for (Enum_QueryStatus e : Enum_QueryStatus.values())
                            if (e.toString().equals(snowflakeQueryStatus))
                                    return e;
            return null;
    }
}
