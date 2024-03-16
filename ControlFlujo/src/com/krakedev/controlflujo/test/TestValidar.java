package com.krakedev.controlflujo.test;

import com.krakedev.controlflujo.Validador;

public class TestValidar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Validador validador=new Validador ();
		validador.validarEdad(10);
		validador.validarEdad(2);
		validador.validarEdad(5);
	}

}
