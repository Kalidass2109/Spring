package in.kali.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.kali.service.UserService;

public class MyAppTest {

	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("beans.xml");
		
		UserService service= ctxt.getBean(UserService.class);
		String name=service.getName(100);
		System.out.println("user Name :: "+name);
	}
}
