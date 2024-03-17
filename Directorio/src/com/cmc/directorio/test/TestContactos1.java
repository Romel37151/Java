package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminContactos con = new AdminContactos();
		Telefono telf = new Telefono("claro", "0989130438", 41);
		Contacto c = new Contacto("Marcos", "Andrando", telf, 120);

		Telefono telf2 = new Telefono("movi", "0956238423", 89);
		Contacto c2 = new Contacto("Juan", "Sandoval", telf2, 120);

		Contacto res = con.buscarMasPeso(c, c2);
		if (res==null) {
			System.out.println("el peso es igual");
		}else {
		System.out.println("Contacto con mas peso: " + res.getNombre() + " " + res.getApellido() + " " + res.getPeso()+" "+res.getTelefono().getNumero()+" "+res.getTelefono().getOperadora());
		}
		boolean rs=con.compararOperadoras(c, c2);
		System.out.println("las operadoras son iguales: "+rs);
		
	
	}

}
