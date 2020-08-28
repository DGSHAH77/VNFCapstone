package com.cts.capstone.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableAutoConfiguration
@SpringBootApplication
public class CapstoneUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoneUserApplication.class, args);
	}

}
