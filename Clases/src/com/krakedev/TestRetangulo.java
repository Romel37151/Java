package com.krakedev;

public class TestRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo r1= new Retangulo();
		Retangulo r2=new Retangulo();
		int area1;
		int area2;
		double perimetro1;
		double perimetro2;
		r1.base=10;
		r1.altura=5;
		
		r2.base=9;
		r2.altura=5;
		
		area1=r1.calcularArea();
		area2=r2.calcularArea();
		perimetro1=r1.calcularPerimetro();
		perimetro2=r2.calcularPerimetro();
		
		System.out.println("Area r1: "+area1);
		System.out.println("Area r2: "+area2);
		System.out.println("Perimetro r1: "+perimetro1);
		System.out.println("perimetro r2: "+perimetro2);
		

	}

}
