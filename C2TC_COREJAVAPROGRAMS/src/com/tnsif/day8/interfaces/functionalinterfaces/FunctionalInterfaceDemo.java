package com.tnsif.day8.interfaces.functionalinterfaces;

public class FunctionalInterfaceDemo {
	
	public static void main (String[] args) {
		GreetClass g = new GreetClass();
		System.out.println(g.greet());
		
		//using Lambda Expression
		GreetInterface g1 = () -> "Good Aftternoon";
		
		System.out.println(g1.greet());
		
	}
}
