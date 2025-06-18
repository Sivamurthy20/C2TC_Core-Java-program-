package com.tnsif.day4.thirdpackages;

public class PrivateConstructorDemo {
	public static void main(String args[]) {
		
		Myclass m=Myclass.getObject();
		m.setId(100);
		
		
		Myclass m1=Myclass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}