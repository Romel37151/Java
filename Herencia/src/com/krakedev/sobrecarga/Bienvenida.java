package com.krakedev.sobrecarga;

public class Bienvenida {
	public void saludar(String nombre) {
		System.out.println("hola"+nombre);
		
	}
	
	public void saludar(String nombre, String apelllido) {
		System.out.println("hola"+nombre+" "+ apelllido);
	}
	
	
	
	

}
