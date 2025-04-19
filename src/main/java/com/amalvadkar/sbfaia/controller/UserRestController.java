package com.amalvadkar.sbfaia.controller;

import com.amalvadkar.sbfaia.entities.UserEntity;
import com.amalvadkar.sbfaia.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserRestController {

    private final UserRepo userRepo;

    @GetMapping("/fetch-users")
    public List<UserEntity> fetchUsers(){
        return userRepo.findAll();
    }

}
