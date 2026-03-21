package com.ajay.workout_app.user;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "user_profiles")
@Getter
@Setter
@NoArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name="name",length=100)
    private String name;

    @Column(name="avatar_url", columnDefinition = "TEXT")
    private String avatarUrl;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "height_cm", precision = 5, scale = 2)
    private BigDecimal heightCm;

    @Column(name = "weight_kg", precision = 5, scale = 2)
    private BigDecimal weightKg;

    @Column(name="fitness_goal")
    @Enumerated(EnumType.STRING)
    private FitnessGoal fitnessGoal;

    @UpdateTimestamp
    @Column(name="updated_at",nullable = false)
    private OffsetDateTime updatedAt;
}
