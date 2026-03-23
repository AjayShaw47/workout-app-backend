package com.ajay.workout_app.user.controller;

import com.ajay.workout_app.user.dto.CreateUserRequest;
import com.ajay.workout_app.user.dto.ProfileResponse;
import com.ajay.workout_app.user.dto.UpdateProfileRequest;
import com.ajay.workout_app.user.dto.UserResponse;
import com.ajay.workout_app.user.entity.User;
import com.ajay.workout_app.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/{userId}")
    public UserResponse getUser(@PathVariable UUID userId){
        return userService.getUser(userId);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequest request){
        User user = userService.createUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }

    @GetMapping("/{userId}/profile")
    public ProfileResponse getProfile(@PathVariable UUID userId){
        return userService.getProfile(userId);

    }

    @PatchMapping("/{userId}/profile")
    public ProfileResponse updateProfile(@PathVariable UUID userId, @RequestBody UpdateProfileRequest request){
        return userService.updateProfile(userId,request);
    }
}
