package com.ajay.workout_app.exercise.entity;

import com.ajay.workout_app.exercise.enums.TrackingType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "exercises")
@Getter
@Setter
@NoArgsConstructor
public class Exercise {
    @Id
    private Short id;

    @Column(name="name",nullable = false,length = 150)
    private String name;

    @Column(name="equipment",length = 100)
    private String equipment;

    @Column(name="tracking_type",nullable = false)
    @Enumerated(EnumType.STRING)
    private TrackingType trackingType;

}
