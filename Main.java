package lab2.prog2_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// UPCASTING : SuperClass obj = new SubClass
		DeptEmployee[] emp = new DeptEmployee[5];
		emp[0] = new Professor("Anna", 20000, 2014, 10, 1, 10);
		emp[1] = new Professor("John", 3000, 2010, 11, 2, 10);
		emp[2] = new Secretary("Harry", 14500, 2013, 10, 1, 200);
		emp[3] = new Secretary("Nina", 16250, 2012, 4, 1, 200);
		emp[4] = new Secretary("Sara", 13200, 2014, 8, 1, 200);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("See the sum of all salaries in department? (y/n)");
		String answer = sc.next();
		if(answer.equalsIgnoreCase("y")){
			String res="";
			for (DeptEmployee deptEmployee : emp) {
				res += "SALARY FOR " + deptEmployee.getName()+":" + deptEmployee.computeSalary()+"\n\n";
			}
			System.out.println(res);
		}
		sc.close();

		// POLYMORPHISM
		// DeptEmployee ee = new Professor("ss", 1000, 2000, 1, 1, 110);
	}

}
