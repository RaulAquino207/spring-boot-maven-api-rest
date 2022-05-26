package com.studies.apirest.models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.studies.apirest.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "role")
@Table(name = "role")
@NoArgsConstructor @AllArgsConstructor
@SequenceGenerator(name = "seq_role", sequenceName = "seq_role", allocationSize = 1, initialValue = 1)
public class Role {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_role")
	@Getter private Long id;
		
	@Enumerated(EnumType.STRING)
	@Getter @Setter private RoleEnum name;

}
