package com.app.j3.app_j3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:values.properties")
public class AppJ3Application {

	public static void main(String[] args) {
		SpringApplication.run(AppJ3Application.class, args);
	}

}
