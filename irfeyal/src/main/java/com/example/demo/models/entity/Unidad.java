package com.docacademicos.planunidad.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "unidad")
public class Unidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_unidad")
	private int id;
	private String nombre_unidad;
	
	public Unidad() {
	}

	
	public Unidad(int id, String nombre_unidad) {
		super();
		this.id = id;
		this.nombre_unidad = nombre_unidad;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_unidad() {
		return nombre_unidad;
	}
	public void setNombre_unidad(String nombre_unidad) {
		this.nombre_unidad = nombre_unidad;
	}
	
	
	
}
