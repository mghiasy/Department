package lab2.prog2_5;

import java.time.LocalDate;

public abstract class DeptEmployee {
	private String name;
	public double salary;
	private LocalDate hireDate;
	public DeptEmployee(String name,double salary, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name=name;
		this.salary=salary;
		this.hireDate=LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	protected double computeSalary() {
		return salary;
	}
}
