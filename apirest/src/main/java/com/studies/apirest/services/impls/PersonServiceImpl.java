package com.studies.apirest.services.impls;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.studies.apirest.models.Person;
import com.studies.apirest.repositories.PersonRepository;
import com.studies.apirest.repositories.RoleRepository;
import com.studies.apirest.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Override
	public Person create(Person person) {
		person.setRoles(person.getRoles().stream().map(role -> roleRepository.findByName(role.getName())).collect(Collectors.toSet()));
		return personRepository.save(person);
	}

	@Override
	public ResponseEntity<Object> findAll() {		
		List<Person> dbPersons = personRepository.findAll();
		if(dbPersons.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(dbPersons, HttpStatus.OK);
	}

	public Object findById(Long id) {
		return personRepository.findById(id);
	}

	@Override
	public ResponseEntity<Object> delete(Long id) {
		Optional<Person> dbPerson = this.personRepository.findById(id);
		if(dbPerson.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			personRepository.deleteById(id);
			return new ResponseEntity<>(dbPerson, HttpStatus.OK);
		}
	}

	@Override
	public ResponseEntity<Object> update(Person person) {
		
		Optional<Person> dbPerson = this.personRepository.findById(person.getId());
		if(dbPerson.equals(null)) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			personRepository.save(person);
			return new ResponseEntity<>(person, HttpStatus.OK);
		}
	}

}
