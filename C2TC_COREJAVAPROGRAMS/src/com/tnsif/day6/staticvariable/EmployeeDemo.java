package com.tnsif.day6.staticvariable;

public class EmployeeDemo {

	public static void main(String[] args) {
		
		System.out.println(Employee.companyName);
		Employee e = new Employee("Siva", 1000);
		System.out.println(e);
		
		e = new Employee("Murthy", 1001);
		System.out.println(e);
	}
}
