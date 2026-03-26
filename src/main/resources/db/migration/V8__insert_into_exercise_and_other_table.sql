-- ============================================
-- MUSCLE GROUPS (Corrected IDs)
-- ============================================
INSERT INTO muscle_groups (id, name) VALUES
(1, 'Mid Chest'),
(2, 'Upper Chest'),
(3, 'Lower Chest'),
(4, 'Front Delts'),
(5, 'Side Delts'),
(6, 'Rear Delts'),
(7, 'Traps'),
(8, 'Lats'),
(9, 'Rhomboids'),
(10, 'Lower Back'),
(11, 'Biceps'),
(12, 'Triceps'),
(13, 'Forearms'),
(14, 'Abs'),
(15, 'Obliques'),
(16, 'Quads'),
(17, 'Hamstrings'),
(18, 'Glutes'),
(19, 'Calves'),
(20, 'Full Body');

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(1, 'Flat Bench Press', 'Barbell', 'STRENGTH'),
(2, 'Flat Bench Press', 'Dumbbells', 'STRENGTH'),
(3, 'Flat Bench Press', 'Smith Machine', 'STRENGTH'),
(4, 'Flat Bench Press', 'Chest Press Machine', 'STRENGTH'),
(5, 'Cable Fly', 'Cable', 'STRENGTH'),
(6, 'Incline Bench Press', 'Barbell', 'STRENGTH'),
(7, 'Incline Bench Press', 'Dumbbells', 'STRENGTH'),
(8, 'Incline Bench Press', 'Smith Machine', 'STRENGTH'),
(9, 'Incline Bench Press', 'Chest Press Machine', 'STRENGTH'),
(10, 'Low To High Cable Fly', 'Cable', 'STRENGTH'),
(11, 'Decline Bench Press', 'Barbell', 'STRENGTH'),
(12, 'Decline Bench Press', 'Dumbbells', 'STRENGTH'),
(13, 'Decline Bench Press', 'Smith Machine', 'STRENGTH'),
(14, 'Decline Bench Press', 'Chest Press Machine', 'STRENGTH'),
(15, 'High To Low Cable Fly', 'Cable', 'STRENGTH'),
(16, 'Flat Dumbbell Fly', 'Dumbbells', 'STRENGTH'),
(17, 'Incline Dumbbell Fly', 'Dumbbells', 'STRENGTH'),
(18, 'Flat Cable Fly', 'Cable', 'STRENGTH'),
(19, 'Incline Cable Fly', 'Cable', 'STRENGTH'),
(20, 'Pec Deck Fly', 'Machine', 'STRENGTH'),
(21, 'Push-Up', 'Bodyweight', 'STRENGTH'),
(22, 'Incline Push-Up', 'Bodyweight', 'STRENGTH'),
(23, 'Decline Push-Up', 'Bodyweight', 'STRENGTH'),
(24, 'Parallel Bar Dip', 'Dip Station', 'STRENGTH'),
(25, 'Weighted Dip', 'Dip Station', 'STRENGTH'),
(26, 'Bench Dip', 'Bench', 'STRENGTH'),
(27, 'Close Grip Bench Press', 'Barbell', 'STRENGTH'),
(28, 'Close Grip Dumbbell Press', 'Dumbbells', 'STRENGTH'),
(29, 'Barbell Floor Press', 'Barbell', 'STRENGTH'),
(30, 'Dumbbell Floor Press', 'Dumbbells', 'STRENGTH'),
(31, 'Landmine Press', 'Landmine', 'STRENGTH'),
(32, 'One-Arm Landmine Press', 'Landmine', 'STRENGTH'),
(33, 'Dumbbell Pullover', 'Dumbbells', 'STRENGTH'),
(34, 'Barbell Pullover', 'Barbell', 'STRENGTH'),
(35, 'Cable Pullover', 'Cable', 'STRENGTH');

-- ============================================
-- SHOULDER EXERCISES (ID 36-60)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(36, 'Barbell Overhead Press', 'Barbell', 'STRENGTH'),
(37, 'Dumbbell Overhead Press', 'Dumbbells', 'STRENGTH'),
(38, 'Smith Machine Overhead Press', 'Smith Machine', 'STRENGTH'),
(39, 'Machine Shoulder Press', 'Machine', 'STRENGTH'),
(40, 'Arnold Press', 'Dumbbells', 'STRENGTH'),
(41, 'Dumbbell Lateral Raise', 'Dumbbells', 'STRENGTH'),
(42, 'Cable Lateral Raise', 'Cable', 'STRENGTH'),
(43, 'Machine Lateral Raise', 'Machine', 'STRENGTH'),
(44, 'One-Arm Cable Lateral Raise', 'Cable', 'STRENGTH'),
(45, 'Barbell Front Raise', 'Barbell', 'STRENGTH'),
(46, 'Dumbbell Front Raise', 'Dumbbells', 'STRENGTH'),
(47, 'Cable Front Raise', 'Cable', 'STRENGTH'),
(48, 'Plate Front Raise', 'Plate', 'STRENGTH'),
(49, 'Kettlebell Front Raise', 'Kettlebell', 'STRENGTH'),
(50, 'Dumbbell Rear Delt Fly', 'Dumbbells', 'STRENGTH'),
(51, 'Cable Rear Delt Fly', 'Cable', 'STRENGTH'),
(52, 'Reverse Pec Deck', 'Machine', 'STRENGTH'),
(53, 'Face Pull', 'Cable', 'STRENGTH'),
(54, 'Reverse Cable Crossover', 'Cable', 'STRENGTH');

