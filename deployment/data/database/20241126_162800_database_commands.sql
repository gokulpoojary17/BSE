ALTER TABLE "myfirstmodule$adressdetails" ADD "step5completed" BOOLEAN NULL;
UPDATE "myfirstmodule$adressdetails" SET "step5completed" = false;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('ffe4a032-3dd0-4311-b013-b22f8de13560', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'step5completed', 'step5completed', 10, 0, 'false', false);
CREATE TABLE "myfirstmodule$nominations" (
	"id" BIGINT NOT NULL,
	"holdername" VARCHAR_IGNORECASE(200) NULL,
	"nomineefirstname" VARCHAR_IGNORECASE(200) NULL,
	"nomineemidllename" VARCHAR_IGNORECASE(200) NULL,
	"nomineelastname" VARCHAR_IGNORECASE(200) NULL,
	"nomineeminor" VARCHAR_IGNORECASE(3) NULL,
	"nomineerelation" VARCHAR_IGNORECASE(200) NULL,
	"applicable" VARCHAR_IGNORECASE(200) NULL,
	"dateofbirth" TIMESTAMP NULL,
	"panexempt" VARCHAR_IGNORECASE(3) NULL,
	"nomineepan" VARCHAR_IGNORECASE(200) NULL,
	"nomineeauthentication" VARCHAR_IGNORECASE(16) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('501b22ba-0329-481f-87b0-9f543e493277', 'MyFirstModule.nominations', 'myfirstmodule$nominations', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('5a129709-fc34-4e20-abb8-6e2633c9c40a', '501b22ba-0329-481f-87b0-9f543e493277', 'holdername', 'holdername', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('55ed2f04-35b5-434a-afc2-3b3a7a8b74c3', '501b22ba-0329-481f-87b0-9f543e493277', 'nomineefirstname', 'nomineefirstname', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('5c6e480e-a3ef-48a8-9175-6f7d7633c710', '501b22ba-0329-481f-87b0-9f543e493277', 'nomineemidllename', 'nomineemidllename', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('20c3cb4d-6056-4adf-b098-f8d2f36c8f37', '501b22ba-0329-481f-87b0-9f543e493277', 'nomineelastname', 'nomineelastname', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('30e3fd2b-a7b7-41c5-a389-5e24b8451151', '501b22ba-0329-481f-87b0-9f543e493277', 'nomineeminor', 'nomineeminor', 40, 3, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('bd73909b-5ba4-4486-8a58-2114a50804a5', '501b22ba-0329-481f-87b0-9f543e493277', 'nomineerelation', 'nomineerelation', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('925c3dde-e900-42e9-81eb-34a28ae60f48', '501b22ba-0329-481f-87b0-9f543e493277', 'applicable', 'applicable', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('5e7fbe4f-5bcb-4bee-8cb6-154f91745803', '501b22ba-0329-481f-87b0-9f543e493277', 'dateofbirth', 'dateofbirth', 20, 0, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('58fe3b7c-5f8a-404d-ac9c-a9a30eddd31a', '501b22ba-0329-481f-87b0-9f543e493277', 'panexempt', 'panexempt', 40, 3, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('cb34a0f9-2d04-4a16-b8c3-a93e90ba9d21', '501b22ba-0329-481f-87b0-9f543e493277', 'nomineepan', 'nomineepan', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('2a4fec6e-1cce-4eed-9d22-9b4c41a7809e', '501b22ba-0329-481f-87b0-9f543e493277', 'nomineeauthentication', 'nomineeauthentication', 40, 16, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241126 16:28:00';
