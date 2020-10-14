ALTER TABLE "snowflakeconnector$asyncqueryexample" ADD "query" VARCHAR_IGNORECASE(2147483647) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('5b4ff99a-e353-46d1-8dbc-3472f6ca21e5', 
'37b8d545-70e7-4e43-a76c-454188451971', 
'Query', 
'query', 
30, 
0, 
'', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20201006 16:07:32';
