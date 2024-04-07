package com.krakendev.persistencia.test;

import java.util.Date;

import com.krakendev.persistencia.entidades.EstadoCivil;
import com.krakendev.persistencia.entidades.Persona;
import com.krakendev.persistencia.servicios.AdminPersonas;
import com.krakendev.persistencia.utils.Convertidor;

//System.out.println() solo se va solo se los utiliza en el test
public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("1105232912", "Jonathan", "Zhiña", null, ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2004/07/04");
			p.setFecha_nacimiento(fechaNac);
			AdminPersonas.insertar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: " + e.getMessage());
		}

	}

}