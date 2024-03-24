package in.kali.beans;

public class DebitCardPayment implements Ipayment{

	public DebitCardPayment() {
		System.out.println("DebitCardPayment :: Constructor");
	}
	public boolean payBill(double amt) {
		System.out.println("Debit-Card payment processing....");
		return true;
	}

}
