CREATE TABLE "myfirstmodule$car" (
	"id" BIGINT NOT NULL,
	"tyre" VARCHAR_IGNORECASE(200) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", "entity_name", "table_name", "remote", "remote_primary_key") VALUES ('8ce77fda-55df-44b1-a38b-4674f29f24a8', 'MyFirstModule.car', 'myfirstmodule$car', false, false);
INSERT INTO "mendixsystem$attribute" ("id", "entity_id", "attribute_name", "column_name", "type", "length", "default_value", "is_auto_number") VALUES ('7017f39f-9bdd-4e02-bcbf-70672b2f1a69', '8ce77fda-55df-44b1-a38b-4674f29f24a8', 'tyre', 'tyre', 30, 200, '', false);
UPDATE "mendixsystem$version" SET "versionnumber" = '4.2', "lastsyncdate" = '20241129 11:25:14';
