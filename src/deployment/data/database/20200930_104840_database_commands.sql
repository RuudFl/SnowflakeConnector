ALTER TABLE "snowflakeconnector$databaseprofile" DROP COLUMN "active";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '12ee0344-6bf1-4b17-8fe3-700607d6fb92';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20200930 10:43:34';
