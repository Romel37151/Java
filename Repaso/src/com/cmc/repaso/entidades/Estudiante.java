package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public Estudiante(String nombre) {
		this.nombre=nombre;
	}
	
	public void calificar(double nota) {
		
		this.nota=nota;
		if(nota<8) {
			System.out.println("resultado: F");	
		}else if(nota>=8 && nota<=10) {
			System.out.println("resultado: A");
			
		}else {
			System.out.println("Respuesta incorrecta");
		}
	}

}
