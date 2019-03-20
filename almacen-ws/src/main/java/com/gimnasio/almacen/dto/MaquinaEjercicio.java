package com.gimnasio.almacen.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MaquinaEjercicio implements Serializable {
	
	 private static final long serialVersionUID = 4894729030347835498L;
	 
	 @Id
	 @GeneratedValue
	 private Long id;
	 private String nombre;
	 private String serial;
	 private String ubicacion;
	 
	public MaquinaEjercicio(Long id, String nombre, String serial, String ubicacion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.serial = serial;
		this.ubicacion = ubicacion;
	}
	
	
	@Override
	public String toString() {
		return "MaquinaEjercicio [id=" + id + ", nombre=" + nombre + ", serial=" + serial + ", ubicacion=" + ubicacion
				+ "]";
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getSerial() {
		return serial;
	}
	
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public String getUbicacion() {
		return ubicacion;
	}
	
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	 
	 
}
