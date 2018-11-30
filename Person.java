package learn.java8.lambda;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	public Person(String firstName, String lasstName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lasstName;
		this.age = age;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lasstName) {
		this.lastName = lasstName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [ firstName: " + firstName + " lastname: " + lastName + "age:" + age +"]";
	}
	
}
