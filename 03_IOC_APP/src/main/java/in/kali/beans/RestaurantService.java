package in.kali.beans;

public class RestaurantService {
	
	private Ipayment payment;
	
	public RestaurantService() {
		System.out.println("RestaurantService :: 0-param Constructor");
	}
	
	public RestaurantService(Ipayment payment) {
		System.out.println("RestaurantService :: Constructor");
		this.payment=payment;
	}
	
	public void setPayment(Ipayment payment) {
		System.out.println("setter-method called...");
		this.payment=payment;
	}
	
	public void processPayment(double amt) {
		boolean status=payment.payBill(amt);
		
		if(status) {
			System.out.println("Payment completed");
		}else {
			System.out.println("Payment failed....");
		}
	}

}
