package com.ajay.workout_app.user.service;

import com.ajay.workout_app.user.dto.CreateUserRequest;
import com.ajay.workout_app.user.dto.ProfileResponse;
import com.ajay.workout_app.user.dto.UpdateProfileRequest;
import com.ajay.workout_app.user.dto.UserResponse;
import com.ajay.workout_app.user.entity.User;
import com.ajay.workout_app.user.entity.UserProfile;
import com.ajay.workout_app.user.mapper.UserMapper;
import com.ajay.workout_app.user.repository.UserProfileRepository;
import com.ajay.workout_app.user.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final UserProfileRepository userProfileRepository;

    public UserResponse getUser(UUID id) {
        User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        return userMapper.toResponse(user);
    }

    public User createUser(@RequestBody CreateUserRequest request){
        User user = new User();
        user.setEmail(request.email());
        user.setPasswordHash(request.password());

        UserProfile profile = new UserProfile();
        profile.setUser(user);
        user.setProfile(profile);

        return userRepository.save(user);

    }

    public ProfileResponse getProfile(UUID id) {
        User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        UserProfile profile = user.getProfile();
        return userMapper.toResponse(profile);

    }

    @Transactional
    public ProfileResponse updateProfile(UUID id, UpdateProfileRequest request) {
        User user = userRepository.findById(id).orElseThrow(()->new RuntimeException("User not found"));
        UserProfile profile = user.getProfile();

        if(request.name() != null)
            profile.setName(request.name());
        if(request.avatarUrl() != null)
            profile.setAvatarUrl(request.avatarUrl());
        if(request.dateOfBirth() != null)
            profile.setDateOfBirth(request.dateOfBirth());
        if(request.gender() != null)
            profile.setGender(request.gender());
        if(request.heightCm() != null)
            profile.setHeightCm(request.heightCm());
        if(request.weightKg() != null)
            profile.setWeightKg(request.weightKg());
        if(request.fitnessGoal() != null)
            profile.setFitnessGoal(request.fitnessGoal());

        UserProfile updatedProfile =  userProfileRepository.save(profile);

        return userMapper.toResponse(updatedProfile);

    }
}
