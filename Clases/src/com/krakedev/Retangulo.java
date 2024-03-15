package com.krakedev;

public class Retangulo {
	private int base;
	private int altura;
	

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

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
