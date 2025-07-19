package Polymorphism.overloadingexample;

public class Executor {
	public static void main(String[] args) 
	{
		System.out.println("1.Addition:"+OverloadingExample.addition("Siva","murthy"));
		System.out.println("2.Addition:"+OverloadingExample.addition(1500, 100));
		System.out.println("2.Addition:"+OverloadingExample.addition(10.0f,21.00f));
		System.out.println("2.Addition:"+OverloadingExample.addition(10.0f,21));
		System.out.println("2.Addition:"+OverloadingExample.addition(21,45.0f));
		Person p1=new Person();
		System.out.println(p1);
		p1=new Person(200, "Sivamurthy");
		System.out.println(p1);
		p1=new Person(300,"Sivamurthy","Chennai");
		System.out.println(p1);
		
		
	}
}
