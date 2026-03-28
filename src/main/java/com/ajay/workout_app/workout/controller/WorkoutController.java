package com.ajay.workout_app.workout.controller;

import com.ajay.workout_app.workout.dto.SetRequestDTO;
import com.ajay.workout_app.workout.dto.SetResponseDTO;
import com.ajay.workout_app.workout.dto.WorkoutExerciseRequestDTO;
import com.ajay.workout_app.workout.dto.WorkoutExerciseResponseDTO;
import com.ajay.workout_app.workout.dto.WorkoutPatchRequestDTO;
import com.ajay.workout_app.workout.dto.WorkoutResponseDTO;
import com.ajay.workout_app.workout.service.WorkoutService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/workouts")
public class WorkoutController {

    private final WorkoutService workoutService;

    @PostMapping("/{dayOfWeek}")
    public ResponseEntity<WorkoutResponseDTO> createWorkout(@PathVariable Short dayOfWeek) {

        UUID userId = UUID.fromString("23b0cf0a-0bff-47ce-ba44-46a138e0d360");

        WorkoutResponseDTO workout = workoutService.createWorkout(userId, dayOfWeek);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(workout.workoutId()).toUri();
        return ResponseEntity.created(location).body(workout);
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkoutResponseDTO> getWorkoutByDayOfWeek(@PathVariable UUID id) {
        WorkoutResponseDTO workout = workoutService.getWorkout(id);
        return ResponseEntity.ok(workout);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWorkout(@PathVariable UUID id) {
        workoutService.deleteWorkout(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> patchWorkout(
            @PathVariable UUID id,
            @Valid @RequestBody WorkoutPatchRequestDTO request) {
        workoutService.patchWorkout(id, request);
        return ResponseEntity.noContent().build();
    }
}
