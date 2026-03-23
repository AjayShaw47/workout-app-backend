package com.ajay.workout_app.user.dto;

import com.ajay.workout_app.user.enums.FitnessGoal;
import com.ajay.workout_app.user.enums.Gender;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProfileResponse(

        @Size(max = 100)
        String name,
        String avatarUrl,

        @Past
        LocalDate dateOfBirth,
        Gender gender,

        @Positive
        BigDecimal heightCm,

        @Positive
        BigDecimal weightKg,
        FitnessGoal fitnessGoal
) {
}
