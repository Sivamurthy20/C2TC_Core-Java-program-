package Ploymorphism.overriding;

public class Rectangle extends Shape{
	
	private double l , b;
	public Rectangle(double l, double b)
	{
		this.l=l;
		this.b=b;
	}
	@Override
	public void callArea()
	{
		System.out.println("From Rectangle:"+(l*b));
	}
}
