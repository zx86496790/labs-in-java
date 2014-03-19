package lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		/*equipment is parent class of daily and weekly
		 * use the input keyword to check which type the item belongs to and set property
		   at last use a loop to get the total price*/
		double totalPrice=0;
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<Equipment> al = new ArrayList<Equipment>();
		String temp = scanner.nextLine();
		while(temp.equalsIgnoreCase("end")==false)
		{
			String[] info=temp.split(" ");
			if(info[1].equalsIgnoreCase("weekly"))
			{
				Weekly w=new Weekly();
				w.setName(info[0]);
				w.setPrice(Double.parseDouble(info[2]));
				al.add(w);
			}
			else if(info[1].equalsIgnoreCase("daily"))
			{
				Daily d=new Daily();
				d.setName(info[0]);
				d.setPrice(Double.parseDouble(info[2]));
				al.add(d);
			}
			temp=scanner.nextLine();
		}
		temp=scanner.nextLine();
		while(temp.equalsIgnoreCase("end")==false)
		{
			String[] info=temp.split(" ");
			for(Equipment e:al)
			{
				if(info[0].equalsIgnoreCase(e.getName()))
				{
					e.setTime(Double.parseDouble(info[1]));
				}
			}
			temp=scanner.nextLine();
		}
		for(Equipment e:al)
		{
			totalPrice+=e.calculate();
		}
		System.out.println("total price is "+totalPrice);
	}

}
