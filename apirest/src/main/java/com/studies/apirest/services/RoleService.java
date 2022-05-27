package com.studies.apirest.services;

import java.util.List;

import com.studies.apirest.models.Role;

public interface RoleService {

	Role create(Role role);
	
	List<Role> findAll();
	
	Object findById(Long id);
}
