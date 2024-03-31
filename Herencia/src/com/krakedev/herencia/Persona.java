package com.krakedev.herencia;

public class Persona {
	private int cedula;
	private String nombre;
	
	
	
	
	public Persona(int cedula, String nombre) {
		
		this.cedula = cedula;
		this.nombre = nombre;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	
	
	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + "]";
	}
	
	
	
	

}
