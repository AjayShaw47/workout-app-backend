package com.ajay.workout_app.exercise.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ExerciseMuscleGroupId implements Serializable {
    @Column(name = "exercise_id")
    private Short exerciseId;

    @Column(name = "muscle_group_id")
    private Short muscleGroupId;
}
