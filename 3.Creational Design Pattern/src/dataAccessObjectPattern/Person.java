package dataAccessObjectPattern;

public class Person {

	private String name;
	private int age;
	private String gender;
	private String address;

	public Person(String name, int age, String gender, String address) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return this.getName()+" : "+this.getAge()+" : "+this.getAge()+" : "+this.getAddress();
	}
	
	

}
