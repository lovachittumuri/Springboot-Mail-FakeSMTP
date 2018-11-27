package com.example.DemoMail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class DemoMailApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMailApplication.class, args);
	}

}
