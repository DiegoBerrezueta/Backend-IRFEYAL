package com.docacademicos.planunidad.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "plan_unidad")
public class PlanUnidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_plan_unidad")
	private int id;
	private String titulo_unidad;
	private String objetivos;
	private String contenidos;
	private String criterios_evaluacion;
	private String destrezas;
	private Date fecha_inicio;
	private Date fecha_fin;
	
	@ManyToOne
	@JoinColumn (name = "id_unidad")
	private Unidad unidad;
	
	public PlanUnidad() {
	}
	

	public PlanUnidad(int id, String titulo_unidad, String objetivos, String contenidos, String criterios_evaluacion,
			String destrezas, Date fecha_inicio, Date fecha_fin, Unidad unidad) {
		super();
		this.id = id;
		this.titulo_unidad = titulo_unidad;
		this.objetivos = objetivos;
		this.contenidos = contenidos;
		this.criterios_evaluacion = criterios_evaluacion;
		this.destrezas = destrezas;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.unidad = unidad;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo_unidad() {
		return titulo_unidad;
	}

	public void setTitulo_unidad(String titulo_unidad) {
		this.titulo_unidad = titulo_unidad;
	}

	public String getObjetivos() {
		return objetivos;
	}

	public void setObjetivos(String objetivos) {
		this.objetivos = objetivos;
	}

	public String getContenidos() {
		return contenidos;
	}

	public void setContenidos(String contenidos) {
		this.contenidos = contenidos;
	}

	public String getCriterios_evaluacion() {
		return criterios_evaluacion;
	}

	public void setCriterios_evaluacion(String criterios_evaluacion) {
		this.criterios_evaluacion = criterios_evaluacion;
	}

	public String getDestrezas() {
		return destrezas;
	}

	public void setDestrezas(String destrezas) {
		this.destrezas = destrezas;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public Unidad getUnidad() {
		return unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}
	
	

}
