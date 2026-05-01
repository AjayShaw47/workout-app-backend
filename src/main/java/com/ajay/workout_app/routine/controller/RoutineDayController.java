package com.ajay.workout_app.routine.controller;

import com.ajay.workout_app.routine.dto.RoutineDayResponse;
import com.ajay.workout_app.routine.dto.RoutineDayRequest;
import com.ajay.workout_app.routine.dto.RoutineDayExerciseRequest;
import com.ajay.workout_app.routine.dto.RoutineDTO;
import com.ajay.workout_app.routine.service.RoutineDayService;
import com.ajay.workout_app.routine.entity.RoutineDay;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import jakarta.validation.Valid;

import java.net.URI;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/routine")
@RequiredArgsConstructor
public class RoutineDayController {

    private final RoutineDayService routineDayService;

    @GetMapping
    public ResponseEntity<List<RoutineDayResponse>> getRoutine(
            @RequestParam(required = false) UUID userId) {        // replace with @AuthenticationPrincipal later

        if (userId == null) {
            userId = UUID.fromString("23b0cf0a-0bff-47ce-ba44-46a138e0d360");
        }

        return ResponseEntity.ok(routineDayService.getAllUserRoutines(userId));
    }

    @PostMapping("/{dayOfWeek}")
    public ResponseEntity<RoutineDayResponse> createRoutine(
            @PathVariable Short dayOfWeek,
            @RequestBody(required = false) RoutineDayRequest request) {

        RoutineDayResponse created = routineDayService.createRoutineDay(dayOfWeek, request);

        return new ResponseEntity<>(created, HttpStatus.CREATED);
    }

    @PostMapping("/{dayOfWeek}/exercises")
    public ResponseEntity<RoutineDayResponse> addRoutineExercises(
            @PathVariable Short dayOfWeek,
            @RequestParam(required = false) UUID userId,
            @Valid @RequestBody RoutineDayExerciseRequest request) {

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            return ResponseEntity.badRequest().build();
        }

        if (userId == null) {
            userId = UUID.fromString("23b0cf0a-0bff-47ce-ba44-46a138e0d360");
        }

        RoutineDayResponse updated = routineDayService.addRoutineExercises(userId, dayOfWeek, request);
        return new ResponseEntity<>(updated, HttpStatus.CREATED);
    }

    @PatchMapping("/{dayOfWeek}")
    public ResponseEntity<RoutineDTO> updateRoutineName(
            @PathVariable Short dayOfWeek,
            @RequestParam(required = false) UUID userId,
            @Valid @RequestBody RoutineDTO request) {

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            return ResponseEntity.badRequest().build();
        }

        if (userId == null) {
            userId = UUID.fromString("23b0cf0a-0bff-47ce-ba44-46a138e0d360");
        }

        return ResponseEntity.ok(routineDayService.updateRoutineName(userId, dayOfWeek, request));
    }

    @DeleteMapping("/{dayOfWeek}")
    public ResponseEntity<Void> deleteRoutine(
            @PathVariable Short dayOfWeek,
            @RequestParam(required = false) UUID userId) {

        if (dayOfWeek < 1 || dayOfWeek > 7) {
            return ResponseEntity.badRequest().build();
        }

        if (userId == null) {
            userId = UUID.fromString("23b0cf0a-0bff-47ce-ba44-46a138e0d360");
        }

        routineDayService.deleteRoutineDay(userId, dayOfWeek);
        return ResponseEntity.noContent().build();
    }
}
