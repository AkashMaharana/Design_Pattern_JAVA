package dataAccessObjectPattern;

import java.util.List;

public interface PersonDAO {

	public void insert(Person person);
	public Person removePerson(Person person) throws PersonNotFoundException;
	public List<Person> getPersonList();
	
}
