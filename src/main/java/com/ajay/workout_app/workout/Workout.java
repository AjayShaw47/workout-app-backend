package com.ajay.workout_app.workout;

import com.ajay.workout_app.user.User;
import com.ajay.workout_app.workoutExercise.WorkoutExercise;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "workouts")
@Getter
@Setter
@NoArgsConstructor
public class Workout {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="title", length = 150)
    private String title;

    @Column(name="notes", columnDefinition = "TEXT")
    private String notes;

    @Column(name="duration_seconds")
    private Integer durationSeconds;

    @Column(name="performed_at",nullable = false)
    private OffsetDateTime performedAt =OffsetDateTime.now();

    @CreationTimestamp
    @Column(name="created_at",updatable = false,nullable = false)
    private OffsetDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @OneToMany(mappedBy = "workout", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OrderBy("orderIndex ASC")
    private List<WorkoutExercise> workoutExercises = new ArrayList<>();
}
