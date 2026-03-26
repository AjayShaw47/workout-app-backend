package com.ajay.workout_app.routine.repository;

import com.ajay.workout_app.routine.entity.RoutineDay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;
import java.util.List;

public interface RoutineDayRepository extends JpaRepository<RoutineDay, UUID> {
    List<RoutineDay> findByUserId(UUID userId);
    java.util.Optional<RoutineDay> findByUserIdAndDayOfWeek(UUID userId, Short dayOfWeek);
}
