package lab2.prog2_5;

public class Professor extends DeptEmployee {
	public Professor(String name, double salary, int yearOfHire, int monthOfHire, int dayOfHire,int numberOfPublications) {
		super(name, salary, yearOfHire, monthOfHire, dayOfHire);
		this.numberOfPublications=numberOfPublications;
		// TODO Auto-generated constructor stub
	}

	private int numberOfPublications;

	public int getNimberOfPublication() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
}
