ALTER TABLE users
    ADD COLUMN role           user_role_enum NOT NULL DEFAULT 'USER',
    ADD COLUMN oauth_provider oauth_provider_enum;