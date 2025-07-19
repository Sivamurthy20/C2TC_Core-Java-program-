package com.tnsif.day5.hierarchicalinharitance;

public class HierarchicallnhDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(" Person Details ");
		System.out.println(p1);

		Person p;
		p = new Person("Siva", "Chennai");
		if (p instanceof Person)
			System.out.println("Person Details "+p);
		
		p = new Employee("Nikhil", "Chennai", 101, 67000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details "+p);
		

		p = new Student("Pankaj", "Chennai", "FE",100);
		if (p instanceof Student)
			System.out.println("Student Details "+p);

	}

}