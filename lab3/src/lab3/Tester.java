package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
/*people is the parent class for employee and customer, employee class is parent class for
 *  full time employee and part time employee
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		ArrayList<People> al=new ArrayList<People>();
		String temp=scanner.nextLine();
		while(temp.equalsIgnoreCase("end")==false)//if the line read in is not end, then it 
			//represents a child class of people class
		{
			String[] info=temp.split(" ");
			if(info[0].equalsIgnoreCase("employee"))//if the line is employee, check the type
			{
				if(info[3].equalsIgnoreCase("salary"))
				{
					FullTimeEmployee fte=new FullTimeEmployee();
					fte.setName(info[1]);
					fte.setSalary(Double.parseDouble(info[4]));
					al.add(fte);
				}
				else if
				(info[3].equalsIgnoreCase("rate"))
				{
					PartTimeEmployee pte=new PartTimeEmployee();
					pte.setHourlyRate(Double.parseDouble(info[4]));
					pte.setName(info[1]);
					al.add(pte);
				}
				else if(info[3].equalsIgnoreCase("worked"))
				{
					for(People p:al)
					{
						if(p.getName().equalsIgnoreCase(info[1]))
						{
							((PartTimeEmployee)p).setHoursWorked(Double.parseDouble(info[4]));
						}
					}
				}
				temp=scanner.nextLine();
				
			}
			else if(info[0].equalsIgnoreCase("customer"))
			{//check whether the customer already exists, if exists, do not init a new one
				//just set the field
				boolean flag= false;
				for(People p:al)
				{
					if(p.getName().equalsIgnoreCase(info[1]))
					{
						((Customer)p).setTotalPurchase(Double.parseDouble(info[3]));
						flag=true;
					}
				}
				if(flag==false)
				{
					Customer c=new Customer();
					c.setName(info[1]);
					c.setTotalPurchase(Double.parseDouble(info[3]));
					al.add(c);
				}
				temp=scanner.nextLine();
			}
		}
		for(People p:al)
		{
			if(p instanceof Employee)
			{
				System.out.println(((Employee)p).toString());
			}
			else if(p instanceof Customer)
			{
				System.out.println(((Customer)p).toString());
			}
		}
	}

}
