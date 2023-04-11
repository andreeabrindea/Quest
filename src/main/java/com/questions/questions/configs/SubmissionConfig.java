package com.questions.questions.configs;

import com.questions.questions.models.Submission;
import com.questions.questions.repositories.SubmissionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class SubmissionConfig {
    @Bean
    CommandLineRunner commandLineRunnerSubmission(SubmissionRepository submissionRepository){
        return args -> {
           Submission submission = new Submission(52, 1, "This is my cat", LocalDate.now());
           submissionRepository.save(submission);
        };
    }
}
