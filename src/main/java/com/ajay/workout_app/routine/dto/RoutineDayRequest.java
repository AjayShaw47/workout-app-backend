package com.ajay.workout_app.routine.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoutineDayRequest {
    private String name;

    @NotNull(message = "exerciseIds cannot be null")
    @Size(min = 1, max = 10, message = "exerciseIds must contain between 1 and 10 exercises")
    private List<Short> exerciseIds;
}
