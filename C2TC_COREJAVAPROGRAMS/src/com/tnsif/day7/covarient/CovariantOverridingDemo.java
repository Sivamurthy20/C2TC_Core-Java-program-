package com.tnsif.day7.covarient;

public class CovariantOverridingDemo {
	public static void main(String arg[])
			throws CloneNotSupportedException
		{
			// new student object created
			Student student1 = new Student(1, "ECE", "Sivamurthy");
			student1.printData();

			Student student2 = (Student) student1.clone();
			student2.printData();
		
		}
}