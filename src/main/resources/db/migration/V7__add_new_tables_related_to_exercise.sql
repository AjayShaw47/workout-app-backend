
TRUNCATE TABLE sets, workout_exercises, progress_logs, exercises;

ALTER TABLE exercises DROP COLUMN IF EXISTS category;
DROP TYPE IF EXISTS exercise_category_enum CASCADE;

CREATE TYPE tracking_type_enum AS ENUM ('STRENGTH', 'DURATION', 'DISTANCE');

ALTER TABLE exercises
    ADD COLUMN tracking_type tracking_type_enum NOT NULL;

ALTER TABLE exercises
    DROP COLUMN IF EXISTS instructions,
    DROP COLUMN IF EXISTS is_custom,
    DROP COLUMN IF EXISTS created_by,
    DROP COLUMN IF EXISTS muscle_group,
    DROP COLUMN IF EXISTS created_at;

-- master list of all muscle groups
CREATE TABLE muscle_groups (
    id    SMALLINT     PRIMARY KEY,
    name  VARCHAR(100) NOT NULL UNIQUE
);

-- links exercises to muscle groups with a role
CREATE TABLE exercise_muscle_groups (
    exercise_id   SMALLINT    NOT NULL REFERENCES exercises(id) ON DELETE CASCADE,
    muscle_group_id SMALLINT  NOT NULL REFERENCES muscle_groups(id) ON DELETE CASCADE,
    is_primary    BOOLEAN     NOT NULL DEFAULT FALSE,

    PRIMARY KEY (exercise_id, muscle_group_id)
);

CREATE TABLE routine_days (
    id          UUID         PRIMARY KEY DEFAULT gen_random_uuid(),
    user_id     UUID         NOT NULL REFERENCES users(id) ON DELETE CASCADE,
    day_of_week SMALLINT     NOT NULL CHECK (day_of_week BETWEEN 1 AND 7),
    name        VARCHAR(150),
    created_at  TIMESTAMPTZ  NOT NULL DEFAULT NOW(),

    UNIQUE (user_id, day_of_week)
);

CREATE TABLE routine_day_exercises (
    id              UUID     PRIMARY KEY DEFAULT gen_random_uuid(),
    routine_day_id  UUID     NOT NULL REFERENCES routine_days(id) ON DELETE CASCADE,
    exercise_id     SMALLINT NOT NULL REFERENCES exercises(id),
    order_index     INT      NOT NULL,

    UNIQUE (routine_day_id, order_index)
);
