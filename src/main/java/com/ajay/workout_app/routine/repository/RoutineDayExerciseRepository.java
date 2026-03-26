package com.ajay.workout_app.routine.repository;

import com.ajay.workout_app.routine.entity.RoutineDayExercise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoutineDayExerciseRepository extends JpaRepository<RoutineDayExercise, UUID> {
}

