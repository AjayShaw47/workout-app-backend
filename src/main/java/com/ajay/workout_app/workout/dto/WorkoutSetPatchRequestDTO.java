package com.ajay.workout_app.workout.dto;

import com.ajay.workout_app.workout.enums.SetType;
import jakarta.validation.constraints.Min;
import java.math.BigDecimal;

public record WorkoutSetPatchRequestDTO(
        BigDecimal weightKg,
        Integer reps,
        Integer durationSeconds,
        BigDecimal distanceM,
        SetType setType
) {
}

