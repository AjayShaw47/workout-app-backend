package com.ajay.workout_app.workout.entity;

import com.ajay.workout_app.exercise.entity.Exercise;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "workout_exercises")
@Getter
@Setter
@NoArgsConstructor
public class WorkoutExercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "workout_id",nullable = false)
    private Workout workout;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id",nullable = false)
    private Exercise exercise;

    @Column(name = "order_index",nullable = false)
    private Integer orderIndex;

    @Column(name = "notes",columnDefinition = "TEXT")
    private String notes;

    @Column(name = "superset_group")
    private Integer supersetGroup;

    @OneToMany(mappedBy = "workoutExercise",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<WorkoutSet> sets = new ArrayList<>();
}
