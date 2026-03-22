package com.ajay.workout_app.nutrition.entity;

import com.ajay.workout_app.food.entity.Food;
import com.ajay.workout_app.nutrition.enums.MealType;
import com.ajay.workout_app.user.entity.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "nutrition_logs")
@Getter
@Setter
@NoArgsConstructor
public class NutritionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "quantity_g",nullable = false,precision = 7,scale = 2)
    private BigDecimal quantityG;

    @Column(name = "meal_type",nullable = false)
    @Enumerated(EnumType.STRING)
    private MealType mealType;

    @Column(name ="log_date",nullable = false)
    private LocalDate logDate = LocalDate.now();

    @CreationTimestamp
    @Column(name="created_at",updatable = false,nullable = false)
    private OffsetDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_id", nullable = false)
    private Food food;
}
