package com.tnsif.day6.unsingfinal;

final class FinalClass {
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

public class FinalChildDemo {
	public static void main(String[] args) {
		
		FinalClass f1 = new FinalClass(); 
		f1.show();
	}
}
