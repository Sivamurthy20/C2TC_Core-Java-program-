package Ploymorphism.overriding;

public class Result {

	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.callArea();
		
        s1=new Square(4.4f);
        s1.callArea();
        
        s1=new Rectangle(4.4d,4.5d);
        s1.callArea();
	}

}
