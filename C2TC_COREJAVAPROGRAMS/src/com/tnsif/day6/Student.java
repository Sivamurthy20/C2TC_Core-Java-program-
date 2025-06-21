package com.tnsif.day6;

public class Student {
	private String name;
	private static int id;
	private int regno;

	static {
		System.out.println("Static block i all ways run in first : ");
	}
	
	public Student() {
		id++;
		regno++;
		System.out.println("Constructor Called : ");
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public static int getId() {
		return id;
	}


	public static void setId(int id) {
		Student.id = id;
	}

	public int getRegno() {
		return regno;
	}

	public void setRegno(int regno) {
		this.regno = regno;
	}

	@Override
	public String toString() {
		return "Student [id:" + id + " name=" + name + " regno:" + regno +"]";
	}

}
