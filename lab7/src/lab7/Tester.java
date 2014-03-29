package lab7;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		while (temp.equalsIgnoreCase("end") == false) {
			String first = temp.split(":")[0];
			if (first.equalsIgnoreCase("add")) {
				hm.put(temp.split(":")[2], temp.split(":")[1]);
			}
			else if (first.equalsIgnoreCase("list")) {
				for (Entry<String, String> e : hm.entrySet()) {
					System.out.println(e.getKey() + " wrote " + e.getValue());
				}
			} else {
				for (Entry<String, String> e : hm.entrySet()) {
					if (temp.split(":")[1].equals(e.getKey())) {
						System.out.println(e.getKey() + " wrote "
								+ e.getValue());
					}
				}
			}
			temp=scanner.nextLine();
		}
	}

}
