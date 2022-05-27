package com.studies.apirest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studies.apirest.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
}
