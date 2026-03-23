package com.ajay.workout_app.user.dto;

import com.ajay.workout_app.user.enums.FitnessGoal;
import com.ajay.workout_app.user.enums.Gender;
import com.ajay.workout_app.user.enums.Role;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

public record UserResponse(
        UUID id,
        String email,
        Role role,
        OffsetDateTime createdAt
) {
}
