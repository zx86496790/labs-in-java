package assignment3;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RecurringBillPayment extends BillForm implements ChequeGenerator {
	private String startDate;
	private String endDate;
	Scanner scanner=new Scanner(System.in);
	@Override
	public void getFormInfo() {
		// TODO Auto-generated method stub
		System.out
				.println("please input the the payee, amount,start date and end date(use space to divide them)");
		String[] info = scanner.nextLine().split(" ");
		setName(info[0]);
		setPayment(Double.parseDouble(info[1]));
		startDate=info[2];
		endDate=info[3];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		String date = sdf.format(new java.util.Date());
		setDateOfPayment(date);
		setUniqueNumber(generateNextNumber());
	}

	@Override
	public void printCheque() {
		// TODO Auto-generated method stub
		System.out.println("Bill details: unique number is "+getIdentifier()+" name "+getName()+" amount "+getPayment()+" payment date is "+getDateOfPayment()+" start date is "+startDate+" end date is "+endDate);
	}
}
