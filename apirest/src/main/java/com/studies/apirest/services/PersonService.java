package com.studies.apirest.services;

import java.util.List;

import com.studies.apirest.models.Person;

public interface PersonService {
	
	Person create(Person person);
	
	List<Person> findAll();

}
