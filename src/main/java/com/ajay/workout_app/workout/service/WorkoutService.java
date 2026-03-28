package com.ajay.workout_app.workout.service;

import com.ajay.workout_app.routine.entity.RoutineDay;
import com.ajay.workout_app.routine.entity.RoutineDayExercise;
import com.ajay.workout_app.routine.repository.RoutineDayRepository;
import com.ajay.workout_app.user.entity.User;
import com.ajay.workout_app.user.repository.UserRepository;
import com.ajay.workout_app.workout.dto.WorkoutPatchRequestDTO;
import com.ajay.workout_app.workout.dto.WorkoutResponseDTO;
import com.ajay.workout_app.workout.entity.Workout;
import com.ajay.workout_app.workout.entity.WorkoutExercise;
import com.ajay.workout_app.workout.mapper.WorkoutMapper;
import com.ajay.workout_app.workout.repository.WorkoutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class WorkoutService {
    private final WorkoutRepository workoutRepository;
    private final UserRepository userRepository;
    private final WorkoutMapper workoutMapper;
    private final RoutineDayRepository routineDayRepository;

    public WorkoutResponseDTO createWorkout(UUID userId, Short dayOfWeek) {
        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        RoutineDay routine = routineDayRepository.findByUserIdAndDayOfWeek(userId, dayOfWeek).orElse(null);

        Workout workout = new Workout();
        workout.setUser(user);

        if(routine != null) {
            List<RoutineDayExercise> routineExercises = routine.getRoutineDayExercises();

            Set<WorkoutExercise> workoutExercises = routineExercises.stream().map(re -> {
                WorkoutExercise we = new WorkoutExercise();
                we.setWorkout(workout);
                we.setExercise(re.getExercise());
                we.setOrderIndex(re.getOrderIndex());
                return we;
            }).collect(Collectors.toCollection(LinkedHashSet::new));
            workout.setWorkoutExercises(workoutExercises);
        }

        Workout savedWorkout = workoutRepository.save(workout);
        return workoutMapper.toWorkoutResponseDTO(savedWorkout);
    }

    @Transactional
    public void deleteWorkout(UUID workoutId) {
        if (!workoutRepository.existsById(workoutId)) {
            throw new RuntimeException("Workout not found");
        }
        workoutRepository.deleteById(workoutId);
    }

    public WorkoutResponseDTO getWorkout(UUID workoutId) {
        Workout workout = workoutRepository.findWithDetailsById(workoutId).orElseThrow(() -> new RuntimeException("Workout not found"));
        return workoutMapper.toWorkoutResponseDTO(workout);
    }

    @Transactional
    public void patchWorkout(UUID workoutId, WorkoutPatchRequestDTO request) {
        Workout workout = workoutRepository.findById(workoutId)
                .orElseThrow(() -> new RuntimeException("Workout not found"));

        if (request.title() != null) {
            workout.setTitle(request.title());
        }

        workoutRepository.save(workout);
    }
}
