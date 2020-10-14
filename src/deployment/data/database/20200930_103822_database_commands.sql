ALTER TABLE "snowflakeconnector$databaseprofile" ADD "warehouse" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('cf1cd032-ac88-4519-922c-2ecda0a275ac', 
'4f63e623-1d68-450d-ba37-0a3470a4595e', 
'Warehouse', 
'warehouse', 
30, 
200, 
'', 
false);
ALTER TABLE "snowflakeconnector$snowflakeconfiguration" DROP COLUMN "warehouse";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'bb01a623-d11b-446a-88c4-7213475ea2e5';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20200930 10:38:21';
