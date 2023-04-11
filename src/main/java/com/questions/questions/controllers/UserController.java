package com.questions.questions.controllers;

import com.questions.questions.models.User;
import com.questions.questions.services.UserService;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(value="/users", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8080")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping(value="/user")
    @CrossOrigin(origins = "http://localhost:8080")
    public void registerUser(@RequestBody User user){

        userService.addNewUser(user);
    }

    @RequestMapping(value="/users/{id}", method = RequestMethod.GET)
    @CrossOrigin(origins = "http://localhost:8080")
    public Object getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);

    }





}
