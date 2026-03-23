package com.ajay.workout_app.user.dto;

import com.ajay.workout_app.user.enums.FitnessGoal;
import com.ajay.workout_app.user.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

public record UpdateProfileRequest(
        String name,
        String avatarUrl,
        LocalDate dateOfBirth,
        Gender gender,
        BigDecimal heightCm,
        BigDecimal weightKg,
        FitnessGoal fitnessGoal
) {
}
