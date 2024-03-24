package com.kail.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kail.util.AppSecurity;

@Configuration
public class AppConfig {

	public AppConfig() {
		System.out.println("AppConfig :: Constructor");
	}
	
	@Bean //method level annotation
	public AppSecurity security() {
		AppSecurity sa=new AppSecurity(); //As I want security for my application, I don't want IOC to create
		//the object, so here programmer creating object using a method
		//Now I want inform IOC container to call this method it will give the object and take it as a spring
		//Bean object (this called bean customization) for that we will use "Bean" annotation
		//logic
		return sa;
	}	

}

