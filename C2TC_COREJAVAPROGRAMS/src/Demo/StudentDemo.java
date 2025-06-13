package Demo;

public class StudentDemo {
	public static void main (String[] args) {
		student st =  new student();
		st.setId(2004);
		st.setName("sivamurthy");
		st.setAge(20);
		
		System.out.println(st);
				
		student st1 =  new student();
		st1.setId(2005);
		st1.setName("Jhonny");
		st1.setAge(21);
		
		System.out.println(st1);
		
	}

}
