package builderDesignPattern;

public class Application {
	
	public static void main(String[] args) {
		Person person=new Person.Builder(1, "Akash").setAddress("Kundanahalli").setDesignation("SSE").build();
		System.out.println(person);
		Person person1=new Person.Builder(1, "Akash").setDesignation("SSE").build();
		System.out.println(person1);
	}

}
