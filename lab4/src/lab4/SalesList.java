package lab4;

import java.util.ArrayList;
import java.util.Scanner;

public class SalesList {
	//declare an array list of sale type to hold each sale which ends by end keyword
	ArrayList<Sale> al=new ArrayList<Sale>();
	Scanner scanner=new Scanner(System.in);
	String temp;//initialize the variable to the first line the program reads in
	private int number=0;//used to store the total number of items sold in the sale list
	private double totalPrice=0;//used to store the total price of items sold in the sale list
	

	public void calculate()
	{
		System.out.println("Please input the sale of the whole day(sale list)");
		temp=scanner.nextLine();
		while(temp.equalsIgnoreCase("off")==false)//loop to store each sale
		{
			Sale s=new Sale();
			//loop to get each line in a sale
			while(temp.equalsIgnoreCase("end")==false)
			{	number++;
				String[] description=temp.split(" ");
				double price=Double.parseDouble(description[1]);
				totalPrice+=price;
				s.addItem(price);
				temp=scanner.nextLine();
			}
			temp=scanner.nextLine();
			al.add(s);
		}
		for(Sale s :al)
		{
			System.out.println(s.toString());
		}
		System.out.println("Today's sale is "+totalPrice+" and "+number+" items have been sold");
	}
}