-- ============================================
-- BACK EXERCISES (ID 55-90)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(55, 'Barbell Deadlift', 'Barbell', 'STRENGTH'),
(56, 'Romanian Deadlift', 'Barbell', 'STRENGTH'),
(57, 'Stiff-Legged Deadlift', 'Barbell', 'STRENGTH'),
(58, 'Dumbbell Deadlift', 'Dumbbells', 'STRENGTH'),
(59, 'Dumbbell Romanian Deadlift', 'Dumbbells', 'STRENGTH'),
(60, 'Smith Machine Deadlift', 'Smith Machine', 'STRENGTH'),
(61, 'Smith Machine Romanian Deadlift', 'Smith Machine', 'STRENGTH'),
(62, 'Barbell Bent Over Row', 'Barbell', 'STRENGTH'),
(63, 'Pendlay Row', 'Barbell', 'STRENGTH'),
(64, 'Yates Row', 'Barbell', 'STRENGTH'),
(65, 'Dumbbell Bent Over Row', 'Dumbbells', 'STRENGTH'),
(66, 'One-Arm Dumbbell Row', 'Dumbbells', 'STRENGTH'),
(67, 'Chest Supported Dumbbell Row', 'Dumbbells', 'STRENGTH'),
(68, 'T-Bar Row', 'T-Bar', 'STRENGTH'),
(69, 'Meadows Row', 'Barbell', 'STRENGTH'),
(70, 'Cable Seated Row', 'Cable', 'STRENGTH'),
(71, 'Cable Wide Grip Seated Row', 'Cable', 'STRENGTH'),
(72, 'Cable Close Grip Seated Row', 'Cable', 'STRENGTH'),
(73, 'One-Arm Cable Row', 'Cable', 'STRENGTH'),
(74, 'Machine Seated Row', 'Machine', 'STRENGTH'),
(75, 'Chest Supported Machine Row', 'Machine', 'STRENGTH'),
(76, 'Smith Machine Bent Over Row', 'Smith Machine', 'STRENGTH'),
(77, 'Pull-Up', 'Pull-Up Bar', 'STRENGTH'),
(78, 'Chin-Up', 'Pull-Up Bar', 'STRENGTH'),
(79, 'Neutral Grip Pull-Up', 'Pull-Up Bar', 'STRENGTH'),
(80, 'Wide Grip Pull-Up', 'Pull-Up Bar', 'STRENGTH'),
(81, 'Close Grip Pull-Up', 'Pull-Up Bar', 'STRENGTH'),
(82, 'Assisted Pull-Up', 'Assisted Machine', 'STRENGTH'),
(83, 'Assisted Chin-Up', 'Assisted Machine', 'STRENGTH'),
(84, 'Lat Pulldown', 'Cable', 'STRENGTH'),
(85, 'Wide Grip Lat Pulldown', 'Cable', 'STRENGTH'),
(86, 'Close Grip Lat Pulldown', 'Cable', 'STRENGTH'),
(87, 'Neutral Grip Lat Pulldown', 'Cable', 'STRENGTH'),
(88, 'Reverse Grip Lat Pulldown', 'Cable', 'STRENGTH'),
(89, 'Single Arm Lat Pulldown', 'Cable', 'STRENGTH'),
(90, 'Straight Arm Lat Pulldown', 'Cable', 'STRENGTH'),
(91, 'Rope Pulldown', 'Cable', 'STRENGTH'),
(92, 'Machine Lat Pulldown', 'Machine', 'STRENGTH'),
(93, 'Barbell Shrug', 'Barbell', 'STRENGTH'),
(94, 'Dumbbell Shrug', 'Dumbbells', 'STRENGTH'),
(95, 'Smith Machine Shrug', 'Smith Machine', 'STRENGTH'),
(96, 'Cable Shrug', 'Cable', 'STRENGTH'),
(97, 'Machine Shrug', 'Machine', 'STRENGTH'),
(98, 'Farmer Walk', 'Dumbbells', 'STRENGTH'),
(99, 'Trap Bar Farmer Walk', 'Trap Bar', 'STRENGTH');

-- ============================================
-- BICEPS EXERCISES (ID 100-125)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(100, 'Barbell Curl', 'Barbell', 'STRENGTH'),
(101, 'EZ Bar Curl', 'EZ Bar', 'STRENGTH'),
(102, 'Dumbbell Curl', 'Dumbbells', 'STRENGTH'),
(103, 'Seated Dumbbell Curl', 'Dumbbells', 'STRENGTH'),
(104, 'Incline Dumbbell Curl', 'Dumbbells', 'STRENGTH'),
(105, 'Hammer Curl', 'Dumbbells', 'STRENGTH'),
(106, 'Incline Hammer Curl', 'Dumbbells', 'STRENGTH'),
(107, 'Preacher Curl', 'Barbell', 'STRENGTH'),
(108, 'EZ Bar Preacher Curl', 'EZ Bar', 'STRENGTH'),
(109, 'Dumbbell Preacher Curl', 'Dumbbells', 'STRENGTH'),
(110, 'Concentration Curl', 'Dumbbells', 'STRENGTH'),
(111, 'Spider Curl', 'Dumbbells', 'STRENGTH'),
(112, 'Drag Curl', 'Barbell', 'STRENGTH'),
(113, 'Cable Curl', 'Cable', 'STRENGTH'),
(114, 'Cable Rope Curl', 'Cable', 'STRENGTH'),
(115, 'Overhead Cable Curl', 'Cable', 'STRENGTH'),
(116, 'Bayesian Curl', 'Cable', 'STRENGTH'),
(117, 'Lying Cable Curl', 'Cable', 'STRENGTH'),
(118, 'Machine Bicep Curl', 'Machine', 'STRENGTH'),
(119, 'Zottman Curl', 'Dumbbells', 'STRENGTH'),
(120, 'Reverse Barbell Curl', 'Barbell', 'STRENGTH'),
(121, 'Reverse Dumbbell Curl', 'Dumbbells', 'STRENGTH'),
(122, 'Cross Body Hammer Curl', 'Dumbbells', 'STRENGTH'),
(123, 'Waiter Curl', 'Dumbbells', 'STRENGTH'),
(124, 'Bodyweight Curl', 'Bodyweight', 'STRENGTH'),
(125, 'Cable Crossover Curl', 'Cable', 'STRENGTH');

