ALTER TABLE workouts
    DROP COLUMN IF EXISTS notes,
    DROP COLUMN IF EXISTS duration_seconds,
    DROP COLUMN IF EXISTS performed_at;

