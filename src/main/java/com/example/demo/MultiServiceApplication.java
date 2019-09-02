package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages= {"com.example.demo.entities"})
@SpringBootApplication
public class MultiServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiServiceApplication.class, args);
	}

}
