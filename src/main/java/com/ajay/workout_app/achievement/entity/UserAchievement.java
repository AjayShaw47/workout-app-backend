package com.ajay.workout_app.achievement.entity;

import com.ajay.workout_app.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Entity
@Table(name = "user_achievements")
@Getter
@Setter
@NoArgsConstructor
public class UserAchievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="achievement_id",nullable = false)
    private Achievement achievement;

    @CreationTimestamp
    @Column(name = "earned_at",nullable = false)
    private OffsetDateTime earnedAt;

    @Column(name="context",columnDefinition="JSONB", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> context = new HashMap<>();

}
