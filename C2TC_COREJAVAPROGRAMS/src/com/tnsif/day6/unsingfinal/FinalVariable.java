package com.tnsif.day6.unsingfinal;

public class FinalVariable {

	final int x = 100;

	final static int Y;

	final static int Z = 10;

	void change() {
		
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", Y" + Y + "]";
	}

	
	static {
		Y = 20; 
		System.out.println("Value of Y: " + Y);
	}

}