package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CircleciDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircleciDemoApplication.class, args);
	}
	
	@RequestMapping(value="/")
	public String index() {
		return "Welcom!";
	}
}
