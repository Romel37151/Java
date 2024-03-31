package com.krakedev.estaticos;

public class TestUtilitarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utilitarios u= new Utilitarios();
		u.validarRango(6);
		boolean respuesta=Utilitarios.validarRango(14);
		System.out.println(respuesta);
		
		
		int radio=10;
		double r=Math.PI*radio;
		
		System.out.println(r);

	}

}
