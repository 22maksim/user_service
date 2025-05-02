package com.home.user_service.model.dto;

import com.home.user_service.model.enums.UserRole;
import lombok.Builder;

import java.time.Instant;

@Builder
public record UserResponseDto(
        String id, // UUID генерируется в auth-service и передается при регистрации нового пользователя с ролью, email
        String email,
        String firstname,
        String lastname,
        UserRole role, // задается в auth-service
        Instant createdAt,
        Instant updatedAt
) {
}
