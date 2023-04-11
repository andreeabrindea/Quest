package com.questions.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.questions.questions.models")
public class QuestionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionsApplication.class, args);
	}

}
