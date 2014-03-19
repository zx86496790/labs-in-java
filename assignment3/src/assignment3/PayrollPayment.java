package assignment3;

public class PayrollPayment implements ChequeGenerator {
	private String number;
	private String name;
	private double amount;
	private String dateOfPayment;

	public PayrollPayment(String number, String name, double amount,
			String dateOfPayment) {
		super();
		this.number = number;
		this.name = name;
		this.amount = amount;
		this.dateOfPayment = dateOfPayment;
	}

	@Override
	public void printCheque() {
		// TODO Auto-generated method stub
		System.out.println("Payroll details: unique number is "+number+" name "+name+" amount "+amount+" payment date is "+dateOfPayment);
	}

}
