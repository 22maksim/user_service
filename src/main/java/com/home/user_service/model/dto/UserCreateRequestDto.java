package com.home.user_service.model.dto;

import com.home.user_service.model.enums.UserRole;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateRequestDto implements Serializable {

    @NotEmpty
    private String id; // UUID генерируется в auth-service и передается при регистрации нового пользователя с ролью, email

    @NotEmpty
    private String email;

    @NotEmpty
    private String firstname;

    @NotEmpty
    private String lastname;

    @NotNull
    private UserRole role; // задается в auth-service

}
