package com.ajay.workout_app.workout.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

public record WorkoutExercisePatchRequestDTO(
        @Size(max = 1000, message = "Notes cannot exceed 1000 characters")
        String notes

) {
}

