TRUNCATE TABLE routine_days CASCADE;

INSERT INTO routine_days (id, user_id, day_of_week, name)
VALUES
('9f1a2c44-6b2e-4d8c-9a5e-1c3d9f7a1111', '23b0cf0a-0bff-47ce-ba44-46a138e0d360', 1, 'Chest & Triceps Day'),
('7a3d5e22-9c4f-4b1a-a8d2-6f1c2e8b2222', 'c90350cd-2aed-4695-9545-652801981a8d', 2, 'Back & Biceps Day');

INSERT INTO routine_day_exercises (id, routine_day_id, exercise_id, order_index)
VALUES
('a1111111-aaaa-4aaa-aaaa-aaaaaaaa0001', '9f1a2c44-6b2e-4d8c-9a5e-1c3d9f7a1111', 1, 1),
('a1111111-aaaa-4aaa-aaaa-aaaaaaaa0002', '9f1a2c44-6b2e-4d8c-9a5e-1c3d9f7a1111', 3, 2),
('a1111111-aaaa-4aaa-aaaa-aaaaaaaa0003', '9f1a2c44-6b2e-4d8c-9a5e-1c3d9f7a1111', 18, 3),
('a1111111-aaaa-4aaa-aaaa-aaaaaaaa0004', '9f1a2c44-6b2e-4d8c-9a5e-1c3d9f7a1111', 20, 4);

INSERT INTO routine_day_exercises (id, routine_day_id, exercise_id, order_index)
VALUES
('b2222222-bbbb-4bbb-bbbb-bbbbbbbb0001', '7a3d5e22-9c4f-4b1a-a8d2-6f1c2e8b2222', 6, 1),
('b2222222-bbbb-4bbb-bbbb-bbbbbbbb0002', '7a3d5e22-9c4f-4b1a-a8d2-6f1c2e8b2222', 7, 2),
('b2222222-bbbb-4bbb-bbbb-bbbbbbbb0003', '7a3d5e22-9c4f-4b1a-a8d2-6f1c2e8b2222', 8, 3),
('b2222222-bbbb-4bbb-bbbb-bbbbbbbb0004', '7a3d5e22-9c4f-4b1a-a8d2-6f1c2e8b2222', 15, 4),
('b2222222-bbbb-4bbb-bbbb-bbbbbbbb0005', '7a3d5e22-9c4f-4b1a-a8d2-6f1c2e8b2222', 17, 5);