package com.ajay.workout_app.workout.dto;

import com.ajay.workout_app.workout.enums.SetType;
import java.math.BigDecimal;
import java.util.UUID;

public record SetResponseDTO(
        UUID setId,
        Integer setNumber,
        BigDecimal weightKg,
        Integer reps,
        Integer durationSeconds,
        BigDecimal distanceM,
        SetType setType
) {
}
