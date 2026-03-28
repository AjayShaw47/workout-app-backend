package com.ajay.workout_app.workout.repository;

import com.ajay.workout_app.workout.entity.Workout;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface WorkoutRepository extends JpaRepository<Workout, UUID> {
    @EntityGraph(attributePaths = {"workoutExercises", "workoutExercises.exercise", "workoutExercises.sets"})
    Optional<Workout> findWithDetailsById(UUID id);
}
