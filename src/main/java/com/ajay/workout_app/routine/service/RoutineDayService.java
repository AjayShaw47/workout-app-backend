package com.ajay.workout_app.routine.service;

import com.ajay.workout_app.routine.dto.RoutineDTO;
import com.ajay.workout_app.routine.dto.RoutineDayResponse;
import com.ajay.workout_app.routine.dto.RoutineDayRequest;
import com.ajay.workout_app.routine.dto.RoutineDayExerciseRequest;
import com.ajay.workout_app.routine.entity.RoutineDay;
import com.ajay.workout_app.routine.entity.RoutineDayExercise;
import com.ajay.workout_app.routine.mapper.RoutineDayMapper;
import com.ajay.workout_app.routine.repository.RoutineDayRepository;
import com.ajay.workout_app.routine.repository.RoutineDayExerciseRepository;
import com.ajay.workout_app.user.entity.User;
import com.ajay.workout_app.user.repository.UserRepository;
import com.ajay.workout_app.exercise.repository.ExerciseRepository;
import com.ajay.workout_app.exercise.entity.Exercise;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;

import java.util.*;

@Service
@RequiredArgsConstructor
@Transactional
public class RoutineDayService {

    private final RoutineDayRepository routineDayRepository;
    private final UserRepository userRepository;
    private final RoutineDayExerciseRepository routineDayExerciseRepository;
    private final ExerciseRepository exerciseRepository;
    private final RoutineDayMapper routineDayMapper;
    private final EntityManager entityManager;

    public List<RoutineDayResponse> getAllUserRoutines(UUID userId) {
        List<RoutineDay> routineDays = routineDayRepository.findByUserId(userId);
        return routineDays.stream()
                .map(routineDayMapper::toResponse)
                .toList();
    }

    @Transactional
    public RoutineDayResponse createRoutineDay(Short dayOfWeek, RoutineDayRequest request) {

        UUID userId = UUID.fromString("23b0cf0a-0bff-47ce-ba44-46a138e0d360");
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
        
        RoutineDay routineDay = new RoutineDay();
        routineDay.setUser(user);
        routineDay.setDayOfWeek(dayOfWeek);

        if(request == null || request.getName() == null || request.getName().trim().isEmpty()){
            routineDay.setName("Day " + dayOfWeek);
        } else {
            routineDay.setName(request.getName());
        }

        RoutineDay savedRoutineDay = routineDayRepository.save(routineDay);

        return routineDayMapper.toResponse(savedRoutineDay);
    }

    @Transactional
    public RoutineDayResponse addRoutineExercises(UUID userId, Short dayOfWeek, RoutineDayExerciseRequest dto) {
        RoutineDay routineDay = routineDayRepository.findByUserIdAndDayOfWeek(userId, dayOfWeek)
            .orElseThrow(() -> new RuntimeException("Routine day not found for user ID: " + userId + " and day of week: " + dayOfWeek));

        // Get the current max orderIndex to append new exercises
        int maxOrderIndex = routineDay.getRoutineDayExercises().stream()
                .mapToInt(RoutineDayExercise::getOrderIndex)
                .max()
                .orElse(0);

        List<Short> exerciseIds = dto.getExerciseIds();
        for (int i = 0; i < exerciseIds.size(); i++) {
            Short exerciseId = exerciseIds.get(i);
            Exercise exercise = exerciseRepository.findById(exerciseId)
                .orElseThrow(() -> new RuntimeException("Exercise not found with ID: " + exerciseId));
            
            RoutineDayExercise routineDayExercise = new RoutineDayExercise();
            routineDayExercise.setRoutineDay(routineDay);
            routineDayExercise.setExercise(exercise);
            routineDayExercise.setOrderIndex(maxOrderIndex + i + 1);
            
            routineDayExerciseRepository.save(routineDayExercise);
        }

        // Flush changes to database to ensure exercises are persisted
        entityManager.flush();
        
        // Refresh the entity to reload lazy collections from database
        entityManager.refresh(routineDay);

        return routineDayMapper.toResponse(routineDay);
    }

    @Transactional
    public RoutineDTO updateRoutineName(UUID id, Short dayOfWeek, RoutineDTO dto) {
        RoutineDay routineDay = routineDayRepository.findByUserIdAndDayOfWeek(id, dayOfWeek)
            .orElseThrow(() -> new RuntimeException("Routine day not found for user ID: " + id + " and day of week: " + dayOfWeek));

        routineDay.setName(dto.routineName());
        RoutineDay updated = routineDayRepository.save(routineDay);

        return new RoutineDTO(updated.getName());
    }

    public void deleteRoutineDay(UUID userId, Short dayOfWeek) {
        RoutineDay routineDay = routineDayRepository.findByUserIdAndDayOfWeek(userId, dayOfWeek)
            .orElseThrow(() -> new RuntimeException("Routine day not found for user ID: " + userId + " and day of week: " + dayOfWeek));

        routineDayRepository.delete(routineDay);
    }
}
