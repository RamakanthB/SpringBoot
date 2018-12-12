package org.kanth.springboot.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.kanth.springboot.po.Person;
import org.kanth.springboot.services.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@Resource
	private PersonService personService;

	@GetMapping("/persons")
	public List<Person> getAllPersonDetails() {
		return personService.getAllPersons();
	}

	@GetMapping("/person/{pid}")
	public Person getPersonDetailsbyPid(@PathVariable String pid) {
		return personService.getPersonDetailsByPid(pid);
	}

	@PostMapping("/persons")
	public void addPerson(@RequestBody Person person) {
		personService.addPerson(person);
	}

	@PutMapping("/persons/{pid}")
	public void updatePerson(@RequestBody Person person, @PathVariable String pid) {
		personService.updatePerson(person, pid);
	}

	@DeleteMapping("/person/{pid}")
	public void deletePerson(@PathVariable String pid) {
		personService.deletePerson(pid);
	}
}
