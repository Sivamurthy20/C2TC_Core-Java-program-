package com.tnsif.day8.interfaces.instanceofinterface;

public class Jio implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using jio");
		
	}

	@Override
	public void sms() {
		System.out.println("Messageing using Samsung");
		
	}
	
	
}
