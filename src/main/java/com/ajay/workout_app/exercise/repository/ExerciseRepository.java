package com.ajay.workout_app.exercise.repository;

import com.ajay.workout_app.exercise.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExerciseRepository extends JpaRepository<Exercise, Short> {
}

