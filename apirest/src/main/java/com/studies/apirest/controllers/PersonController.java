package com.studies.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studies.apirest.models.Person;
import com.studies.apirest.services.PersonService;

@RestController
@RequestMapping(value = "/api/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<Object> findAll(){
		return personService.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Object findById(
			@PathVariable(value = "id") Long id){
		return personService.findById(id);
	}
	
	@PostMapping(value = "/create")
	public Person create(@RequestBody Person person) {
		return personService.create(person);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Object> delete(
			@PathVariable(value = "id") Long id) {
		return personService.delete(id);
	}
	
	@PutMapping(value = "/update")
	public ResponseEntity<Object> update(
			@RequestBody Person person) {
		return personService.update(person);
	}
	
	
}
