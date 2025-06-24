package com.tnsif.day8.interfaceexample;

public class ShoppingMall {
	public static void main(String[] args) {
		Purchase purchase = new Clothes();
		purchase.buying();
		Purchase purchase1 = new Grocery();
		purchase1.buying();
		Purchase purchase2 = new Cosmetics();
		purchase2.buying();
		
	}

}
