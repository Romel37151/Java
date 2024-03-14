package com.krakedev;

public class Calculadora {

	public int sumar(int a, int b) {

		int resultado;
		resultado = a + b;
		return resultado;
	}
	
	public int resta(int a,int b) {
		int resultado;
		resultado=a-b;
		return resultado;
	}
	
	public double multiplicar(double a, double b) {
		double resultado;
		resultado=a*b;
		return resultado;
		
	}
	
	public double dividir (double a, double b) {
		double resultado;
		resultado=a/b;
		return resultado;
	}
	
	public double promediar (double a,double b,double c){
		double resultado;
		
		resultado=(a+b+c)/3;
		return resultado;
		
	}
	
	public void mostrarResultado() {
		System.out.println("Ahorita no joven, sali al almuerzo. Regreso en 15 minutos ");
	}

}
