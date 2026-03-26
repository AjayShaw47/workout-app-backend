package com.ajay.workout_app.routine.service;

import com.ajay.workout_app.routine.dto.RoutineDTO;
import com.ajay.workout_app.routine.dto.RoutineDayResponse;
import com.ajay.workout_app.routine.dto.RoutineDayRequest;
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

    public RoutineDayResponse getDayRoutine(UUID userId, Integer dayOfWeek) {
        RoutineDay routineDay = routineDayRepository
                .findByUserIdAndDayOfWeek(userId, dayOfWeek.shortValue()).orElse(null);

        String routine_name = Objects.requireNonNull(routineDay).getName();
        List<RoutineDayExercise> routineDayExercises = routineDay.getRoutineDayExercises();

        Map<Integer,String> exerciseMap = new HashMap<>();

        routineDayExercises.forEach(routineDayExercise ->
            exerciseMap.put(routineDayExercise.getOrderIndex(), routineDayExercise.getExercise().getName())
        );

        return new RoutineDayResponse(routine_name,exerciseMap);
    }

    @Transactional
    public RoutineDayResponse createRoutineDay(Short dayOfWeek, RoutineDayRequest dto) {

        UUID userId = UUID.fromString("23b0cf0a-0bff-47ce-ba44-46a138e0d360");
        User user = userRepository.findById(userId)
            .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
        
        RoutineDay routineDay = new RoutineDay();
        routineDay.setUser(user);
        routineDay.setDayOfWeek(dayOfWeek);

        if(dto.getName() == null || dto.getName().isEmpty()){
            routineDay.setName("Day " + dayOfWeek);
        } else {
            routineDay.setName(dto.getName());
        }

        // Save the routine day first
        RoutineDay savedRoutineDay = routineDayRepository.save(routineDay);

        // Create and save RoutineDayExercise records
        List<Short> exerciseIds = dto.getExerciseIds();
        for (int i = 0; i < exerciseIds.size(); i++) {
            Short exerciseId = exerciseIds.get(i);
            Exercise exercise = exerciseRepository.findById(exerciseId)
                .orElseThrow(() -> new RuntimeException("Exercise not found with ID: " + exerciseId));
            
            RoutineDayExercise routineDayExercise = new RoutineDayExercise();
            routineDayExercise.setRoutineDay(savedRoutineDay);
            routineDayExercise.setExercise(exercise);
            routineDayExercise.setOrderIndex(i + 1);
            
            routineDayExerciseRepository.save(routineDayExercise);

        }

        // Flush changes to database to ensure exercises are persisted
        entityManager.flush();
        
        // Refresh the entity to reload lazy collections from database
        entityManager.refresh(savedRoutineDay);

        return routineDayMapper.toResponse(savedRoutineDay);
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
