package lab1;

public class Daily extends Equipment {

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return getTime()*getPrice();
	}

}
