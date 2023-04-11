package com.questions.questions.configs;

import com.questions.questions.models.Badge;
import com.questions.questions.repositories.BadgeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BadgeConfig {
    @Bean
    CommandLineRunner commandLineRunnerBadge(BadgeRepository badgeRepository){
        return args -> new Badge(1,"New Member", "You just registered","https://cdn-icons-png.flaticon.com/512/891/891448.png" );
    }
}
