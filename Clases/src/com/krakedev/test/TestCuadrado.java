package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1= new Cuadrado();
		Cuadrado c2= new Cuadrado();
		Cuadrado c3= new Cuadrado();
		double calcularAreaCuadrado1;
		double calcularPerimetroCuadrado1;
		double calcularAreaCuadrado2;
		double calcularPerimetroCuadrado2;
		double calcularAreaCuadrado3;
		double calcularPerimetroCuadrado3;
		
		
		c1.setLado(8);
		c2.setLado(9);
		c3.setLado(6);
		calcularAreaCuadrado1=c1.calularArea();
		calcularPerimetroCuadrado1=c1.calcularPerimetro();
		
		calcularAreaCuadrado2=c2.calularArea();
		calcularPerimetroCuadrado2=c2.calcularPerimetro();
		
		calcularAreaCuadrado3=c3.calularArea();
		calcularPerimetroCuadrado3=c3.calcularPerimetro();
		
		
		
		System.out.println("Area cuadrado 1: "+ calcularAreaCuadrado1);
		System.out.println("Perimetro cuadrado1: "+ calcularPerimetroCuadrado1);

		System.out.println("--------------");
		System.out.println("Area cuadrado 2: "+ calcularAreaCuadrado2);
		System.out.println("Perimetro cuadrado2: "+ calcularPerimetroCuadrado2);

		System.out.println("--------------");
		System.out.println("Area cuadrado 3: "+ calcularAreaCuadrado3);
		System.out.println("Perimetro cuadrado3: "+ calcularPerimetroCuadrado3);

	}

}
