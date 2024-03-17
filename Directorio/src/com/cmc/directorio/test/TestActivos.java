package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminContactos con = new AdminContactos();
		Telefono telf = new Telefono("movi", "0989562158", 54);
		Contacto c = new Contacto("Juan", "Torres", telf, 56);
		
		System.out.println(c.getTelefono().getTieneWhatsapp());

		con.activarUsuario(c);

		System.out.println("Contacto con mas peso: " + c.getNombre() + " " + c.getApellido() + " " + c.getPeso() + " "
				+ c.getTelefono().getNumero() + " " + c.getTelefono().getOperadora()+" "+ c.getActivo());

	}

}
