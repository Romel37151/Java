package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Persona> persona;
		Persona elementoPersona;
		persona=new ArrayList <Persona>();
		persona.add(new Persona("Leo","Messi"));
		persona.add(new Persona("Romel","Sanchez"));
		persona.add(new Persona("Leonardo","Dicaprio"));
		System.out.println(persona.size());
		
		for(int i=0;i<persona.size();i++) {
			
			elementoPersona=persona.get(i);
			System.out.println(elementoPersona.getNombre()+"-"+elementoPersona.getApellido());
		}
		


	}

}
