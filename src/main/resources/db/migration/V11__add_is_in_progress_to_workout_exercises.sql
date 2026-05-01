ALTER TABLE workout_exercises ADD COLUMN in_progress BOOLEAN;

ALTER TABLE exercises DROP COLUMN IF EXISTS equipment;
