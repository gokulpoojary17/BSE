CREATE TABLE "myfirstmodule$bankdetails" (
	"id" BIGINT NOT NULL,
	"pupose" VARCHAR_IGNORECASE(4) NULL,
	"accounttype" VARCHAR_IGNORECASE(7) NULL,
	"accountno" VARCHAR_IGNORECASE(200) NULL,
	"bankname" VARCHAR_IGNORECASE(200) NULL,
	"branchname" VARCHAR_IGNORECASE(200) NULL,
	"ifsc" VARCHAR_IGNORECASE(200) NULL,
	"bankcity" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('648a8e41-520a-4759-b0dc-fd808564a891', 'MyFirstModule.bankdetails', 'myfirstmodule$bankdetails', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('4af34387-325d-4428-95c7-b4af03294dae', '648a8e41-520a-4759-b0dc-fd808564a891', 'pupose', 'pupose', 40, 4, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('569b9418-aafe-4106-99df-1cd85cd3c141', '648a8e41-520a-4759-b0dc-fd808564a891', 'accounttype', 'accounttype', 40, 7, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('a8bef515-abe2-4396-ae08-6097378df3f1', '648a8e41-520a-4759-b0dc-fd808564a891', 'accountno', 'accountno', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('f90ffddc-b035-4606-9f46-7d186792c055', '648a8e41-520a-4759-b0dc-fd808564a891', 'bankname', 'bankname', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('1e4bdb16-b736-406a-81d7-b1c07badf54d', '648a8e41-520a-4759-b0dc-fd808564a891', 'branchname', 'branchname', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('1cf8748a-e9a1-4796-b0d5-d38f802728d2', '648a8e41-520a-4759-b0dc-fd808564a891', 'ifsc', 'ifsc', 30, 200, '', false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('8fd003d5-1db7-4c6e-bfe6-3e119706c932', '648a8e41-520a-4759-b0dc-fd808564a891', 'bankcity', 'bankcity', 30, 200, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241126 14:30:37';
