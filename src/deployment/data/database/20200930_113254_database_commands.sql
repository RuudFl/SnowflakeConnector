ALTER TABLE "snowflakeconnector$snowflakeconfiguration" DROP COLUMN "authenticationtype";
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = '89ff3394-2fa7-464e-9efb-13373deb3b82';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20200930 11:32:52';
