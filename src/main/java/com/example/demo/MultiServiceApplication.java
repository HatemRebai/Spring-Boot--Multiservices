package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@EntityScan(basePackages= {"com.example.demo.entities"})
//@EnableWebSecurity
@SpringBootApplication
public class MultiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiServiceApplication.class, args);
	}

}
