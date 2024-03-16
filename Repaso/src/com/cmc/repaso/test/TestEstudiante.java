package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante es= new Estudiante("Juan");
		
		es.calificar(2);
		es.calificar(8);
		es.calificar(10);
		es.calificar(11);
	}

}
