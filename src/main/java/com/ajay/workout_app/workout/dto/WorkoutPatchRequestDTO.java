package com.ajay.workout_app.workout.dto;

import jakarta.validation.constraints.Size;

public record WorkoutPatchRequestDTO(
        @Size(max = 150, message = "Title cannot exceed 150 characters")
        String title
) {
}

