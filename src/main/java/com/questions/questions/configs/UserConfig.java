package com.questions.questions.configs;

import com.questions.questions.models.User;
import com.questions.questions.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner commandLineRunnerUser(UserRepository userRepository){
        return args -> {
            User user = new User("John", "1234","john@gmail.com" ,100, 52);
            userRepository.save(user);
        };
    }
}
