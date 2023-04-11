package com.questions.questions.configs;

import com.questions.questions.models.Quest;
import com.questions.questions.repositories.QuestRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class QuestConfig {
    @Bean
    CommandLineRunner commandLineRunnerQuest(QuestRepository questRepository){
        return args -> {
            Quest quest = new Quest("Cutest Cat", "Let the cutest cat win", 52, 5);
        //    questRepository.save(quest);

        };

    }
}
