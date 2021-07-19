package nullObjectPattern;

public class Application {
	
	public static void main(String[] args) {
		CustomerFactory customerFactory=new CustomerFactory();
		System.out.println(customerFactory.getCustomer("Bikash").getCustomer());
	}

}
