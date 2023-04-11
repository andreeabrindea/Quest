package com.questions.questions.services;

import com.questions.questions.models.User;
import com.questions.questions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addNewUser(User user){
        userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();}
}
