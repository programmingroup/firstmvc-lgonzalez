package com.lgonzalez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class FirstMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMvcApplication.class, args);
	}

	@GetMapping("/")
	public String hello() {
		return String.format("My first Page Web from Java Spring Boot!");
	}
}
