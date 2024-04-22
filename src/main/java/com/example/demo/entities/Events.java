package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "events")
public class Events {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Date fechaEvento;

	private String localidadEvento;

	private String descripcionEvento;

	private String fotoEventoPerfil;

	@Column()
	private String galeriaEventoUno;
	
	@Column
	private String galeriaEventoDos;
	
	@Column
	private String galeriaEventoTres;
	
	
	

	public Events() {
	}

	public Events(Long id, Date fechaEvento, String localidadEvento, String descripcionEvento, String fotoEventoPerfil,
			String galeriaEventoUno, String galeriaEventoDos, String galeriaEventoTres) {
		this.id = id;
		this.fechaEvento = fechaEvento;
		this.localidadEvento = localidadEvento;
		this.descripcionEvento = descripcionEvento;
		this.fotoEventoPerfil = fotoEventoPerfil;
		this.galeriaEventoUno = galeriaEventoUno;
		this.galeriaEventoDos = galeriaEventoDos;
		this.galeriaEventoTres = galeriaEventoTres;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaEvento() {
		return fechaEvento;
	}

	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}

	public String getLocalidadEvento() {
		return localidadEvento;
	}

	public void setLocalidadEvento(String localidadEvento) {
		this.localidadEvento = localidadEvento;
	}

	public String getDescripcionEvento() {
		return descripcionEvento;
	}

	public void setDescripcionEvento(String descripcionEvento) {
		this.descripcionEvento = descripcionEvento;
	}

	public String getFotoEventoPerfil() {
		return fotoEventoPerfil;
	}

	public void setFotoEventoPerfil(String fotoEventoPerfil) {
		this.fotoEventoPerfil = fotoEventoPerfil;
	}

	public String getGaleriaEventoUno() {
		return galeriaEventoUno;
	}

	public void setGaleriaEventoUno(String galeriaEventoUno) {
		this.galeriaEventoUno = galeriaEventoUno;
	}

	public String getGaleriaEventoDos() {
		return galeriaEventoDos;
	}

	public void setGaleriaEventoDos(String galeriaEventoDos) {
		this.galeriaEventoDos = galeriaEventoDos;
	}

	public String getGaleriaEventoTres() {
		return galeriaEventoTres;
	}

	public void setGaleriaEventoTres(String galeriaEventoTres) {
		this.galeriaEventoTres = galeriaEventoTres;
	}

		
	
	
	
	
}
