package com.tnsif.day4.thirdpackages;

public class PrivateConstructorDemo {
	public static void main(String s[]) {
		
		Myclass m=Myclass.getObject();
		m.setId(10);
		
		Myclass m1=Myclass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}