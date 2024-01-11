package com.example.validation.controller;

import com.example.validation.model.UserRegisterRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @PostMapping("")
    public UserRegisterRequest register(
    //요청받을 데이터 모델 필요
        @Valid
        @RequestBody
        UserRegisterRequest userRegisterRequest
    ){
        log.info("{}",userRegisterRequest);

        return userRegisterRequest;
    }
}
