package com.studies.apirest.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.studies.apirest.models.Person;
import com.studies.apirest.repositories.PersonRepository;
import com.studies.apirest.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person create(Person person) {
		return personRepository.save(person);
	}

	@Override
	public ResponseEntity<Object> findAll() {		
//		return personRepository.findAll();
		List<Person> dbPersons = personRepository.findAll();
		if(dbPersons.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(dbPersons, HttpStatus.OK);
	}

	public Object findById(Long id) {
		return personRepository.findById(id);
	}

}
