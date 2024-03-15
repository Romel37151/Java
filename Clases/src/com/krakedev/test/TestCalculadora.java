package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		int resultadoSuma;
		int resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;
		calcu=new Calculadora();
		resultadoSuma=calcu.sumar(9, 2);
		resultadoResta=calcu.resta(8,6);
		resultadoMultiplicacion=calcu.multiplicar(9, 3);
		resultadoDivision=calcu.dividir(20, 2);
		resultadoPromedio=calcu.promediar(10, 9, 8);
		
		
		
		
		System.out.println("RESULTADO SUMA: "+ resultadoSuma);
		System.out.println("RESULTADO RESTA:  " + resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+ resultadoMultiplicacion);
		System.out.println("RESULTADO DIVISION: "+ resultadoDivision);
		System.out.println("RESULTADO PROMEDIO: "+ resultadoPromedio);
		calcu.mostrarResultado();

	}

}