package com.ajay.workout_app.user.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

public record CreateUserRequest(
        @NotBlank
        String email,

        @NotBlank
        String password
) {
}
