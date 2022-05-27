package com.studies.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.studies.apirest.models.Role;
import com.studies.apirest.services.RoleService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/api")
@Api(value = "Role")
@CrossOrigin(origins = "*")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping(value = "/role/findAll")
	public List<Role> findAll(){
		return roleService.findAll();
	}
	
	@GetMapping(value = "/role/{id}")
	public Object findById(
			@PathVariable(value = "id") Long id){
		return roleService.findById(id);
	}
	
	@PostMapping(value = "/role/create")
	public Role create(@RequestBody Role role) {
		return roleService.create(role);
	}

}
