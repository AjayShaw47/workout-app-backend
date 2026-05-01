package com.ajay.workout_app.routine.dto;

import java.util.Map;

public record RoutineDayResponse(
        Short dayOfWeek,
        String routineName,
        Map<Integer,String> exercisesWithOrderIndex
) {
}
