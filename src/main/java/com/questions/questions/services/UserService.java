package com.questions.questions.services;

import com.questions.questions.models.User;
import com.questions.questions.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addNewUser(User user){
       Optional<User> userByName = userRepository.findByName(user.getName());
       Optional<User> userByEmail = userRepository.findByEmail(user.getEmail());
       if (userByEmail.isPresent()){
           throw new IllegalStateException("email taken");
       }
        if (userByName.isPresent()){
            throw new IllegalStateException("username taken");
        }
       userRepository.save(user);
    }

    public List<User> getUsers(){
        return userRepository.findAll();}

    public Optional<User> getUserById(int id){
        return userRepository.findById(id);
    }

    public Optional<User> getUserByName(String name) {
        return userRepository.findByName(name);
    }
}
