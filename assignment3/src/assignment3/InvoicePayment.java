package assignment3;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class InvoicePayment extends BillForm implements ChequeGenerator {
	private int numberOfVoice;
	Scanner scanner = new Scanner(System.in);

	@Override
	public void getFormInfo() {
		// TODO Auto-generated method stub
		System.out
				.println("please input the the payee, amount, and the number of the invoice being paid(use space to divide them)");
		String[] info=scanner.nextLine().split(" ");
		setName(info[0]);
		setPayment(Double.parseDouble(info[1]));
		numberOfVoice=Integer.parseInt(info[2]);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");  
		String date=sdf.format(new java.util.Date()); 
		setDateOfPayment(date);
		setUniqueNumber(generateNextNumber());
	}

	@Override
	public void printCheque() {
		// TODO Auto-generated method stub
		System.out.println("Invoice details: unique number is "+getIdentifier()+" name "+getName()+" amount "+getPayment()+" payment date is "+getDateOfPayment()+" number of voice is "+numberOfVoice);
	}
}
