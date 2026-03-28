-- Rename lowercase enum values to uppercase
ALTER TYPE set_type_enum RENAME VALUE 'normal' TO 'NORMAL';
ALTER TYPE set_type_enum RENAME VALUE 'warmup' TO 'WARMUP';
ALTER TYPE set_type_enum RENAME VALUE 'dropset' TO 'DROPSET';

ALTER TABLE sets
ALTER COLUMN set_type SET DEFAULT 'NORMAL';

ALTER TABLE workout_exercises
DROP COLUMN IF EXISTS superset_group;
