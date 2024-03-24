package com.kali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kali.beans.Robot;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(Application.class, args);
		
		Robot robot = context.getBean(Robot.class);
		System.out.println(robot.hashCode());
		robot.doWork();
	}

}
