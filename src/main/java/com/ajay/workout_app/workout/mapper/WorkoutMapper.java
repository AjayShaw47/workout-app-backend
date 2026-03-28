package com.ajay.workout_app.workout.mapper;

import com.ajay.workout_app.workout.dto.SetResponseDTO;
import com.ajay.workout_app.workout.dto.WorkoutExerciseResponseDTO;
import com.ajay.workout_app.workout.dto.WorkoutResponseDTO;
import com.ajay.workout_app.workout.entity.Workout;
import com.ajay.workout_app.workout.entity.WorkoutExercise;
import com.ajay.workout_app.workout.entity.WorkoutSet;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WorkoutMapper {

    public WorkoutResponseDTO toWorkoutResponseDTO(Workout workout) {
        List<WorkoutExerciseResponseDTO> workoutExerciseResponse = null;
        if (workout.getWorkoutExercises() != null) {
            workoutExerciseResponse = workout.getWorkoutExercises().stream()
                    .map(this::toWorkoutExerciseResponseDTO)
                    .collect(Collectors.toList());
        }

        return new WorkoutResponseDTO(
                workout.getId(),
                workout.getTitle(),
                workout.getCreatedAt(),
                workoutExerciseResponse
        );
    }

    public WorkoutExerciseResponseDTO toWorkoutExerciseResponseDTO(WorkoutExercise workoutExercise) {
        if (workoutExercise == null) {
            return null;
        }

        List<SetResponseDTO> setResponseDTOs = null;
        if (workoutExercise.getSets() != null) {
            setResponseDTOs = workoutExercise.getSets().stream()
                    .map(this::toSetResponseDTO)
                    .collect(Collectors.toList());
        }

        return new WorkoutExerciseResponseDTO(
                workoutExercise.getId(),
                workoutExercise.getExercise() != null ? workoutExercise.getExercise().getName() : null,
                workoutExercise.getOrderIndex(),
                setResponseDTOs
        );
    }

    public SetResponseDTO toSetResponseDTO(WorkoutSet set) {
        if (set == null) {
            return null;
        }

        return new SetResponseDTO(
                set.getId(),
                set.getSetNumber(),
                set.getWeightKg(),
                set.getReps(),
                set.getDurationSeconds(),
                set.getDistanceM(),
                set.getSetType()
        );
    }
}
