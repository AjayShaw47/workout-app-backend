package com.ajay.workout_app.workout.dto;

import java.util.List;
import java.util.UUID;

public record WorkoutExerciseResponseDTO(
        UUID workoutExerciseId,
        String exerciseName,
        Integer orderIndex,
        List<SetResponseDTO> setsDTO
) {}
