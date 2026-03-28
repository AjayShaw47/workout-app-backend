package com.ajay.workout_app.workout.controller;

import com.ajay.workout_app.workout.dto.WorkoutExercisePatchRequestDTO;
import com.ajay.workout_app.workout.dto.WorkoutExerciseRequestDTO;
import com.ajay.workout_app.workout.dto.WorkoutExerciseResponseDTO;
import com.ajay.workout_app.workout.service.WorkoutExerciseService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/workouts/{workoutId}/exercises")
public class WorkoutExerciseController {

    private final WorkoutExerciseService workoutExerciseService;

    @PostMapping
    public ResponseEntity<WorkoutExerciseResponseDTO> addExerciseToWorkout(
            @PathVariable UUID workoutId,
            @Valid @RequestBody WorkoutExerciseRequestDTO request) {

        WorkoutExerciseResponseDTO response = workoutExerciseService.createWorkoutExercise(workoutId, request);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.workoutExerciseId())
                .toUri();

        return ResponseEntity.created(location).body(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkoutExercise(@PathVariable UUID id) {
        workoutExerciseService.deleteWorkoutExercise(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> patchWorkoutExercise(
            @PathVariable UUID id,
            @Valid @RequestBody WorkoutExercisePatchRequestDTO request) {
        workoutExerciseService.patchWorkoutExercise(id, request);
        return ResponseEntity.noContent().build();
    }
}
