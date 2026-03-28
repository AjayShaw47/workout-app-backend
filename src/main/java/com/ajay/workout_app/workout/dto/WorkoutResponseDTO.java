package com.ajay.workout_app.workout.dto;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

public record WorkoutResponseDTO(
        UUID workoutId,
        String title,
        OffsetDateTime createdAt,
        List<WorkoutExerciseResponseDTO> workoutExercises
) {
}
