package exceptionalhandling_Example;

public class ExceptionalExample {

	public static void main(String[] args) {
		try
		{
			int a[]= {6,7,8,4};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.err.println("Exception occured:"+ae.getMessage());
		}
		System.out.print("next line");
	}
}