-- ============================================
-- TRICEPS EXERCISES (ID 126-150)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(126, 'Barbell Lying Triceps Extension', 'Barbell', 'STRENGTH'),
(127, 'EZ Bar Skull Crusher', 'EZ Bar', 'STRENGTH'),
(128, 'Dumbbell Lying Triceps Extension', 'Dumbbells', 'STRENGTH'),
(129, 'Dumbbell Overhead Triceps Extension', 'Dumbbells', 'STRENGTH'),
(130, 'Barbell Overhead Triceps Extension', 'Barbell', 'STRENGTH'),
(131, 'Cable Overhead Triceps Extension', 'Cable', 'STRENGTH'),
(132, 'Cable Triceps Pushdown', 'Cable', 'STRENGTH'),
(133, 'Cable Rope Pushdown', 'Cable', 'STRENGTH'),
(134, 'Cable V-Bar Pushdown', 'Cable', 'STRENGTH'),
(135, 'Cable Single Arm Pushdown', 'Cable', 'STRENGTH'),
(136, 'Machine Triceps Extension', 'Machine', 'STRENGTH'),
(137, 'Machine Overhead Triceps Extension', 'Machine', 'STRENGTH'),
(138, 'Smith Machine Skull Crusher', 'Smith Machine', 'STRENGTH'),
(139, 'Close Grip Bench Press', 'Barbell', 'STRENGTH'),
(140, 'Close Grip Dumbbell Press', 'Dumbbells', 'STRENGTH'),
(141, 'Close Grip Push-Up', 'Bodyweight', 'STRENGTH'),
(142, 'Diamond Push-Up', 'Bodyweight', 'STRENGTH'),
(143, 'Bench Dip', 'Bench', 'STRENGTH'),
(144, 'Weighted Bench Dip', 'Dip Station', 'STRENGTH'),
(145, 'Parallel Bar Dip', 'Dip Station', 'STRENGTH'),
(146, 'JM Press', 'Barbell', 'STRENGTH'),
(147, 'Bodyweight Triceps Extension', 'Bodyweight', 'STRENGTH'),
(148, 'Crossbody Triceps Extension', 'Cable', 'STRENGTH'),
(149, 'Kickback', 'Dumbbells', 'STRENGTH'),
(150, 'Cable Kickback', 'Cable', 'STRENGTH');

-- ============================================
-- QUADRICEPS EXERCISES (ID 151-195)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(151, 'Barbell Back Squat', 'Barbell', 'STRENGTH'),
(152, 'Barbell Front Squat', 'Barbell', 'STRENGTH'),
(153, 'High Bar Squat', 'Barbell', 'STRENGTH'),
(154, 'Low Bar Squat', 'Barbell', 'STRENGTH'),
(155, 'Anderson Squat', 'Barbell', 'STRENGTH'),
(156, 'Goblet Squat', 'Dumbbells', 'STRENGTH'),
(157, 'Dumbbell Squat', 'Dumbbells', 'STRENGTH'),
(158, 'Dumbbell Front Squat', 'Dumbbells', 'STRENGTH'),
(159, 'Landmine Squat', 'Landmine', 'STRENGTH'),
(160, 'Smith Machine Squat', 'Smith Machine', 'STRENGTH'),
(161, 'Smith Machine Front Squat', 'Smith Machine', 'STRENGTH'),
(162, 'Hack Squat Machine', 'Machine', 'STRENGTH'),
(163, 'Belt Squat', 'Belt Squat Machine', 'STRENGTH'),
(164, 'Pendulum Squat', 'Machine', 'STRENGTH'),
(165, 'V-Squat Machine', 'Machine', 'STRENGTH'),
(166, 'Leg Press', 'Machine', 'STRENGTH'),
(167, 'Single Leg Press', 'Machine', 'STRENGTH'),
(168, 'Vertical Leg Press', 'Machine', 'STRENGTH'),
(169, 'Sissy Squat Machine', 'Machine', 'STRENGTH'),
(170, 'Spanish Squat', 'Resistance Band', 'STRENGTH'),
(171, 'Barbell Lunge', 'Barbell', 'STRENGTH'),
(172, 'Barbell Walking Lunge', 'Barbell', 'STRENGTH'),
(173, 'Barbell Reverse Lunge', 'Barbell', 'STRENGTH'),
(174, 'Dumbbell Lunge', 'Dumbbells', 'STRENGTH'),
(175, 'Dumbbell Walking Lunge', 'Dumbbells', 'STRENGTH'),
(176, 'Dumbbell Reverse Lunge', 'Dumbbells', 'STRENGTH'),
(177, 'Dumbbell Lateral Lunge', 'Dumbbells', 'STRENGTH'),
(178, 'Dumbbell Curtsy Lunge', 'Dumbbells', 'STRENGTH'),
(179, 'Bodyweight Lunge', 'Bodyweight', 'STRENGTH'),
(180, 'Bodyweight Walking Lunge', 'Bodyweight', 'STRENGTH'),
(181, 'Bodyweight Reverse Lunge', 'Bodyweight', 'STRENGTH'),
(182, 'Jumping Lunge', 'Bodyweight', 'STRENGTH'),
(183, 'Bulgarian Split Squat', 'Dumbbells', 'STRENGTH'),
(184, 'Barbell Bulgarian Split Squat', 'Barbell', 'STRENGTH'),
(185, 'Smith Machine Bulgarian Split Squat', 'Smith Machine', 'STRENGTH'),
(186, 'Deficit Bulgarian Split Squat', 'Dumbbells', 'STRENGTH'),
(187, 'Step Up', 'Dumbbells', 'STRENGTH'),
(188, 'Barbell Step Up', 'Barbell', 'STRENGTH'),
(189, 'Lateral Step Up', 'Dumbbells', 'STRENGTH'),
(190, 'Poliquin Step Up', 'Dumbbells', 'STRENGTH'),
(191, 'Pistol Squat', 'Bodyweight', 'STRENGTH'),
(192, 'Assisted Pistol Squat', 'Resistance Band', 'STRENGTH'),
(193, 'Shrimp Squat', 'Bodyweight', 'STRENGTH'),
(194, 'Cossack Squat', 'Bodyweight', 'STRENGTH'),
(195, 'Dumbbell Cossack Squat', 'Dumbbells', 'STRENGTH');

