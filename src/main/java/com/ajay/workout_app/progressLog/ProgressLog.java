package com.ajay.workout_app.progressLog;

import com.ajay.workout_app.exercise.Exercise;
import com.ajay.workout_app.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "progress_logs")
@Getter
@Setter
@NoArgsConstructor
public class ProgressLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "best_weight_kg", precision = 6, scale = 2)
    private BigDecimal bestWeightKg;

    @Column(name = "best_reps")
    private Integer bestReps;

    @Column(name = "total_volume",precision = 10,scale = 2)
    private BigDecimal totalVolume;

    @Column(name = "log_date",nullable = false,updatable = false)
    private LocalDate logDate = LocalDate.now();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exercise_id",nullable = false)
    private Exercise exercise;
}
