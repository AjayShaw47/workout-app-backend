package com.ajay.workout_app.food.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Entity
@Table(name = "foods")
@Getter
@Setter
@NoArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name",nullable = false,length = 200)
    private String name;

    @Column(name = "barcode",unique = true,length = 50)
    private String barcode;

    @Column(name = "brand",length = 150)
    private String brand;

    @Column(name = "calories_per_100g",precision = 7,scale = 2,nullable = false)
    private BigDecimal caloriesPer100g;

    @Column(name = "protein_g",precision = 6,scale = 2,nullable = false)
    private BigDecimal proteinG;

    @Column(name = "carbs_g",precision = 6,scale = 2,nullable = false)
    private BigDecimal carbsG;

    @Column(name = "fat_g",precision = 6,scale = 2,nullable = false)
    private BigDecimal fatG;

    @Column(name = "external_api_id",length = 150,unique = true)
    private String externalApiId;

    @CreationTimestamp
    @Column(name = "created_at",nullable = false, updatable = false)
    private OffsetDateTime createdAt;
}
