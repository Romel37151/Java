package com.krakendev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.utils.Convertidor;
import com.krakendev.persistencia.entidades.EstadoCivil;
import com.krakendev.persistencia.entidades.Persona;
import com.krakendev.persistencia.servicios.AdminPersonas;

public class TestActualizar {

	public static void main(String[] args) {
		Persona p= new Persona("1105232910", "eduardo", "Morocho", 1.72, null, null, new BigDecimal(857.54), 5, new EstadoCivil("S", "Soltero"));
		try {
			Date fechaNac=Convertidor.convertirFecha("2004/07/04");
			Date horaNac=Convertidor.convertirHora("20:35");
			p.setFecha_nacimiento(fechaNac);
			p.setHora_nacimiento(horaNac);
			AdminPersonas.actualizar(p);
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}

	}

}