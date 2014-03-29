package lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Record {
	private String cust_id;
	private String cust_first;
	private String cust_last;
	HashMap<Integer, Details> hm = new HashMap<Integer, Details>();
	
	public Record(String cust_id, String cust_first, String cust_last) {
		super();
		this.cust_id = cust_id;
		this.cust_first = cust_first;
		this.cust_last = cust_last;
	}
	
	public String getCust_id() {
		return cust_id;
	}

	public void setCust_id(String cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_first() {
		return cust_first;
	}

	public void setCust_first(String cust_first) {
		this.cust_first = cust_first;
	}

	public String getCust_last() {
		return cust_last;
	}

	public void setCust_last(String cust_last) {
		this.cust_last = cust_last;
	}

	public void addRecord(int itemID,int numberPurchased,String description)
	{
		boolean flag=false;
		for(Entry<Integer, Details> e:hm.entrySet())
		{
			if(e.getKey()==itemID)
			{
				e.getValue().setNumberOfPurchasedItems(e.getValue().getNumberOfPurchasedItems()+numberPurchased);
				flag=true;
			}
		}
		if(flag==false)
		{
			hm.put(itemID, new Details(itemID, numberPurchased,description));
		}
	}
	public void display()
	{
		String temp=cust_id+" "+cust_first+" "+cust_last+"has bought \n";
		for(Entry<Integer, Details> e:hm.entrySet())
		{
			temp+=e.getValue().getItemID()+" "+e.getValue().getNumberOfPurchasedItems()+" "+e.getValue().getDescription()+"\n";
		}
		System.out.println(temp);
	}
}
