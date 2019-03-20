package com.gimnasio.almacen.api;

public class MaquinaEjercicioResponse {

	private Long id;
	private String nombre;
	private String serial;
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
