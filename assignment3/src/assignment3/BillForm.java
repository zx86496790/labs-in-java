package assignment3;

public abstract class BillForm implements ChequeGenerator {
	private static int identifier=0;
	private int uniqueNumber;
	private String name;
	private double payment;
	private String dateOfPayment;
	
	
	public int getUniqueNumber() {
		return uniqueNumber;
	}
	public void setUniqueNumber(int uniqueNumber) {
		this.uniqueNumber = uniqueNumber;
	}
	public static int getIdentifier() {
		return identifier;
	}
	public static void setIdentifier(int identifier) {
		BillForm.identifier = identifier;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public String getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public abstract void getFormInfo(); 
	public static int generateNextNumber()
	{
		return identifier++;
	}
}
