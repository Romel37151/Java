package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	public AdminPersonas() {
		personas=new ArrayList<Persona>();// se instancia en el constructor para q no sea null
	}
	
	public void agregar(Persona  persona) {
		personas.add(persona);
	}
	public void imprimir() {
		Persona elementoPersona;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println("Persona: "+elementoPersona.getNombre()+" "+elementoPersona.getApellido()+" "+elementoPersona.getEdad());
		}
	}
	public Persona buscarPorNombre(String nombre) {
		Persona elementoPersona;
		Persona personaEncontrada=null;
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(nombre.equals(elementoPersona.getNombre())) { // se compara para ver si son iguales con el metodo .equals
				personaEncontrada=elementoPersona;
						
			}
		}
		
		return personaEncontrada;
		
	}
	public ArrayList<Persona> buscarMayore(int edad){
		ArrayList<Persona> mayores= new ArrayList<Persona>() ;
		Persona elementoPersona;
		
		for(int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			if(elementoPersona.getEdad()>edad) {
				mayores.add(elementoPersona);
				
			}
		}
		
		
	return mayores;
	}
}
