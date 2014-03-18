package lab3;

public class FullTimeEmployee extends Employee {
	private double salary;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calculatePay() {
		return salary / 52;
	}
}
