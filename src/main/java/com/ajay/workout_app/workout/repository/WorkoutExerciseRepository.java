package com.ajay.workout_app.workout.repository;

import com.ajay.workout_app.workout.entity.WorkoutExercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkoutExerciseRepository extends JpaRepository<WorkoutExercise, UUID> {
}
