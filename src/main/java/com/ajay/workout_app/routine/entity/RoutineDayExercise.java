package com.ajay.workout_app.routine.entity;

import com.ajay.workout_app.exercise.entity.Exercise;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "routine_day_exercises", uniqueConstraints = @UniqueConstraint(columnNames = {"routine_day_id", "order_index"}))
@Getter
@Setter
@NoArgsConstructor
public class RoutineDayExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "routine_day_id", nullable = false)
    private RoutineDay routineDay;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id", nullable = false)
    private Exercise exercise;

    @Column(name = "order_index", nullable = false)
    private Integer orderIndex;
}
