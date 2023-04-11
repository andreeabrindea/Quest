package com.questions.questions.configs;

import com.questions.questions.models.Vote;
import com.questions.questions.repositories.VoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VoteConfig {
    @Bean
    CommandLineRunner commandLineRunnerVote(VoteRepository voteRepository){
        return args -> {
            Vote vote = new Vote(52, 1, "like");
            //voteRepository.save(vote);
        };
    }
}
