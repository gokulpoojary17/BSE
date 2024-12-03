CREATE TABLE "myfirstmodule$holderdetails" (
	"id" BIGINT NOT NULL,
	"panexcempt" VARCHAR_IGNORECASE(3) NULL,
	"pan" VARCHAR_IGNORECASE(200) NULL,
	"firstname" VARCHAR_IGNORECASE(200) NULL,
	"lastname" VARCHAR_IGNORECASE(200) NULL,
	"dateofregister" TIMESTAMP NULL,
	"gender" VARCHAR_IGNORECASE(6) NULL,
	"occupation" VARCHAR_IGNORECASE(200) NULL,
	"taxstatus" VARCHAR_IGNORECASE(20) NULL,
	"kyctype" VARCHAR_IGNORECASE(13) NULL,
	"mobilenumber" INT NULL,
	"mobiledeclaration" VARCHAR_IGNORECASE(200) NULL,
	"emailid" VARCHAR_IGNORECASE(200) NULL,
	"emaildeclaration" VARCHAR_IGNORECASE(200) NULL,
	"pancategory" VARCHAR_IGNORECASE(19) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'MyFirstModule.holderdetails', 'myfirstmodule$holderdetails', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('017092e7-c58e-4bea-b9d7-2866219d5cfc', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'panexcempt', 'panexcempt', 40, 3, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('4a1b6df4-a7b6-4ec6-afd2-aa7a7ce43c3d', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'pan', 'pan', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('41effe9d-bc2c-4990-af12-59f9cd74bcab', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'firstname', 'firstname', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('b4f50057-5029-4889-ab92-5acd419d3ec7', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'lastname', 'lastname', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('7f902d23-a060-45c2-8186-1b872799598f', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'dateofregister', 'dateofregister', 20, 0, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('29bd5829-a906-4767-b451-799456677bf7', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'gender', 'gender', 40, 6, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('399e1962-9d61-470a-9bd9-1805faef51be', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'occupation', 'occupation', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('8bfbba8a-aa82-4bec-b602-604d26ffc0a1', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'taxstatus', 'taxstatus', 40, 20, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('07e903fc-fa48-4d27-bd83-36f65cd7c5d1', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'kyctype', 'kyctype', 40, 13, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('9c7fa6af-e116-49ca-a6ba-6ba19b5c2367', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'mobilenumber', 'mobilenumber', 3, 0, '0', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('72296e94-7a25-4a28-ae7f-ffc2e08c5093', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'mobiledeclaration', 'mobiledeclaration', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('ff2f7356-c237-4559-8d81-85082753fd76', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'emailid', 'emailid', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('b646a517-4564-469f-aadd-c3b4410ac90c', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'emaildeclaration', 'emaildeclaration', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('f5b9d73b-782d-4b48-af46-cf1452c36190', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'pancategory', 'pancategory', 40, 19, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241126 11:36:59';
