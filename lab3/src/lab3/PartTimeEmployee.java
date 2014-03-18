package lab3;

public class PartTimeEmployee extends Employee {
	private double hourlyRate;
	private double hoursWorked=0;

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked += hoursWorked;
	}

	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}

}
