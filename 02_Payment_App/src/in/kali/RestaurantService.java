package in.kali;

public class RestaurantService {
	
	IPayment payment;
	
	public RestaurantService(IPayment payment) {
		this.payment=payment;
	}
	public void setPayment(IPayment payment) {
		this.payment=payment;
	}
	
	public void collectBill(double amt) {
		boolean status=payment.payBill(amt);
		
		if(status) {
			System.out.println("payment success.. thank you...");
		}else {
			System.out.println("card declined...");
		}
	}

}
