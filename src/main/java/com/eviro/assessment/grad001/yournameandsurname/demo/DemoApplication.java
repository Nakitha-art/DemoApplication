package com.eviro.assessment.grad001.yournameandsurname.demo;
//com.eviro.assessment.grad001.yournameandsurname.demo is the package declaration for the Java class DemoApplication

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //@SpringBootApplication is a Spring Boot annotation that combines several annotations,
	// including @Configuration, @EnableAutoConfiguration, and @ComponentScan.
	//@Configuration indicates that the class contains Spring configuration.
	//@EnableAutoConfiguration enables Spring Boot's auto-configuration feature,
	// which automatically configures the application based on classpath settings,
	// dependencies, and other factors.
	//@ComponentScan instructs Spring Boot to scan the package and its sub-packages for
	// components and services to be managed by Spring

public class DemoApplication { //public class DemoApplication is the main class of the application.
	// It contains the main method, which is the entry point for the Java application.

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	// main calls SpringApplication.run(DemoApplication.class, args) to start the Spring Boot application.

}
