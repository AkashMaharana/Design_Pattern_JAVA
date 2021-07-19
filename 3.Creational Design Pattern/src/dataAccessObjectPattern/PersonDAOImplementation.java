package dataAccessObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOImplementation implements PersonDAO {
	
	public List<Person> personList=new ArrayList<>();

	@Override
	public void insert(Person person) {
		this.personList.add(person);
	}

	@Override
	public Person removePerson(Person person) throws PersonNotFoundException {
		Person removedPerson =  personList.stream().filter(tempPerson->person.getName().equals(tempPerson.getName()))
				.findFirst()
				.orElseThrow(()->new PersonNotFoundException("The requested perosn is not present in database."));
		personList.remove(removedPerson);
		return removedPerson;
	}

	@Override
	public List<Person> getPersonList() {
		return personList;
	}

}
