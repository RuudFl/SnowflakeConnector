ALTER TABLE "snowflakeconnector$snowflakeconfiguration" ADD "useprivatelink" BOOLEAN NULL;
UPDATE "snowflakeconnector$snowflakeconfiguration"
 SET "useprivatelink" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('57f23ed3-1529-481e-80cb-8a910b4bb04f', 
'4a0c9c29-ef1e-41ab-b5bd-16b8ccc61537', 
'UsePrivateLink', 
'useprivatelink', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20200930 11:45:08';
