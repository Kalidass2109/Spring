package in.kali;

public class ATM {

	private IPrinter printer;
	
	
	public ATM() {
		System.out.println("ATM:: 0-Param - Constructor");
	}

	public ATM(IPrinter printer) {
		System.out.println("ATM:: Param - Constructor");
		this.printer = printer;
	}

	public void setPrinter(IPrinter printer) {
		System.out.println("setPrinter() - method called...");
		this.printer=printer;
	}

	public void withdraw() {
		System.out.println("withdraw completed...");
		printer.print();
	}
}
