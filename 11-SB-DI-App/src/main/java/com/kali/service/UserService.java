package com.kali.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kali.dao.UserDao;

@Service
public class UserService {
	
	private UserDao userDao;
	
	//@Autowired
	public UserService(UserDao userDao) { //When class only one parameterized constructor writing Autowired annotation is optional
		System.out.println("userService :: param - Constructor");
		this.userDao=userDao;
	}
	
	/*
	@Autowired
	public void setUserDao(UserDao userDao) {
		System.out.println("setUserDao method - called.....");
		this.userDao=userDao;
	}
	*/
	
	public void getName(int id) {
		String name = userDao.findName(id);
		System.out.println("Name : "+name);
	}

}
