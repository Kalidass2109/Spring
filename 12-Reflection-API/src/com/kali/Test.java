package com.kali;

import java.lang.reflect.Field;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {
		
		//Using reflection API we can access private variable
		Class<?> cls = Class.forName("com.kali.User");

		  Object object = cls.newInstance();
		  
		  Field ageField = cls.getDeclaredField("age"); //loading variable
		  ageField.setAccessible(true); //making variable accessible
		  ageField.set(object, ageField); //setting value to variable
		  
		  User u = (User) object;
		  int age = u.getAge();
		  System.out.println("User Age :: "+age);
	}

}
