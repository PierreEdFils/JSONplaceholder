package com.careerdevs.JSONplaceholder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JHPApplication {

	@GetMapping("/")
	public String rootRoute(){
		 return "You are Home ";
	}

	public static void main(String[] args) {
		SpringApplication.run(JHPApplication.class, args);
	}

}