-- ============================================
-- HAMSTRINGS/GLUTES EXERCISES (ID 196-220)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(196, 'Leg Extension', 'Machine', 'STRENGTH'),
(197, 'Single Leg Extension', 'Machine', 'STRENGTH'),
(198, 'Sissy Squat', 'Bodyweight', 'STRENGTH'),
(199, 'Wall Sit', 'Bodyweight', 'STRENGTH'),
(200, 'Barbell Romanian Deadlift', 'Barbell', 'STRENGTH'),
(201, 'Dumbbell Romanian Deadlift', 'Dumbbells', 'STRENGTH'),
(202, 'Barbell Stiff Leg Deadlift', 'Barbell', 'STRENGTH'),
(203, 'Dumbbell Stiff Leg Deadlift', 'Dumbbells', 'STRENGTH'),
(204, 'Lying Leg Curl', 'Machine', 'STRENGTH'),
(205, 'Seated Leg Curl', 'Machine', 'STRENGTH'),
(206, 'Standing Leg Curl', 'Machine', 'STRENGTH'),
(207, 'Single Leg Lying Leg Curl', 'Machine', 'STRENGTH'),
(208, 'Single Leg Seated Leg Curl', 'Machine', 'STRENGTH'),
(209, 'Nordic Hamstring Curl', 'Bodyweight', 'STRENGTH'),
(210, 'Assisted Nordic Hamstring Curl', 'Resistance Band', 'STRENGTH'),
(211, 'Glute-Ham Raise', 'Glute Ham Developer', 'STRENGTH'),
(212, 'Back Extension', 'Back Extension Machine', 'STRENGTH'),
(213, 'Weighted Back Extension', 'Back Extension Machine', 'STRENGTH'),
(214, 'Reverse Hyperextension', 'Reverse Hyper Machine', 'STRENGTH'),
(215, 'Barbell Hip Thrust', 'Barbell', 'STRENGTH'),
(216, 'Smith Machine Hip Thrust', 'Smith Machine', 'STRENGTH'),
(217, 'Dumbbell Hip Thrust', 'Dumbbells', 'STRENGTH'),
(218, 'Hip Thrust Machine', 'Machine', 'STRENGTH'),
(219, 'Banded Hip Thrust', 'Resistance Band', 'STRENGTH'),
(220, 'Glute Bridge', 'Bodyweight', 'STRENGTH');

-- ============================================
-- GLUTES/LEGS CONTINUED (ID 221-235)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(221, 'Weighted Glute Bridge', 'Barbell', 'STRENGTH'),
(222, 'Cable Glute Kickback', 'Cable', 'STRENGTH'),
(223, 'Machine Glute Kickback', 'Machine', 'STRENGTH'),
(224, 'Reverse Lunge', 'Dumbbells', 'STRENGTH'),
(225, 'Walking Lunge', 'Dumbbells', 'STRENGTH');

-- ============================================
-- CALVES EXERCISES (ID 226-240)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(226, 'Standing Barbell Calf Raise', 'Barbell', 'STRENGTH'),
(227, 'Standing Dumbbell Calf Raise', 'Dumbbells', 'STRENGTH'),
(228, 'Standing Machine Calf Raise', 'Machine', 'STRENGTH'),
(229, 'Seated Barbell Calf Raise', 'Barbell', 'STRENGTH'),
(230, 'Seated Dumbbell Calf Raise', 'Dumbbells', 'STRENGTH'),
(231, 'Seated Machine Calf Raise', 'Machine', 'STRENGTH'),
(232, 'Leg Press Calf Raise', 'Machine', 'STRENGTH'),
(233, 'Bodyweight Calf Raise', 'Bodyweight', 'STRENGTH'),
(234, 'Single Leg Calf Raise', 'Dumbbells', 'STRENGTH');

