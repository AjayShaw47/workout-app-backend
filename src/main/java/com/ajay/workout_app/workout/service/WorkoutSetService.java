package com.ajay.workout_app.workout.service;

import com.ajay.workout_app.workout.dto.SetRequestDTO;
import com.ajay.workout_app.workout.dto.SetResponseDTO;
import com.ajay.workout_app.workout.dto.WorkoutSetPatchRequestDTO;
import com.ajay.workout_app.workout.entity.WorkoutExercise;
import com.ajay.workout_app.workout.entity.WorkoutSet;
import com.ajay.workout_app.workout.mapper.WorkoutMapper;
import com.ajay.workout_app.workout.repository.WorkoutExerciseRepository;
import com.ajay.workout_app.workout.repository.WorkoutSetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WorkoutSetService {
    private final WorkoutSetRepository workoutSetRepository;
    private final WorkoutExerciseRepository workoutExerciseRepository;
    private final WorkoutMapper workoutMapper;

    @Transactional
    public SetResponseDTO createWorkoutSet(UUID workoutExerciseId, SetRequestDTO request) {
        WorkoutExercise workoutExercise = workoutExerciseRepository.findById(workoutExerciseId)
                .orElseThrow(() -> new RuntimeException("WorkoutExercise not found"));

        WorkoutSet workoutSet = new WorkoutSet();
        workoutSet.setWorkoutExercise(workoutExercise);
        workoutSet.setSetNumber(workoutExercise.getSets().size() + 1);
        workoutSet.setWeightKg(request.weightKg());
        workoutSet.setReps(request.reps());
        workoutSet.setDurationSeconds(request.durationSeconds());
        workoutSet.setDistanceM(request.distanceM());
        workoutSet.setSetType(request.setType());

        WorkoutSet saved = workoutSetRepository.save(workoutSet);
        return workoutMapper.toSetResponseDTO(saved);
    }

    @Transactional
    public void deleteWorkoutSet(UUID setId) {
        if (!workoutSetRepository.existsById(setId)) {
            throw new RuntimeException("Set not found");
        }
        workoutSetRepository.deleteById(setId);
    }

    @Transactional
    public void patchWorkoutSet(UUID setId, WorkoutSetPatchRequestDTO request) {
        WorkoutSet workoutSet = workoutSetRepository.findById(setId)
                .orElseThrow(() -> new RuntimeException("Set not found"));

        if (request.weightKg() != null) {
            workoutSet.setWeightKg(request.weightKg());
        }
        if (request.reps() != null) {
            workoutSet.setReps(request.reps());
        }
        if (request.durationSeconds() != null) {
            workoutSet.setDurationSeconds(request.durationSeconds());
        }
        if (request.distanceM() != null) {
            workoutSet.setDistanceM(request.distanceM());
        }
        if (request.setType() != null) {
            workoutSet.setSetType(request.setType());
        }

        workoutSetRepository.save(workoutSet);
    }
}
