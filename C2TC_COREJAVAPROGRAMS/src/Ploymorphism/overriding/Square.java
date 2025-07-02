package Ploymorphism.overriding;

public class Square extends Shape {
	public Square(float area)
	{
		super.area=area;
	}
	@Override
	public void callArea()
	{
		System.out.println("From Square class:"+super.area*super.area);
	}

	
}
