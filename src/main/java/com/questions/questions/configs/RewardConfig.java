package com.questions.questions.configs;

import com.questions.questions.models.Reward;
import com.questions.questions.repositories.RewardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RewardConfig {

    @Bean
    CommandLineRunner commandLineRunnerReward(RewardRepository rewardRepository){
        return args -> {
           Reward reward = new Reward(52, 1, 1);
          // rewardRepository.save(reward);
        };

    }
}
