package in.kali.beans;

public class CreditCardPayment implements Ipayment{

	public CreditCardPayment() {
		System.out.println("CreditCard :: Constructor");
	}
	public boolean payBill(double amt) {
		System.out.println("Credit-Card payment processing...");
		return true;
	}

}
