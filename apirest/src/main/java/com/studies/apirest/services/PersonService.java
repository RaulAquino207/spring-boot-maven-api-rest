package com.studies.apirest.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.studies.apirest.models.Person;

public interface PersonService {
	
	Person create(Person person);
	
	ResponseEntity<Object> findAll();
	
	Object findById(Long id);

}
