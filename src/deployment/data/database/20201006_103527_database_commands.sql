CREATE TABLE "snowflakeconnector$asyncqueryexample" (
	"id" BIGINT NOT NULL,
	"status" VARCHAR_IGNORECASE(18) NULL,
	"createddate" TIMESTAMP NULL,
	"message" VARCHAR_IGNORECASE(2147483647) NULL,
	"queryid" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('37b8d545-70e7-4e43-a76c-454188451971', 
'SnowflakeConnector.AsyncQueryExample', 
'snowflakeconnector$asyncqueryexample');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('57ea5709-07f7-414b-a643-66325ceb4718', 
'37b8d545-70e7-4e43-a76c-454188451971', 
'Status', 
'status', 
40, 
18, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('97f23ba8-4884-3952-9b10-5911e9aa5189', 
'37b8d545-70e7-4e43-a76c-454188451971', 
'createdDate', 
'createddate', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('33282674-b517-45fb-9a34-79d2af8ad185', 
'37b8d545-70e7-4e43-a76c-454188451971', 
'Message', 
'message', 
30, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('79606f5b-8033-4b2e-919e-bfdbd632ff02', 
'37b8d545-70e7-4e43-a76c-454188451971', 
'QueryId', 
'queryid', 
30, 
200, 
'', 
false);
CREATE TABLE "snowflakeconnector$asyncqueryexample_databaseprofile" (
	"snowflakeconnector$asyncqueryexampleid" BIGINT NOT NULL,
	"snowflakeconnector$databaseprofileid" BIGINT NOT NULL,
	PRIMARY KEY("snowflakeconnector$asyncqueryexampleid","snowflakeconnector$databaseprofileid"),
	CONSTRAINT "uniq_snowflakeconnector$asyncqueryexample_databaseprofile_snowflakeconnector$asyncqueryexampleid" UNIQUE ("snowflakeconnector$asyncqueryexampleid"));
CREATE INDEX "idx_snowflakeconnector$asyncqueryexample_databaseprofile_snowflakeconnector$databaseprofile_snowflakeconnector$asyncqueryexample" ON "snowflakeconnector$asyncqueryexample_databaseprofile" ("snowflakeconnector$databaseprofileid" ASC,"snowflakeconnector$asyncqueryexampleid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('14461e8c-8a8a-4129-8d3a-af783bb3552f', 
'SnowflakeConnector.AsyncQueryExample_DatabaseProfile', 
'snowflakeconnector$asyncqueryexample_databaseprofile', 
'37b8d545-70e7-4e43-a76c-454188451971', 
'4f63e623-1d68-450d-ba37-0a3470a4595e', 
'snowflakeconnector$asyncqueryexampleid', 
'snowflakeconnector$databaseprofileid', 
'idx_snowflakeconnector$asyncqueryexample_databaseprofile_snowflakeconnector$databaseprofile_snowflakeconnector$asyncqueryexample');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_snowflakeconnector$asyncqueryexample_databaseprofile_snowflakeconnector$asyncqueryexampleid', 
'14461e8c-8a8a-4129-8d3a-af783bb3552f', 
'5c82c6ed-6526-369b-82c6-99ce329cc96c');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20201006 10:35:24';
