package com.kail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.kali", "com.tcs"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//run method entry point for boot app, 
		//when u run the boot app, the execution will begin from the start class, inside the start class
		//main method is available, inside the main method run method available and run method will execute 
		//some logic
	}

}

/**
@SpringBootApplication is equals to 3 annotations
1. @springBootConfiguration
2. @EnableAutoConfiguration - it will identify configuration required application like if u add a web starter
                              tomcat server is starting, if u add a security starter login page is coming,
                              if u add a jpa starter connection pool is creating, Based on the starters in
                              the pom.xml file IOC container will provide the configuration to run our app
3. @ComponentScan
*/