-- ============================================
-- CORE EXERCISES (ID 235-265)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(235, 'Plank', 'Bodyweight', 'DURATION'),
(236, 'Weighted Plank', 'Plate', 'DURATION'),
(237, 'Crunch', 'Bodyweight', 'STRENGTH'),
(238, 'Weighted Crunch', 'Plate', 'STRENGTH'),
(239, 'Machine Crunch', 'Machine', 'STRENGTH'),
(240, 'Cable Crunch', 'Cable', 'STRENGTH'),
(241, 'Bicycle Crunch', 'Bodyweight', 'STRENGTH'),
(242, 'Reverse Crunch', 'Bodyweight', 'STRENGTH'),
(243, 'Hanging Leg Raise', 'Pull-Up Bar', 'STRENGTH'),
(244, 'Hanging Knee Raise', 'Pull-Up Bar', 'STRENGTH'),
(245, 'Lying Leg Raise', 'Bodyweight', 'STRENGTH'),
(246, 'Toes to Bar', 'Pull-Up Bar', 'STRENGTH'),
(247, 'Knees to Elbows', 'Pull-Up Bar', 'STRENGTH'),
(248, 'Russian Twist', 'Bodyweight', 'STRENGTH'),
(249, 'Weighted Russian Twist', 'Medicine Ball', 'STRENGTH'),
(250, 'Cable Woodchop High to Low', 'Cable', 'STRENGTH'),
(251, 'Cable Woodchop Low to High', 'Cable', 'STRENGTH'),
(252, 'Cable Horizontal Woodchop', 'Cable', 'STRENGTH'),
(253, 'Dumbbell Side Bend', 'Dumbbells', 'STRENGTH'),
(254, 'Cable Side Bend', 'Cable', 'STRENGTH');

-- ============================================
-- FOREARMS EXERCISES (ID 255-270)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(255, 'Barbell Wrist Curl', 'Barbell', 'STRENGTH'),
(256, 'Dumbbell Wrist Curl', 'Dumbbells', 'STRENGTH'),
(257, 'Barbell Reverse Wrist Curl', 'Barbell', 'STRENGTH'),
(258, 'Dumbbell Reverse Wrist Curl', 'Dumbbells', 'STRENGTH'),
(259, 'Behind the Back Wrist Curl', 'Barbell', 'STRENGTH'),
(260, 'Plate Pinch', 'Plate', 'DURATION'),
(261, 'Dead Hang', 'Pull-Up Bar', 'DURATION'),
(262, 'One Arm Dead Hang', 'Pull-Up Bar', 'DURATION'),
(263, 'Gripper Squeeze', 'Gripper', 'STRENGTH'),
(264, 'Wrist Roller', 'Wrist Roller', 'STRENGTH'),
(265, 'Sledgehammer Lever', 'Sledgehammer', 'STRENGTH'),
(266, 'Reverse Curl', 'Barbell', 'STRENGTH'),
(267, 'Hammer Curl', 'Dumbbells', 'STRENGTH'),
(268, 'Zottman Curl', 'Dumbbells', 'STRENGTH');

-- ============================================
-- CARDIO EXERCISES (ID 269-280)
-- ============================================

INSERT INTO exercises (id, name, equipment, tracking_type) VALUES
(269, 'Running', 'Treadmill', 'DISTANCE'),
(270, 'Outdoor Running', 'None', 'DISTANCE'),
(271, 'Walking', 'None', 'DISTANCE'),
(272, 'Treadmill Walking', 'Treadmill', 'DISTANCE'),
(273, 'Jump Rope', 'Jump Rope', 'DURATION'),
(274, 'Mountain Climber', 'Bodyweight', 'DURATION'),
(275, 'Jumping Jack', 'Bodyweight', 'DURATION');


-- ============================================
-- EXERCISE_MUSCLE_GROUPS LINKING TABLE
-- ============================================

-- CHEST EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(1, 1, TRUE), (1, 4, FALSE),
(2, 1, TRUE), (2, 4, FALSE),
(3, 1, TRUE), (3, 4, FALSE),
(4, 1, TRUE), (4, 4, FALSE),
(5, 1, TRUE),
(6, 2, TRUE), (6, 4, TRUE),
(7, 2, TRUE), (7, 4, TRUE),
(8, 2, TRUE), (8, 4, TRUE),
(9, 2, TRUE), (9, 4, TRUE),
(10, 2, TRUE),
(11, 3, TRUE),
(12, 3, TRUE),
(13, 3, TRUE),
(14, 3, TRUE),
(15, 3, TRUE),
(16, 1, TRUE),
(17, 2, TRUE),
(18, 1, TRUE),
(19, 2, TRUE),
(20, 1, TRUE),
(21, 1, TRUE), (21, 4, FALSE), (21, 12, FALSE),
(22, 2, TRUE), (22, 4, FALSE),
(23, 3, TRUE),
(24, 1, TRUE), (24, 4, FALSE), (24, 12, TRUE),
(25, 1, TRUE), (25, 4, FALSE), (25, 12, TRUE),
(26, 1, TRUE), (26, 12, TRUE),
(27, 1, TRUE), (27, 12, TRUE),
(28, 1, TRUE), (28, 12, TRUE),
(29, 1, TRUE), (29, 12, FALSE),
(30, 1, TRUE), (30, 12, FALSE),
(31, 1, TRUE), (31, 4, TRUE),
(32, 1, TRUE), (32, 4, TRUE),
(33, 1, TRUE),
(34, 1, TRUE),
(35, 1, TRUE);

