package com.studies.apirest.enums;

import lombok.Getter;

public enum RoleEnum {
	
	SHOPKEEPER("shopkeeper"),
	BUYER("buyer");
	
	@Getter private String typeRole;
	
	private RoleEnum(String typeRole) {
		this.typeRole = typeRole;
	}
	
	@Override
	public String toString() {
		return this.typeRole;
	}

}
