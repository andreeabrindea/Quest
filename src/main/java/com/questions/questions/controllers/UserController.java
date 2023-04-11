package com.questions.questions.controllers;

import com.questions.questions.models.Reward;
import com.questions.questions.models.User;
import com.questions.questions.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }
}
