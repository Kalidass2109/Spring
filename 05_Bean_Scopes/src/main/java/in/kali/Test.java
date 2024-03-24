package in.kali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("beans.xml");
		
		//PwdService pwd1= ctxt.getBean(PwdService.class);
		
		//PwdService pwd2= ctxt.getBean(PwdService.class);
		//System.out.println(pwd1.hashCode());
		//System.out.println(pwd2.hashCode());
		//String encodePwd= pwd1.encodePwd("abc@123");
		//System.out.println("Encoded Pwd :: "+encodePwd);
		
		Engine engine= ctxt.getBean(Engine.class);
		engine.doWork();
		
		//in context there is no method to stop IOC container
		//If we want to close IOC container object then we need to go for ConfigurableApplicationContext
		ConfigurableApplicationContext ca= (ConfigurableApplicationContext) ctxt;
		ca.close();
		
	}
}