-- SHOULDER EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(36, 4, TRUE), (36, 5, TRUE), (36, 12, FALSE), (36, 10, FALSE),
(37, 4, TRUE), (37, 5, TRUE), (37, 12, FALSE),
(38, 4, TRUE), (38, 5, TRUE), (38, 12, FALSE),
(39, 4, TRUE), (39, 5, TRUE), (39, 12, FALSE),
(40, 4, TRUE), (40, 5, TRUE), (40, 12, FALSE),
(41, 5, TRUE),
(42, 5, TRUE),
(43, 5, TRUE),
(44, 5, TRUE),
(45, 4, TRUE),
(46, 4, TRUE),
(47, 4, TRUE),
(48, 4, TRUE),
(49, 4, TRUE),
(50, 6, TRUE),
(51, 6, TRUE),
(52, 6, TRUE),
(53, 6, TRUE), (53, 9, TRUE),
(54, 6, TRUE);

-- BACK EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(55, 10, TRUE), (55, 17, TRUE), (55, 18, TRUE), (55, 7, FALSE), (55, 8, FALSE), (55, 16, FALSE),
(56, 17, TRUE), (56, 18, TRUE), (56, 10, FALSE),
(57, 17, TRUE), (57, 10, FALSE),
(58, 10, TRUE), (58, 17, TRUE), (58, 18, TRUE),
(59, 17, TRUE), (59, 18, TRUE), (59, 10, FALSE),
(60, 10, TRUE), (60, 17, TRUE), (60, 18, TRUE),
(61, 17, TRUE), (61, 18, TRUE),
(62, 8, TRUE), (62, 7, TRUE), (62, 9, TRUE), (62, 11, FALSE), (62, 10, FALSE),
(63, 8, TRUE), (63, 7, TRUE), (63, 9, TRUE),
(64, 8, TRUE), (64, 7, TRUE), (64, 9, TRUE),
(65, 8, TRUE), (65, 7, TRUE), (65, 9, TRUE), (65, 11, FALSE),
(66, 8, TRUE), (66, 7, TRUE), (66, 9, TRUE), (66, 11, FALSE),
(67, 8, TRUE), (67, 7, TRUE), (67, 9, TRUE), (67, 11, FALSE),
(68, 8, TRUE), (68, 7, TRUE), (68, 9, TRUE), (68, 11, FALSE),
(69, 8, TRUE), (69, 7, TRUE), (69, 9, TRUE),
(70, 8, TRUE), (70, 7, TRUE), (70, 9, TRUE), (70, 11, FALSE),
(71, 8, TRUE), (71, 7, TRUE), (71, 9, TRUE), (71, 11, FALSE),
(72, 8, TRUE), (72, 7, TRUE), (72, 9, TRUE), (72, 11, FALSE),
(73, 8, TRUE), (73, 7, TRUE), (73, 9, TRUE), (73, 11, FALSE),
(74, 8, TRUE), (74, 7, TRUE), (74, 9, TRUE), (74, 11, FALSE),
(75, 8, TRUE), (75, 7, TRUE), (75, 9, TRUE), (75, 11, FALSE),
(76, 8, TRUE), (76, 7, TRUE), (76, 9, TRUE),
(77, 8, TRUE), (77, 7, TRUE), (77, 9, TRUE), (77, 11, FALSE),
(78, 8, TRUE), (78, 7, TRUE), (78, 9, TRUE), (78, 11, TRUE),
(79, 8, TRUE), (79, 7, TRUE), (79, 9, TRUE), (79, 11, FALSE),
(80, 8, TRUE), (80, 7, TRUE), (80, 9, TRUE), (80, 11, FALSE),
(81, 8, TRUE), (81, 7, TRUE), (81, 9, TRUE), (81, 11, FALSE),
(82, 8, TRUE), (82, 7, TRUE), (82, 9, TRUE), (82, 11, FALSE),
(83, 8, TRUE), (83, 7, TRUE), (83, 9, TRUE), (83, 11, TRUE),
(84, 8, TRUE), (84, 7, TRUE), (84, 9, TRUE), (84, 11, FALSE),
(85, 8, TRUE), (85, 7, TRUE), (85, 9, TRUE), (85, 11, FALSE),
(86, 8, TRUE), (86, 7, TRUE), (86, 9, TRUE), (86, 11, FALSE),
(87, 8, TRUE), (87, 7, TRUE), (87, 9, TRUE), (87, 11, FALSE),
(88, 8, TRUE), (88, 7, TRUE), (88, 9, TRUE), (88, 11, TRUE),
(89, 8, TRUE), (89, 7, TRUE), (89, 9, TRUE), (89, 11, FALSE),
(90, 8, TRUE), (90, 7, TRUE), (90, 9, TRUE),
(91, 8, TRUE), (91, 7, TRUE), (91, 9, TRUE),
(92, 8, TRUE), (92, 7, TRUE), (92, 9, TRUE), (92, 11, FALSE),
(93, 7, TRUE),
(94, 7, TRUE),
(95, 7, TRUE),
(96, 7, TRUE),
(97, 7, TRUE),
(98, 7, TRUE), (98, 13, TRUE), (98, 10, FALSE),
(99, 7, TRUE), (99, 13, TRUE), (99, 10, FALSE);

