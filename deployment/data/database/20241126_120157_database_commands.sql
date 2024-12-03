ALTER TABLE "myfirstmodule$holderdetails" ADD "middlename" VARCHAR_IGNORECASE(200) NULL;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('eb59e791-c8ab-4cab-b976-c88c044af6d1', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'middlename', 'middlename', 30, 200, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241126 12:01:57';
