package com.gimnasio.almacen.api;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MaquinaEjercicioRequest {

private Long id;
	
	@NotNull(message="El nombre es requerido")
	@Size(min=2, max=30, message="El nombre debe tener entre {min} y {max} caracteres")
	private String nombre;
	
	@NotNull(message="El serial es requerido")
	private String serial;
	
	@NotNull(message="La ubicación es requerida")
	private String ubicacion;

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
