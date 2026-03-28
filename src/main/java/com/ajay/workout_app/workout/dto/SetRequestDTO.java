package com.ajay.workout_app.workout.dto;

import com.ajay.workout_app.workout.enums.SetType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record SetRequestDTO(
        BigDecimal weightKg,
        Integer reps,
        Integer durationSeconds,
        BigDecimal distanceM,
        SetType setType
) {
}

