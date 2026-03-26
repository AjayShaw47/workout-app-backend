package com.ajay.workout_app.routine.entity;

import com.ajay.workout_app.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

@Entity
@Table(name = "routine_days", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "day_of_week"}))
@Getter
@Setter
@NoArgsConstructor
public class RoutineDay {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "day_of_week", nullable = false)
    private Short dayOfWeek;

    @Column(length = 150)
    private String name;

    @CreationTimestamp
    @Column(name = "created_at", nullable = false, updatable = false)
    private OffsetDateTime createdAt;

    @OneToMany(mappedBy = "routineDay", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @OrderBy("orderIndex ASC")
    private List<RoutineDayExercise> routineDayExercises = new ArrayList<>();

}
