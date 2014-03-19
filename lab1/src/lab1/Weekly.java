package lab1;

public class Weekly extends Equipment {

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return getPrice() + getPrice() / 7 * (getTime() - 7);
	}

}
