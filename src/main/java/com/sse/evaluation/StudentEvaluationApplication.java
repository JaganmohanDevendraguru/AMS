package com.sse.evaluation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sse")
public class StudentEvaluationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEvaluationApplication.class, args);
	}
}
