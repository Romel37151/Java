package com.cmc.directorio.entidades;

public class AdminContactos {

	public Contacto buscarMasPeso(Contacto c1, Contacto c2) {
		if (c1.getPeso() > c2.getPeso()) {
			return c1;
		} else if(c1.getPeso() < c2.getPeso()) {
			return c2;
		}else {
			return null;
		}
			
	}

	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		if (c1.getTelefono().getOperadora() == c2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto c1) {
		if(c1.getTelefono().getTieneWhatsapp()== true) {
			c1.setActivo(true);
		}else {
			c1.setActivo(false);
			
		}
	}
}