-- BICEPS EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(100, 11, TRUE), (100, 13, FALSE),
(101, 11, TRUE), (101, 13, FALSE),
(102, 11, TRUE), (102, 13, FALSE),
(103, 11, TRUE), (103, 13, FALSE),
(104, 11, TRUE), (104, 13, FALSE),
(105, 11, TRUE), (105, 13, TRUE),
(106, 11, TRUE), (106, 13, TRUE),
(107, 11, TRUE), (107, 13, FALSE),
(108, 11, TRUE), (108, 13, FALSE),
(109, 11, TRUE), (109, 13, FALSE),
(110, 11, TRUE), (110, 13, FALSE),
(111, 11, TRUE), (111, 13, FALSE),
(112, 11, TRUE), (112, 4, FALSE), (112, 13, FALSE),
(113, 11, TRUE), (113, 13, FALSE),
(114, 11, TRUE), (114, 13, FALSE),
(115, 11, TRUE), (115, 13, FALSE),
(116, 11, TRUE), (116, 13, FALSE),
(117, 11, TRUE), (117, 13, FALSE),
(118, 11, TRUE), (118, 13, FALSE),
(119, 11, TRUE), (119, 13, TRUE),
(120, 11, TRUE), (120, 13, TRUE),
(121, 11, TRUE), (121, 13, TRUE),
(122, 11, TRUE), (122, 13, TRUE),
(123, 11, TRUE), (123, 13, FALSE),
(124, 11, TRUE), (124, 13, FALSE),
(125, 11, TRUE), (125, 13, FALSE);

-- TRICEPS EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(126, 12, TRUE),
(127, 12, TRUE),
(128, 12, TRUE),
(129, 12, TRUE),
(130, 12, TRUE),
(131, 12, TRUE),
(132, 12, TRUE),
(133, 12, TRUE),
(134, 12, TRUE),
(135, 12, TRUE),
(136, 12, TRUE),
(137, 12, TRUE),
(138, 12, TRUE),
(139, 12, TRUE), (139, 1, TRUE), (139, 4, FALSE),
(140, 12, TRUE), (140, 1, TRUE), (140, 4, FALSE),
(141, 12, TRUE), (141, 1, FALSE), (141, 4, FALSE),
(142, 12, TRUE), (142, 1, FALSE), (142, 4, FALSE),
(143, 12, TRUE), (143, 1, FALSE),
(144, 12, TRUE), (144, 1, FALSE),
(145, 12, TRUE), (145, 1, TRUE), (145, 4, FALSE),
(146, 12, TRUE),
(147, 12, TRUE),
(148, 12, TRUE),
(149, 12, TRUE),
(150, 12, TRUE);

-- QUADRICEPS EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(151, 16, TRUE), (151, 18, TRUE), (151, 17, FALSE), (151, 10, FALSE),
(152, 16, TRUE), (152, 18, TRUE), (152, 17, FALSE), (152, 10, FALSE), (152, 4, FALSE),
(153, 16, TRUE), (153, 18, TRUE), (153, 17, FALSE), (153, 10, FALSE),
(154, 16, TRUE), (154, 18, TRUE), (154, 17, FALSE), (154, 10, FALSE),
(155, 16, TRUE), (155, 18, TRUE), (155, 17, FALSE), (155, 10, FALSE),
(156, 16, TRUE), (156, 18, TRUE), (156, 17, FALSE), (156, 10, FALSE),
(157, 16, TRUE), (157, 18, TRUE), (157, 17, FALSE), (157, 10, FALSE),
(158, 16, TRUE), (158, 18, TRUE), (158, 17, FALSE), (158, 10, FALSE),
(159, 16, TRUE), (159, 18, TRUE), (159, 17, FALSE), (159, 10, FALSE),
(160, 16, TRUE), (160, 18, TRUE), (160, 17, FALSE), (160, 10, FALSE),
(161, 16, TRUE), (161, 18, TRUE), (161, 17, FALSE), (161, 10, FALSE),
(162, 16, TRUE), (162, 18, TRUE), (162, 17, FALSE), (162, 10, FALSE),
(163, 16, TRUE), (163, 18, TRUE), (163, 17, FALSE), (163, 10, FALSE),
(164, 16, TRUE), (164, 18, TRUE), (164, 17, FALSE), (164, 10, FALSE),
(165, 16, TRUE), (165, 18, TRUE), (165, 17, FALSE), (165, 10, FALSE),
(166, 16, TRUE), (166, 18, TRUE), (166, 17, FALSE), (166, 10, FALSE),
(167, 16, TRUE), (167, 18, TRUE), (167, 17, FALSE), (167, 10, FALSE),
(168, 16, TRUE), (168, 18, TRUE), (168, 17, FALSE), (168, 10, FALSE),
(169, 16, TRUE), (169, 18, FALSE),
(170, 16, TRUE), (170, 18, FALSE),
(171, 16, TRUE), (171, 18, TRUE), (171, 17, FALSE), (171, 10, FALSE),
(172, 16, TRUE), (172, 18, TRUE), (172, 17, FALSE), (172, 10, FALSE),
(173, 16, TRUE), (173, 18, TRUE), (173, 17, FALSE), (173, 10, FALSE),
(174, 16, TRUE), (174, 18, TRUE), (174, 17, FALSE), (174, 10, FALSE),
(175, 16, TRUE), (175, 18, TRUE), (175, 17, FALSE), (175, 10, FALSE),
(176, 16, TRUE), (176, 18, TRUE), (176, 17, FALSE), (176, 10, FALSE),
(177, 16, TRUE), (177, 18, TRUE), (177, 19, TRUE), (177, 17, FALSE), (177, 10, FALSE),
(178, 16, TRUE), (178, 18, TRUE), (178, 19, TRUE), (178, 17, FALSE), (178, 10, FALSE),
(179, 16, TRUE), (179, 18, TRUE), (179, 17, FALSE),
(180, 16, TRUE), (180, 18, TRUE), (180, 17, FALSE),
(181, 16, TRUE), (181, 18, TRUE), (181, 17, FALSE),
(182, 16, TRUE), (182, 18, TRUE), (182, 17, FALSE),
(183, 16, TRUE), (183, 18, TRUE), (183, 17, FALSE), (183, 10, FALSE),
(184, 16, TRUE), (184, 18, TRUE), (184, 17, FALSE), (184, 10, FALSE),
(185, 16, TRUE), (185, 18, TRUE), (185, 17, FALSE), (185, 10, FALSE),
(186, 16, TRUE), (186, 18, TRUE), (186, 17, FALSE), (186, 10, FALSE),
(187, 16, TRUE), (187, 18, TRUE), (187, 17, FALSE), (187, 10, FALSE),
(188, 16, TRUE), (188, 18, TRUE), (188, 17, FALSE), (188, 10, FALSE),
(189, 16, TRUE), (189, 18, TRUE), (189, 19, TRUE), (189, 17, FALSE), (189, 10, FALSE),
(190, 16, TRUE), (190, 18, TRUE), (190, 19, TRUE), (190, 17, FALSE), (190, 10, FALSE),
(191, 16, TRUE), (191, 18, TRUE), (191, 17, FALSE),
(192, 16, TRUE), (192, 18, TRUE), (192, 17, FALSE),
(193, 16, TRUE), (193, 18, TRUE), (193, 17, FALSE),
(194, 16, TRUE), (194, 18, TRUE), (194, 19, TRUE), (194, 17, FALSE),
(195, 16, TRUE), (195, 18, TRUE), (195, 19, TRUE), (195, 17, FALSE), (195, 10, FALSE);

