package com.ajay.workout_app.routine.mapper;

import com.ajay.workout_app.routine.dto.RoutineDayResponse;
import com.ajay.workout_app.routine.entity.RoutineDay;
import com.ajay.workout_app.routine.entity.RoutineDayExercise;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class RoutineDayMapper {

    public RoutineDayResponse toResponse(RoutineDay routineDay) {
        String routineName = routineDay.getName();
        List<RoutineDayExercise> routineDayExercises = routineDay.getRoutineDayExercises();

        Map<Integer, String> exerciseMap = new HashMap<>();

        routineDayExercises.forEach(routineDayExercise ->
            exerciseMap.put(routineDayExercise.getOrderIndex(), routineDayExercise.getExercise().getName())
        );

        return new RoutineDayResponse(routineName, exerciseMap);
    }
}

