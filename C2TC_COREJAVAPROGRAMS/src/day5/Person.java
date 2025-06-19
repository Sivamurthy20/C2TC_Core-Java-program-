package day5;

public class Person {
	
	private String name;
	private int id;
	private String city;
	public Person()
	{
		System.out.println("Default Constructor");
		this.id = 1002;
		this.name = "Siva";
		this.city = "KK Nagar";
	}
	
	public Person(int id, String name,String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", city=" + city + "]";
	}
	
	
}
