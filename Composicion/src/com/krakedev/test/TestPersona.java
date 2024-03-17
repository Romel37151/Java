package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona();
		p1.setNombre("Mario");
		p1.setApellido("Mendez");
		Direccion dir= new Direccion();
		Direccion d2= new Direccion("e","r","45");
				
		dir.setCalleP("j");
		dir.setCalleS("l");
		dir.setNumero("56");
		p1.setDireccion(dir);
		Persona p2= new Persona();
		p2.setNombre("js");
		p2.setDireccion(d2);
		p2.imprimir();
		String nombre=p1.getNombre();
		Direccion d= p1.getDireccion();
		
		Persona p3=new Persona();
		p3.setDireccion(new Direccion("xxx","xx","1"));
		p3.imprimir();
		
		System.out.println(nombre);
		// d esta nulll y trato de invocar a algun metodo
		System.out.println(d.getCalleP());
							//nul.algunmetodo();
		p1.imprimir();
		

	}

}
