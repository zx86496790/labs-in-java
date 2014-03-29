package lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input the details");
		String temp=scanner.nextLine();
		ArrayList<Record> al=new ArrayList<Record>();
		while(temp.equalsIgnoreCase("0 end")==false)
		{
			String[] temps=temp.split(" ");
			boolean flag=false;
			for(Record r:al)
			{
				if(temps[0].equalsIgnoreCase(r.getCust_id()))
				{
					flag=true;
					r.addRecord(Integer.parseInt(temps[3]),Integer.parseInt(temps[4]), temps[5]);
				}
			}
			if(flag==false)
			{
				Record r=new Record(temps[0], temps[1], temps[2]);
				r.addRecord(Integer.parseInt(temps[3]),Integer.parseInt(temps[4]), temps[5]);
				al.add(r);
			}
			temp=scanner.nextLine();
		}
		for(Record r:al)
		{
			r.display();
		}
	}

}
