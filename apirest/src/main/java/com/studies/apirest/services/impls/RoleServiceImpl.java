package com.studies.apirest.services.impls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studies.apirest.models.Role;
import com.studies.apirest.repositories.RoleRepository;
import com.studies.apirest.services.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public Role create(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public List<Role> findAll() {
		return roleRepository.findAll();
	}

	@Override
	public Object findById(Long id) {
		return roleRepository.findById(id);
	}

}
