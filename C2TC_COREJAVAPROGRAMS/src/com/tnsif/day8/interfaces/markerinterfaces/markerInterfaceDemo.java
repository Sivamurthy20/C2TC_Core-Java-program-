package com.tnsif.day8.interfaces.markerinterfaces;

public class markerInterfaceDemo {
	
	public static void main(String[] args) {
		Student s=new Student(101,"Sivamurthy",12000,"C++");
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
	}
}
