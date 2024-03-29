// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package snowflakeconnector.proxies;

public class AsyncQueryResult
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject asyncQueryResultMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SnowflakeConnector.AsyncQueryResult";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Executed("Executed"),
		Message("Message"),
		QueryId("QueryId");

		private final java.lang.String metaName;

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

	public AsyncQueryResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected AsyncQueryResult(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject asyncQueryResultMendixObject)
	{
		if (asyncQueryResultMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, asyncQueryResultMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.asyncQueryResultMendixObject = asyncQueryResultMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AsyncQueryResult.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static snowflakeconnector.proxies.AsyncQueryResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return snowflakeconnector.proxies.AsyncQueryResult.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static snowflakeconnector.proxies.AsyncQueryResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new snowflakeconnector.proxies.AsyncQueryResult(context, mendixObject);
	}

	public static snowflakeconnector.proxies.AsyncQueryResult load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return snowflakeconnector.proxies.AsyncQueryResult.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 * @throws com.mendix.core.CoreException
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 * @throws com.mendix.core.CoreException
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
	 * @return value of Executed
	 */
	public final java.lang.Boolean getExecuted()
	{
		return getExecuted(getContext());
	}

	/**
	 * @param context
	 * @return value of Executed
	 */
	public final java.lang.Boolean getExecuted(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Executed.toString());
	}

	/**
	 * Set value of Executed
	 * @param executed
	 */
	public final void setExecuted(java.lang.Boolean executed)
	{
		setExecuted(getContext(), executed);
	}

	/**
	 * Set value of Executed
	 * @param context
	 * @param executed
	 */
	public final void setExecuted(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean executed)
	{
		getMendixObject().setValue(context, MemberNames.Executed.toString(), executed);
	}

	/**
	 * @return value of Message
	 */
	public final java.lang.String getMessage()
	{
		return getMessage(getContext());
	}

	/**
	 * @param context
	 * @return value of Message
	 */
	public final java.lang.String getMessage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Message.toString());
	}

	/**
	 * Set value of Message
	 * @param message
	 */
	public final void setMessage(java.lang.String message)
	{
		setMessage(getContext(), message);
	}

	/**
	 * Set value of Message
	 * @param context
	 * @param message
	 */
	public final void setMessage(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String message)
	{
		getMendixObject().setValue(context, MemberNames.Message.toString(), message);
	}

	/**
	 * @return value of QueryId
	 */
	public final java.lang.String getQueryId()
	{
		return getQueryId(getContext());
	}

	/**
	 * @param context
	 * @return value of QueryId
	 */
	public final java.lang.String getQueryId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.QueryId.toString());
	}

	/**
	 * Set value of QueryId
	 * @param queryid
	 */
	public final void setQueryId(java.lang.String queryid)
	{
		setQueryId(getContext(), queryid);
	}

	/**
	 * Set value of QueryId
	 * @param context
	 * @param queryid
	 */
	public final void setQueryId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String queryid)
	{
		getMendixObject().setValue(context, MemberNames.QueryId.toString(), queryid);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return asyncQueryResultMendixObject;
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
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final snowflakeconnector.proxies.AsyncQueryResult that = (snowflakeconnector.proxies.AsyncQueryResult) obj;
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
		return entityName;
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
