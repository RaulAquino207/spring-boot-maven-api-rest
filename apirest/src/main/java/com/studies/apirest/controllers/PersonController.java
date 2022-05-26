package com.studies.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

//import java.util.List;

//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studies.apirest.models.Person;
import com.studies.apirest.repositories.PersonRepository;
//import com.studies.apirest.models.Person;
import com.studies.apirest.services.PersonService;

@RestController
@RequestMapping(value = "/api/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/findAll")
	public List<Person> findAll(){
		return personService.findAll();
	}
	
}
