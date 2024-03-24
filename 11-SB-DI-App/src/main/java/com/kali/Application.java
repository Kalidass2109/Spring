package com.kali;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kali.dao.UserDao;
import com.kali.service.UserService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		//System.out.println(context.getClass().getName());
		//System.out.println(context.getBeanDefinitionCount());
		
		UserService service = context.getBean(UserService.class);
		service.getName(100);
	}

}
