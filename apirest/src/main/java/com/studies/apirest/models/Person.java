package com.studies.apirest.models;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.EqualsAndHashCode.Exclude;

@Entity(name = "person")
@Table(name = "person")
@NoArgsConstructor @AllArgsConstructor
@SequenceGenerator(name = "seq_person", sequenceName = "seq_person", allocationSize = 1, initialValue = 1)
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_person")
	@Getter private Long id;
	
	@Column (name = "name")
	@Getter @Setter private String name;
	
	@Column(name = "email", unique = true)
	@Getter @Setter private String  email;
	
	@Exclude
	@Column(name = "password")
	@Getter @Setter private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "persons_roles",
			joinColumns = @JoinColumn(name = "person_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
	)
	private Set<Role> roles = new HashSet<>();
	
}