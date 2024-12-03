ALTER TABLE "myfirstmodule$bankdetails" ADD "step3completed" BOOLEAN NULL;
UPDATE "myfirstmodule$bankdetails" SET "step3completed" = false;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('078ecc68-8591-43c7-8ab7-89b7be7990b1', '648a8e41-520a-4759-b0dc-fd808564a891', 'step3completed', 'step3completed', 10, 0, 'false', false);
CREATE TABLE "myfirstmodule$adressdetails" (
	"id" BIGINT NOT NULL,
	"adresstype" VARCHAR_IGNORECASE(6) NULL,
	"adressline1" VARCHAR_IGNORECASE(200) NULL,
	"adressline2" VARCHAR_IGNORECASE(200) NULL,
	"adressline3" VARCHAR_IGNORECASE(200) NULL,
	"pincode" VARCHAR_IGNORECASE(200) NULL,
	"city" VARCHAR_IGNORECASE(200) NULL,
	"state" VARCHAR_IGNORECASE(200) NULL,
	"country" VARCHAR_IGNORECASE(200) NULL,
	"residencephone" VARCHAR_IGNORECASE(200) NULL,
	"residencefax" VARCHAR_IGNORECASE(200) NULL,
	"officephone" VARCHAR_IGNORECASE(200) NULL,
	"officefax" VARCHAR_IGNORECASE(200) NULL,
	"communicationmode" VARCHAR_IGNORECASE(12) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('5b10578c-cf60-4dcb-b836-9ad036e13f49', 'MyFirstModule.adressdetails', 'myfirstmodule$adressdetails', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('3e184a69-ac7d-408a-8a1d-b5bf94837ddc', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'adresstype', 'adresstype', 40, 6, 'Indian', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('bf5d437b-4723-46d6-81a3-be92b424ad44', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'adressline1', 'adressline1', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('1c8eefdd-3e86-4ad1-9f3f-6849745eb35c', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'adressline2', 'adressline2', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('616b7bc5-4eda-456c-bb20-13f1a53763e2', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'adressline3', 'adressline3', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('5c8c3750-65c1-493a-a77e-025164ac84d3', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'pincode', 'pincode', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('ea5c1d79-6264-42f8-b5a9-75afff29a24f', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'city', 'city', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('beea4156-c8ba-4caf-aeae-d63f3a574e1f', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'state', 'state', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('9e4b6343-e889-474e-8228-650430e8393a', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'country', 'country', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('3fa6b02f-6fc1-49bb-a09b-9a2bce505e76', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'residencephone', 'residencephone', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('73c54daa-1edf-4ada-a3e4-f8c2ead9ee5d', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'residencefax', 'residencefax', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('e74b299d-2c1d-420b-ab05-f8143b2ac0c3', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'officephone', 'officephone', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('2256a1ea-a0db-4256-a686-ffb729b67dd7', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'officefax', 'officefax', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('0c684406-311d-4986-9259-e5ae6be7edbe', '5b10578c-cf60-4dcb-b836-9ad036e13f49', 'communicationmode', 'communicationmode', 40, 12, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241126 15:21:26';
