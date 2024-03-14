package com.krakedev;

public class Retangulo {
	public int base;
	public int altura;

	public int calcularArea() {
		int area;
		area = base * altura;
		return area;

	}

	public double calcularPerimetro() {
		double perimetro;
		perimetro = altura + altura + base + base;
		return perimetro;
	}

}