-- HAMSTRINGS/GLUTES EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(196, 16, TRUE),
(197, 16, TRUE),
(198, 16, TRUE), (198, 18, FALSE),
(199, 16, TRUE),
(200, 17, TRUE), (200, 18, TRUE), (200, 10, FALSE),
(201, 17, TRUE), (201, 18, TRUE), (201, 10, FALSE),
(202, 17, TRUE), (202, 10, FALSE),
(203, 17, TRUE), (203, 10, FALSE),
(204, 17, TRUE),
(205, 17, TRUE),
(206, 17, TRUE),
(207, 17, TRUE),
(208, 17, TRUE),
(209, 17, TRUE),
(210, 17, TRUE),
(211, 17, TRUE),
(212, 10, TRUE), (212, 17, FALSE),
(213, 10, TRUE), (213, 17, FALSE),
(214, 10, TRUE), (214, 18, TRUE),
(215, 18, TRUE), (215, 17, FALSE),
(216, 18, TRUE), (216, 17, FALSE),
(217, 18, TRUE), (217, 17, FALSE),
(218, 18, TRUE), (218, 17, FALSE),
(219, 18, TRUE), (219, 17, FALSE),
(220, 18, TRUE), (220, 17, FALSE);

-- GLUTES CONTINUED
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(221, 18, TRUE), (221, 17, FALSE),
(222, 18, TRUE),
(223, 18, TRUE),
(224, 16, TRUE), (224, 18, TRUE), (224, 17, FALSE), (224, 10, FALSE),
(225, 16, TRUE), (225, 18, TRUE), (225, 17, FALSE), (225, 10, FALSE);

-- CALVES EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(226, 19, TRUE),
(227, 19, TRUE),
(228, 19, TRUE),
(229, 19, TRUE),
(230, 19, TRUE),
(231, 19, TRUE),
(232, 19, TRUE),
(233, 19, TRUE),
(234, 19, TRUE);

-- CORE EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(235, 14, TRUE), (235, 15, FALSE),
(236, 14, TRUE), (236, 15, FALSE),
(237, 14, TRUE),
(238, 14, TRUE),
(239, 14, TRUE),
(240, 14, TRUE),
(241, 14, TRUE), (241, 15, TRUE),
(242, 14, TRUE),
(243, 14, TRUE),
(244, 14, TRUE),
(245, 14, TRUE),
(246, 14, TRUE), (246, 8, TRUE),
(247, 14, TRUE), (247, 8, TRUE),
(248, 14, TRUE), (248, 15, TRUE),
(249, 14, TRUE), (249, 15, TRUE),
(250, 14, TRUE), (250, 15, TRUE),
(251, 14, TRUE), (251, 15, TRUE),
(252, 14, TRUE), (252, 15, TRUE),
(253, 15, TRUE),
(254, 15, TRUE);

-- FOREARMS EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(255, 13, TRUE),
(256, 13, TRUE),
(257, 13, TRUE),
(258, 13, TRUE),
(259, 13, TRUE),
(260, 13, TRUE),
(261, 13, TRUE),
(262, 13, TRUE),
(263, 13, TRUE),
(264, 13, TRUE),
(265, 13, TRUE),
(266, 11, TRUE), (266, 13, TRUE),
(267, 11, TRUE), (267, 13, TRUE),
(268, 11, TRUE), (268, 13, TRUE);

-- CARDIO EXERCISES
INSERT INTO exercise_muscle_groups (exercise_id, muscle_group_id, is_primary) VALUES
(269, 20, TRUE), (269, 16, FALSE), (269, 19, FALSE),
(270, 20, TRUE), (270, 16, FALSE), (270, 19, FALSE),
(271, 20, TRUE), (271, 16, FALSE), (271, 19, FALSE),
(272, 20, TRUE), (272, 16, FALSE), (272, 19, FALSE),
(273, 20, TRUE), (273, 13, FALSE), (273, 16, FALSE),
(274, 20, TRUE), (274, 14, TRUE), (274, 16, TRUE), (274, 12, FALSE),
(275, 20, TRUE), (275, 16, TRUE), (275, 19, FALSE);



