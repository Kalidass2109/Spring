package in.kali.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppTest {

	public static void main(String[] args) {
		//starting IOC container
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-beans.xml");

		RestaurantService rs1= context.getBean(RestaurantService.class);
		System.out.println(rs1.hashCode());
		rs1.processPayment(1200);
		//RestaurantService rs2= (RestaurantService) context.getBean("rs");//using id
		
	}

}
