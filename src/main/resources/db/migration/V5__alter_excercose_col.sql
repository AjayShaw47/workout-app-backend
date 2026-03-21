-- drop referencing columns first
ALTER TABLE workout_exercises DROP COLUMN exercise_id;
ALTER TABLE progress_logs DROP COLUMN exercise_id;

truncate table exercises;
-- drop the old UUID id column
ALTER TABLE exercises DROP COLUMN id;

-- add new SMALLINT identity id
ALTER TABLE exercises ADD COLUMN id SMALLINT PRIMARY KEY;

-- add exercise_id back with new type
ALTER TABLE workout_exercises
    ADD COLUMN exercise_id SMALLINT REFERENCES exercises(id) ON DELETE RESTRICT;

ALTER TABLE progress_logs
    ADD COLUMN exercise_id SMALLINT REFERENCES exercises(id) ON DELETE CASCADE;