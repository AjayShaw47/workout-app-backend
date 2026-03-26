package com.ajay.workout_app.user.entity;

import com.ajay.workout_app.progress.entity.ProgressLog;
import com.ajay.workout_app.user.enums.OauthProvider;
import com.ajay.workout_app.user.enums.Role;
import com.ajay.workout_app.achievement.entity.UserAchievement;
import com.ajay.workout_app.routine.entity.RoutineDay;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.dialect.PostgreSQLEnumJdbcType;
import org.springframework.context.annotation.Profile;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name="email", nullable = false, unique = true)
    private String email;

    @Column(name="password_hash")
    private String passwordHash;

    @Column(name="oauth_provider")
    @JdbcType(PostgreSQLEnumJdbcType.class)
    @Enumerated(EnumType.STRING)
    private OauthProvider oauthProvider;

    @Column(name="oauth_id")
    private String oauthId;

    @Column(name="role")
    @Enumerated(EnumType.STRING)
    @JdbcType(PostgreSQLEnumJdbcType.class)
    private Role role = Role.USER;

    @Column(name="created_at",nullable = false, updatable = false)
    @CreationTimestamp
    private OffsetDateTime createdAt;

    @UpdateTimestamp
    @Column(name="updated_at",nullable = false)
    private OffsetDateTime updatedAt;

    @OneToOne(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private UserProfile profile;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<ProgressLog> progressLogs = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<UserAchievement> userAchievements = new ArrayList<>();

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<RoutineDay> routineDays = new ArrayList<>();

}
