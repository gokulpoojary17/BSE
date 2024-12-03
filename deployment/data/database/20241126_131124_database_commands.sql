ALTER TABLE "myfirstmodule$holderdetails" ADD "step2completed" BOOLEAN NULL;
UPDATE "myfirstmodule$holderdetails" SET "step2completed" = false;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('994c4f62-6e15-424e-8397-2936421ed79f', '7aae4c20-32e7-47ad-83e7-9fd0050521bd', 'step2completed', 'step2completed', 10, 0, 'false', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241126 13:11:24';
