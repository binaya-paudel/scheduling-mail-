package com.example.scheduling.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SchedulingEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchedulingEmailApplication.class, args);
	}

}
