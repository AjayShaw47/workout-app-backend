package com.ajay.workout_app.exercise.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "muscle_groups")
@Getter
@Setter
@NoArgsConstructor
public class MuscleGroup {
    @Id
    private Short id;

    @Column(name = "name",length = 100,unique = true,nullable = false)
    private String name;
}
