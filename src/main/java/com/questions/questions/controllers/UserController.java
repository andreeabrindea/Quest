package com.questions.questions.controllers;

import com.questions.questions.models.User;
import com.questions.questions.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value="/users", method = RequestMethod.GET)
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping(value="/user")
    public void registerUser(@RequestBody User user){
        userService.addNewUser(user);
    }
}
