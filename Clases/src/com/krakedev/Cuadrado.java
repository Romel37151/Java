package com.krakedev;

public class Cuadrado {
	int lado;
	
	public double calularArea() {
		double area;
		area=lado*lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro;
		perimetro= lado*4;
		return perimetro;
	}

}
