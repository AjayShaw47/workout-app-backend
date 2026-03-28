package com.ajay.workout_app.workout.controller;

import com.ajay.workout_app.workout.dto.SetRequestDTO;
import com.ajay.workout_app.workout.dto.SetResponseDTO;
import com.ajay.workout_app.workout.dto.WorkoutSetPatchRequestDTO;
import com.ajay.workout_app.workout.service.WorkoutSetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/workout-exercises/{workoutExerciseId}/sets")
public class WorkoutSetController {

    private final WorkoutSetService workoutSetService;

    @PostMapping
    public ResponseEntity<SetResponseDTO> addSetToWorkoutExercise(
            @PathVariable UUID workoutExerciseId,
            @Valid @RequestBody SetRequestDTO request) {

        SetResponseDTO response = workoutSetService.createWorkoutSet(workoutExerciseId, request);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(response.setId())
                .toUri();

        return ResponseEntity.created(location).body(response);
    }

    @DeleteMapping("/{setId}")
    public ResponseEntity<Void> deleteWorkoutSet(@PathVariable UUID setId) {
        workoutSetService.deleteWorkoutSet(setId);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{setId}")
    public ResponseEntity<Void> patchWorkoutSet(
            @PathVariable UUID setId,
            @Valid @RequestBody WorkoutSetPatchRequestDTO request) {
        workoutSetService.patchWorkoutSet(setId, request);
        return ResponseEntity.noContent().build();
    }
}
