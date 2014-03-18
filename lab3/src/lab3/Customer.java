package lab3;

public class Customer extends People {
	private String customerNumber;
	public double totalPurchase;
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public double getTotalPurchase() {
		return totalPurchase;
	}
	public void setTotalPurchase(double totalPurchase) {
		this.totalPurchase += totalPurchase;
	}
	public String toString()
	{
		return "name is "+getName()+" total purchase is "+totalPurchase;
	}
	
}
