// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package snowflakeconnector.proxies;

public class WarehouseEdit
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject warehouseEditMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SnowflakeConnector.WarehouseEdit";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		NewSize("NewSize");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public WarehouseEdit(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "SnowflakeConnector.WarehouseEdit"));
	}

	protected WarehouseEdit(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject warehouseEditMendixObject)
	{
		if (warehouseEditMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("SnowflakeConnector.WarehouseEdit", warehouseEditMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a SnowflakeConnector.WarehouseEdit");

		this.warehouseEditMendixObject = warehouseEditMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'WarehouseEdit.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static snowflakeconnector.proxies.WarehouseEdit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return snowflakeconnector.proxies.WarehouseEdit.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static snowflakeconnector.proxies.WarehouseEdit initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new snowflakeconnector.proxies.WarehouseEdit(context, mendixObject);
	}

	public static snowflakeconnector.proxies.WarehouseEdit load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return snowflakeconnector.proxies.WarehouseEdit.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * Set value of NewSize
	 * @param newsize
	 */
	public final snowflakeconnector.proxies.Enum_WarehouseSize getNewSize()
	{
		return getNewSize(getContext());
	}

	/**
	 * @param context
	 * @return value of NewSize
	 */
	public final snowflakeconnector.proxies.Enum_WarehouseSize getNewSize(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.NewSize.toString());
		if (obj == null)
			return null;

		return snowflakeconnector.proxies.Enum_WarehouseSize.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of NewSize
	 * @param newsize
	 */
	public final void setNewSize(snowflakeconnector.proxies.Enum_WarehouseSize newsize)
	{
		setNewSize(getContext(), newsize);
	}

	/**
	 * Set value of NewSize
	 * @param context
	 * @param newsize
	 */
	public final void setNewSize(com.mendix.systemwideinterfaces.core.IContext context, snowflakeconnector.proxies.Enum_WarehouseSize newsize)
	{
		if (newsize != null)
			getMendixObject().setValue(context, MemberNames.NewSize.toString(), newsize.toString());
		else
			getMendixObject().setValue(context, MemberNames.NewSize.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return warehouseEditMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final snowflakeconnector.proxies.WarehouseEdit that = (snowflakeconnector.proxies.WarehouseEdit) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "SnowflakeConnector.WarehouseEdit";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}