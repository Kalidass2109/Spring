package in.kali;

public class DebitCardPayment implements IPayment{

	@Override
	public boolean payBill(double amt) {
		System.out.println("Debit-card payment processing....");
		//logic
		return true;
	}

}
