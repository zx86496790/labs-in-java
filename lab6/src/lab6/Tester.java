package lab6;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList ml = new MyList(3);
		System.out.println("length of the list is 3");
		try {
			System.out.println("add the first object");
			ml.append(1);
			System.out.println("add the second object");
			ml.append(2);
			System.out.println("add the third object");
			ml.append(3);
			System.out.println("add the fourth object");
			ml.append(4);
		} catch (ListFullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The value in the second position is " + ml.at(1));
		System.out.println("Try to get the value in the fourth position ");
		try {
			System.out.println("The value in the fourth position is "
					+ ml.at(3));
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			aioobe.printStackTrace();
		}
		System.out.println("Try to get the value in the fourth position ");
		System.out.println("Try to delete the fourth value ");
		try {
			ml.remove(3);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			aioobe.printStackTrace();
		}
		System.out.println("Try to delete the second value ");
		try {
			ml.remove(1);
		} catch (ArrayIndexOutOfBoundsException aioobe) {
			aioobe.printStackTrace();
		}
		System.out.println("After delete, the value in the second position is "+ml.at(1));
	}

}
