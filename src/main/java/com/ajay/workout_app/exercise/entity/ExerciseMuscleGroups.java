package com.ajay.workout_app.exercise.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "exercise_muscle_groups")
@Getter
@Setter
@NoArgsConstructor
public class ExerciseMuscleGroups {
    @EmbeddedId
    private ExerciseMuscleGroupId id = new ExerciseMuscleGroupId();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("exerciseId")
    @JoinColumn(name = "exercise_id")
    private Exercise exercise;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("muscleGroupId")
    @JoinColumn(name = "muscle_group_id")
    private MuscleGroup muscleGroup;

    @Column(name = "is_primary", nullable = false)
    private Boolean isPrimary = false;
}
