package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validacion validacion= new Validacion();
		
		validacion.validarMonto(-5);
		validacion.validarMonto(0);
		validacion.validarMonto(12);
		
		

	}

}
