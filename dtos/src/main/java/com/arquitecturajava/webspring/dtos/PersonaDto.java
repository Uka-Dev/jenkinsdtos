package com.arquitecturajava.webspring.dtos;

import java.io.Serializable;

public class PersonaDto implements Serializable{
	
	private String nombre;

	public PersonaDto() {
		super();
	}

	public PersonaDto(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
