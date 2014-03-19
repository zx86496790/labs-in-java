package assignment3;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ChequeGenerator> al=new ArrayList<ChequeGenerator>();
		InvoicePayment ip=new InvoicePayment();
		ip.getFormInfo();
		RecurringBillPayment rbp=new RecurringBillPayment();
		rbp.getFormInfo();
		PayrollPayment pp=new PayrollPayment("9", "a", 10, "2014-03-21");
		al.add(ip);
		al.add(rbp);
		al.add(pp);
		for(ChequeGenerator cg:al)
		{
			cg.printCheque();
		}
	}

}
