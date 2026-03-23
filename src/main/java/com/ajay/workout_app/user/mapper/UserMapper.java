package com.ajay.workout_app.user.mapper;

import com.ajay.workout_app.user.dto.ProfileResponse;
import com.ajay.workout_app.user.dto.UserResponse;
import com.ajay.workout_app.user.entity.User;
import com.ajay.workout_app.user.entity.UserProfile;
import com.ajay.workout_app.user.enums.FitnessGoal;
import com.ajay.workout_app.user.enums.Gender;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.UUID;

@Component
public class UserMapper {
    public UserResponse toResponse(User user){
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getRole(),
                user.getCreatedAt()
        );

    }

    public ProfileResponse toResponse(UserProfile profile){
        return new ProfileResponse(
                profile.getName(),
                profile.getAvatarUrl(),
                profile.getDateOfBirth(),
                profile.getGender(),
                profile.getHeightCm(),
                profile.getWeightKg(),
                profile.getFitnessGoal()
        );
    }

}
