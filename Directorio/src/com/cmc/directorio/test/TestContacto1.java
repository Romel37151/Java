package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi","0989130438",41);
		Contacto c= new Contacto("Juan","Sandoval",telf,120);
		
		System.out.println("nombre: "+c.getNombre());
		System.out.println("apellido: "+c.getApellido());
		System.out.println("Telefono: "+c.getTelefono().getOperadora()+" "+c.getTelefono().getNumero());
		System.out.println("codigo: "+ c.getPeso());

	}

}
