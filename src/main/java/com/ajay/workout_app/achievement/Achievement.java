package com.ajay.workout_app.achievement;

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
@Table(name = "achievements")
@Getter
@Setter
@NoArgsConstructor
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="name",length = 150,nullable = false,unique = true)
    private String name;

    @Column(name="description",columnDefinition = "TEXT")
    private String description;

    @Column(name="category",nullable = false)
    @Enumerated(EnumType.STRING)
    private AchievementCategory category;

    @Column(name="icon",length = 100)
    private String icon;

    @Column(name="criteria",columnDefinition="JSONB", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> criteria = new HashMap<>();

    @Column(name="created_at",nullable = false, updatable = false)
    @CreationTimestamp
    private OffsetDateTime createdAt;
}
