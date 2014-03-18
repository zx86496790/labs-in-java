package lab3;

public abstract class Employee extends People {
	private String employeeNumber;
	private String department;
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public abstract double calculatePay();
	
	public String toString()
	{
	  return getName()+"'s weekly pay is :"+calculatePay(); 
	}

}
