// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package snowflakeconnector.proxies;

public class AsyncQueryExample
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject asyncQueryExampleMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "SnowflakeConnector.AsyncQueryExample";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		QueryId("QueryId"),
		Query("Query"),
		Status("Status"),
		Message("Message"),
		AsyncQueryExample_DatabaseProfile("SnowflakeConnector.AsyncQueryExample_DatabaseProfile");

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

	public AsyncQueryExample(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected AsyncQueryExample(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject asyncQueryExampleMendixObject)
	{
		if (asyncQueryExampleMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, asyncQueryExampleMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.asyncQueryExampleMendixObject = asyncQueryExampleMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'AsyncQueryExample.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static snowflakeconnector.proxies.AsyncQueryExample initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return snowflakeconnector.proxies.AsyncQueryExample.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static snowflakeconnector.proxies.AsyncQueryExample initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new snowflakeconnector.proxies.AsyncQueryExample(context, mendixObject);
	}

	public static snowflakeconnector.proxies.AsyncQueryExample load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return snowflakeconnector.proxies.AsyncQueryExample.initialize(context, mendixObject);
	}

	public static java.util.List<snowflakeconnector.proxies.AsyncQueryExample> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> snowflakeconnector.proxies.AsyncQueryExample.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
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
	 * @return value of Query
	 */
	public final java.lang.String getQuery()
	{
		return getQuery(getContext());
	}

	/**
	 * @param context
	 * @return value of Query
	 */
	public final java.lang.String getQuery(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Query.toString());
	}

	/**
	 * Set value of Query
	 * @param query
	 */
	public final void setQuery(java.lang.String query)
	{
		setQuery(getContext(), query);
	}

	/**
	 * Set value of Query
	 * @param context
	 * @param query
	 */
	public final void setQuery(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String query)
	{
		getMendixObject().setValue(context, MemberNames.Query.toString(), query);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final snowflakeconnector.proxies.Enum_QueryStatus getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final snowflakeconnector.proxies.Enum_QueryStatus getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null) {
			return null;
		}
		return snowflakeconnector.proxies.Enum_QueryStatus.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(snowflakeconnector.proxies.Enum_QueryStatus status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, snowflakeconnector.proxies.Enum_QueryStatus status)
	{
		if (status != null) {
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
		}
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
	 * @throws com.mendix.core.CoreException
	 * @return value of AsyncQueryExample_DatabaseProfile
	 */
	public final snowflakeconnector.proxies.DatabaseProfile getAsyncQueryExample_DatabaseProfile() throws com.mendix.core.CoreException
	{
		return getAsyncQueryExample_DatabaseProfile(getContext());
	}

	/**
	 * @param context
	 * @return value of AsyncQueryExample_DatabaseProfile
	 * @throws com.mendix.core.CoreException
	 */
	public final snowflakeconnector.proxies.DatabaseProfile getAsyncQueryExample_DatabaseProfile(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		snowflakeconnector.proxies.DatabaseProfile result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.AsyncQueryExample_DatabaseProfile.toString());
		if (identifier != null) {
			result = snowflakeconnector.proxies.DatabaseProfile.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of AsyncQueryExample_DatabaseProfile
	 * @param asyncqueryexample_databaseprofile
	 */
	public final void setAsyncQueryExample_DatabaseProfile(snowflakeconnector.proxies.DatabaseProfile asyncqueryexample_databaseprofile)
	{
		setAsyncQueryExample_DatabaseProfile(getContext(), asyncqueryexample_databaseprofile);
	}

	/**
	 * Set value of AsyncQueryExample_DatabaseProfile
	 * @param context
	 * @param asyncqueryexample_databaseprofile
	 */
	public final void setAsyncQueryExample_DatabaseProfile(com.mendix.systemwideinterfaces.core.IContext context, snowflakeconnector.proxies.DatabaseProfile asyncqueryexample_databaseprofile)
	{
		if (asyncqueryexample_databaseprofile == null) {
			getMendixObject().setValue(context, MemberNames.AsyncQueryExample_DatabaseProfile.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.AsyncQueryExample_DatabaseProfile.toString(), asyncqueryexample_databaseprofile.getMendixObject().getId());
		}
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return asyncQueryExampleMendixObject;
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
			final snowflakeconnector.proxies.AsyncQueryExample that = (snowflakeconnector.proxies.AsyncQueryExample) obj;
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
