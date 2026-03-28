package com.ajay.workout_app.workout.service;

import com.ajay.workout_app.exercise.entity.Exercise;
import com.ajay.workout_app.exercise.repository.ExerciseRepository;
import com.ajay.workout_app.workout.dto.WorkoutExercisePatchRequestDTO;
import com.ajay.workout_app.workout.dto.WorkoutExerciseRequestDTO;
import com.ajay.workout_app.workout.dto.WorkoutExerciseResponseDTO;
import com.ajay.workout_app.workout.entity.Workout;
import com.ajay.workout_app.workout.entity.WorkoutExercise;
import com.ajay.workout_app.workout.mapper.WorkoutMapper;
import com.ajay.workout_app.workout.repository.WorkoutExerciseRepository;
import com.ajay.workout_app.workout.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WorkoutExerciseService {
    private final WorkoutExerciseRepository workoutExerciseRepository;
    private final WorkoutRepository workoutRepository;
    private final ExerciseRepository exerciseRepository;
    private final WorkoutMapper workoutMapper;

    @Transactional
    public WorkoutExerciseResponseDTO createWorkoutExercise(UUID workoutId, WorkoutExerciseRequestDTO request) {
        Workout workout = workoutRepository.findById(workoutId)
                .orElseThrow(() -> new RuntimeException("Workout not found"));

        Exercise exercise = exerciseRepository.findById(request.exerciseId())
                .orElseThrow(() -> new RuntimeException("Exercise not found"));

        WorkoutExercise workoutExercise = new WorkoutExercise();
        workoutExercise.setWorkout(workout);
        workoutExercise.setExercise(exercise);
        workoutExercise.setOrderIndex(workout.getWorkoutExercises().size() + 1);
        workoutExercise.setNotes(request.notes());

        WorkoutExercise saved = workoutExerciseRepository.save(workoutExercise);
        return workoutMapper.toWorkoutExerciseResponseDTO(saved);
    }

    @Transactional
    public void deleteWorkoutExercise(UUID workoutExerciseId) {
        if (!workoutExerciseRepository.existsById(workoutExerciseId)) {
            throw new RuntimeException("WorkoutExercise not found");
        }
        workoutExerciseRepository.deleteById(workoutExerciseId);
    }

    @Transactional
    public void patchWorkoutExercise(UUID workoutExerciseId, WorkoutExercisePatchRequestDTO request) {
        WorkoutExercise workoutExercise = workoutExerciseRepository.findById(workoutExerciseId)
                .orElseThrow(() -> new RuntimeException("WorkoutExercise not found"));

        if (request.notes() != null) {
            workoutExercise.setNotes(request.notes());
        }

        workoutExerciseRepository.save(workoutExercise);
    }
}
