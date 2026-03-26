package com.ajay.workout_app.routine.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record RoutineDTO(
    @NotBlank(message = "Routine name cannot be blank")
    @Size(max = 100, min = 3, message = "Routine name must be between 3 and 100 characters")
    String routineName
) {}
