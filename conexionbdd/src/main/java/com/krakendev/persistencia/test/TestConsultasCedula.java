package com.krakendev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakendev.persistencia.entidades.Persona;

public class TestConsultasCedula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona personas= new Persona();
		try {
			 personas=AdminPersonas.buscarCedula("1105232977");
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
