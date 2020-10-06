# SnowflakeConnector
Manage snowflake connections in your Mendix project and execute (async) queries from a microflow.

# Setup
This module extends current Database Connector module and creates a configuration layer for connecting to snowflake and manage multiple connection / database profiles. 

1) Import the module in your Mx project

2) Add the administrator role from this module to one of the administrator roles in your app. 

3) Connect 'SnowflakeConfiguration' page to your app configuration.

4) Create at least 1 configuration and 1 database profile for each created configuration. You can use multiple database profiles for a configuration to access multiple databases/schema's with different warehouses for the same snowflake enterprise account and role. Test your created database profiles by clicking 'Test Database connection' on the bottom grid of the configuration page.

# Usage

See example SF_TestResult_ExecuteQuery which is also used from the database test microflow (AT_DatabaseProfile_JdbcConnectionTest). This module uses the database connector activities and libraries as a base, so you need to create and specify the non peristent result object for your query and select it in the database activity within SF_TestResult_ExecuteQuery.

Use ConnectionBuilder_Create to collect all needed connectionparameters needed for the database connector.

Passwords are stored and encrypted using the Encryption module.

To easily test the connection side of the snowflake connection, use SQL: select current_version() as "Version". This example can be triggered from the configuration page with the 'test connectivity' button.

Async Queries

In case of long running queries, you have the possibilty to use the snowflake specific executeAsyncQuery method to run a query async and retrieve the results later. See an example in AT_AsyncQueryExample_Create. You can retrieve the status of the async query as an enumeration value of try to retrieve the results immediately. See AT_AsyncQueryExample_* for an example. Async Query test results and test actions are displayed in a grid on the 2nd tab on the configuration page.

# Dependencies

[Database Connector 2.3.0](https://github.com/mendix/database-connector)
[Encryption Module](https://appstore.home.mendix.com/link/app/1011/)

# Useful links

[Snowflake Query Syntax](https://docs.snowflake.com/en/sql-reference/constructs.html)
[Using the JDBC Driver](https://docs.snowflake.com/en/user-guide/jdbc-using.html)
[JDBC Driver API Support](https://docs.snowflake.com/en/user-guide/jdbc-api.html)

