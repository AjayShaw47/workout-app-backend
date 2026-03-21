package com.ajay.workout_app.user;

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
@Table(name = "notifications")
@Getter
@Setter
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @Column(name = "type",nullable = false)
    @Enumerated(EnumType.STRING)
    private NotificationType type;

    @Column(name = "title",length = 150,nullable = false)
    private String title;

    @Column(name = "body",columnDefinition = "TEXT")
    private String body;

    @Column(name="metadata",columnDefinition="JSONB", nullable = false)
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, Object> metadata = new HashMap<>();

    @Column(name = "is_read",nullable = false)
    private Boolean isRead = false;

    @Column(name="created_at",nullable = false, updatable = false)
    @CreationTimestamp
    private OffsetDateTime createdAt;
}
