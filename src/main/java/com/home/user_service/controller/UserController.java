package com.home.user_service.controller;

import com.home.user_service.model.dto.UserCreateRequestDto;
import com.home.user_service.model.dto.UserResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "users",
        description = "Сервис для работы с юзерами, у которых могут быть разные роли и логика"
)
@RestController
@RequestMapping("/users")
public class UserController {

    @Operation(tags = "users", summary = "Создать юзера", description = "После регистрации создает и сохраняет данные" +
            " о пользователе в user-service, имеет роли")
    @PostMapping("/create")
    public ResponseEntity<UserResponseDto> createUser(
            @Parameter(name = "requestDto", description = "Приходит из auth-service после регистрации")
            @RequestBody UserCreateRequestDto requestDto
            ) {


        return null;
    }

}
