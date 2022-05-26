package com.studies.apirest.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studies.apirest.models.Person;
import com.studies.apirest.repositories.PersonRepository;
import com.studies.apirest.services.PersonService;

import lombok.RequiredArgsConstructor;

@Service
//@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Person create(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

}
