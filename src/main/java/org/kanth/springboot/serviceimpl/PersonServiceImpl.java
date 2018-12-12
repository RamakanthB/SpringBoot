package org.kanth.springboot.serviceimpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.kanth.springboot.po.Person;
import org.kanth.springboot.services.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

	private List<Person> personList = new ArrayList<>(
			Arrays.asList(new Person("Sanjay", 27, "M", "p001"), new Person("Kanth", 27, "M", "b001"),
					new Person("Raju", 27, "M", "v001"), new Person("Hema", 27, "F", "b002")));

	@Override
	public List<Person> getAllPersons() {
		return personList;
	}

	@Override
	public Person getPersonDetailsByPid(String pid) {

		Person person = personList.stream().filter(k -> k.getPid().equals(pid)).findFirst().get();

		if (person == null)
			return new Person();
		else
			return person;
	}

	@Override
	public void addPerson(Person person) {
		this.personList.add(person);

	}

	@Override
	public void updatePerson(Person person, String pid) {
		personList.forEach(k -> {
			if (k.getPid().equals(pid)) {
				k.setName(person.getName());
				k.setAge(person.getAge());
				k.setSex(person.getSex());
			}
		});

	}

	@Override
	public void deletePerson(String pid) {
		personList.removeIf(p->p.getPid().equals(pid));
	}

}
