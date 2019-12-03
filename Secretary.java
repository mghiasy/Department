package lab2.prog2_5;

public class Secretary extends DeptEmployee {
	public Secretary(String name, double salary, int yearOfHire, int monthOfHire, int dayOfHire, double overtimeHours) {
		super(name, salary, yearOfHire, monthOfHire, dayOfHire);
		this.overtimeHours = overtimeHours;
		// TODO Auto-generated constructor stub
	}

	private double overtimeHours;

	public double getOverHours() {
		return overtimeHours;
	}

	public void setOverHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}

	// DYNAMIC OVERRIDE:
	// SAME METHOD NAME & SAME PARAMETERS
	// IN RUNTIME IT WILL BE SPECIFIED WHICH METHOD TO BE INVOKED
	@Override
	protected double computeSalary() {
		double salary = super.salary + (12 * overtimeHours);
		return salary;
	}
}
