ALTER TABLE "snowflakeconnector$databaseprofile" ADD "active" BOOLEAN NULL;
UPDATE "snowflakeconnector$databaseprofile"
 SET "active" = false;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('12ee0344-6bf1-4b17-8fe3-700607d6fb92', 
'4f63e623-1d68-450d-ba37-0a3470a4595e', 
'Active', 
'active', 
10, 
0, 
'false', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20200930 10:24:48';
