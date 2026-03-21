ALTER TABLE USERS DROP COLUMN is_active;
DROP TYPE IF EXISTS oauth_provider_enum       CASCADE;
DROP TYPE IF EXISTS user_role_enum            CASCADE;
CREATE TYPE oauth_provider_enum       AS ENUM ('GOOGLE', 'APPLE', 'FACEBOOK');
CREATE TYPE user_role_enum            AS ENUM ('USER', 'ADMIN');