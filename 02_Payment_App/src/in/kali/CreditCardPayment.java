package in.kali;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean payBill(double amt) {
		System.out.println("Credit-card payment processing...");
		return true;
	}

}
