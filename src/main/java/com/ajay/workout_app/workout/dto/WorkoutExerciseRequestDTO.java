package com.ajay.workout_app.workout.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;

public record WorkoutExerciseRequestDTO(
        @NotNull(message = "Exercise ID cannot be null")
        Short exerciseId,

        String notes
) {
}
