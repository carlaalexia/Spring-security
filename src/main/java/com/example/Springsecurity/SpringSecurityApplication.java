package com.example.Springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSecurityApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringSecurityApplication.class, args);
	}

}
