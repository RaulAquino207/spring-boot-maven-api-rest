package com.studies.apirest.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.studies.apirest.enums.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity(name = "role")
@Table(name = "role")
@NoArgsConstructor @AllArgsConstructor
public class Role {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter private Long id;
		
	@Enumerated(EnumType.STRING)
	@Getter @Setter private RoleEnum name;
	
	@ManyToMany(mappedBy = "roles", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private Set<Person> persons = new HashSet<>();

}
