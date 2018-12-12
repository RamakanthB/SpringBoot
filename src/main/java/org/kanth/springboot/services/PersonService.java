package org.kanth.springboot.services;

import java.util.List;

import org.kanth.springboot.po.Person;

public interface PersonService {
	public List<Person> getAllPersons();

	public Person getPersonDetailsByPid(String pid);

	public void addPerson(Person person);

	public void updatePerson(Person person, String pid);

	public void deletePerson(String pid);
}
