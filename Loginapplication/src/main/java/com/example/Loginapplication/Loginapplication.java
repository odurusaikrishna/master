package com.example.Loginapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableScheduling
@ComponentScan("com.example.Loginapplication")


public class Loginapplication {

	public static void main(String[] args) {
		SpringApplication.run(Loginapplication.class, args);
		
	}



}
