ALTER TABLE "myfirstmodule$nominations" ADD "step6completed" BOOLEAN NULL;
UPDATE "myfirstmodule$nominations" SET "step6completed" = false;
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('dec4a60c-0067-4a8b-8840-b07d62e192c5', '501b22ba-0329-481f-87b0-9f543e493277', 'step6completed', 'step6completed', 10, 0, 'false', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241128 17:31:53';
