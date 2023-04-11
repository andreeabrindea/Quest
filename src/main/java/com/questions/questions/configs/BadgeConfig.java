package com.questions.questions.configs;

import com.questions.questions.models.Badge;
import com.questions.questions.repositories.BadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;



@Configuration
public class BadgeConfig {
    @Autowired
    private BadgeRepository badgeRepository;

    @Bean
    CommandLineRunner commandLineRunnerBadge(){
        return args -> {
            Badge badge = new Badge("New Member", "Welcome", "Let the cutest cat win");
            badgeRepository.save(badge);
            // Retrieve all badges from the repository and print them
            List<Badge> badges = (List<Badge>) badgeRepository.findAll();
            System.out.println(badges);
        };
    }
}





