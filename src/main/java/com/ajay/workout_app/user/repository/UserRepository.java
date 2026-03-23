package com.ajay.workout_app.user.repository;

import com.ajay.workout_app.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
