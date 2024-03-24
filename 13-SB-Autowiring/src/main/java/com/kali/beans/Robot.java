package com.kali.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//If we don't want to make a singleton, I want to make it as a prototype scope, then define by using scope annotation

@Component
@Scope("prototype")
public class Robot {
	
	@Autowired
	@Qualifier("chip32")
	private IChip chip32;
	//3 ways we can resolve the ambiguity problem
	//1. by giving variable name as component name given in class
	//2. Can Qualifier with bean name if variable name not matching
	//3. can Primary annotation over bean class
	
	public Robot() {
		System.out.println("Robot :: constructor");
	}

	public void doWork() {
		System.out.println("Injected :: "+chip32.getClass().getName());
		boolean status = chip32.process();
		if(status) {
			System.out.println("Robot is working........");
		}else {
			System.out.println("Robot is having fault....");
		}
	}
}
