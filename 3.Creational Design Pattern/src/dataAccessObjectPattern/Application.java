package dataAccessObjectPattern;

public class Application {
	
	public static void main(String[] args) {
		PersonDAO personDAO=new PersonDAOImplementation();
		personDAO.insert(new Person("Akash Maharana",27,"Male","Bengaluru"));
		personDAO.insert(new Person("Swati Maharana",29,"Female","Mumbai"));
		personDAO.insert(new Person("Pranati Maharana",34,"Female","kansbahal"));
		personDAO.insert(new Person("Arati Maharana",36,"Female","Mumbai"));
		personDAO.insert(new Person("Minati Maharana",42,"Female","Rourkela"));
		
		try {
			System.out.println(personDAO.removePerson(new Person("Chandrama Maharana",56,"Female","Rourkela")));
			//System.out.println(personDAO.removePerson(new Person("Minati Maharana",27,"Female","Rourkela")));
		} catch(PersonNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		
		personDAO.getPersonList().forEach(person->System.out.println(person));
	}

}
