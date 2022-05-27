package com.studies.apirest.repositories;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studies.apirest.enums.RoleEnum;
import com.studies.apirest.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByName(RoleEnum name);
	
}
