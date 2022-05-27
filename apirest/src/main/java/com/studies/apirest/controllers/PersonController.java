package com.studies.apirest.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Person")
@CrossOrigin(origins = "*")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping(value = "/person/findAll")
	@ApiOperation(value = "List of all persons in DB")
	public ResponseEntity<Object> findAll(){
		return personService.findAll();
	}
	
	@GetMapping(value = "/person/{id}")
//	@ApiOperation(value = "Find person by their ID")
	public Object findById(
			@PathVariable(value = "id") Long id){
		return personService.findById(id);
	}
	
	@PostMapping(value = "/person/create")
//	@ApiOperation(value = "Create person")
	public Person create(@RequestBody Person person) {
		return personService.create(person);
	}
	
	@DeleteMapping(value = "/person/{id}")
//	@ApiOperation(value = "Delete person")
	public ResponseEntity<Object> delete(
			@PathVariable(value = "id") Long id) {
		return personService.delete(id);
	}
	
	@PutMapping(value = "/person/update")
//	@ApiOperation(value = "Update person")
	public ResponseEntity<Object> update(
			@RequestBody Person person) {
		return personService.update(person);
	}
	
}
