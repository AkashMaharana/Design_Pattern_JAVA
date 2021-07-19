package nullObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class Database {
	
	private List<String> customerNames;
	
	public Database() {
		customerNames=new ArrayList<>();
		customerNames.add("Akash");
		customerNames.add("Swati");
		customerNames.add("Pranati");
		customerNames.add("Arati");
		customerNames.add("Minati");
	}
	
	public boolean existCustomer(String name) {
		return customerNames.stream().anyMatch(customerName->customerName.equals(name));
	}
	
	

}
