package com.ajay.workout_app.exercise.entity;

import com.ajay.workout_app.exercise.enums.Category;
import com.ajay.workout_app.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

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

    @Column(name="category",nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;

    @Column(name="muscle_group",length = 100)
    private String muscleGroup;

    @Column(name="equipment",length = 100)
    private String equipment;

    @Column(name="instructions",columnDefinition = "TEXT")
    private String instructions;

    @Column(name = "is_custom",nullable = false)
    private Boolean isCustom = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "created_by")
    private User createdBy;

    @CreationTimestamp
    @Column(name = "created_at",nullable = false, updatable = false)
    private OffsetDateTime createdAt;
}
