package lab4;

public class Sale {
	//this is a class which represents a sale in the requirement.  
	private double totalPrice;//price of each sale
	private int totalNumber;//number of item sold of the sale

	public Sale() {
		//initialize the number and price of the sale at the beginning
		this.totalPrice = 0;
		this.totalNumber = 0;
	}
	public void addItem(double price)
	{
		/*each time in the console, a line is read in, we should add the number of items sold by
		  1 and add the price of the item to total price of the sale
		*/
		totalPrice+=price;
		totalNumber++;
	}
	public String toString() {
		//return a line to print on the screen
		return "Price of the sale is : "+totalPrice+". Number of the sale is : "+totalNumber;
	}
}
