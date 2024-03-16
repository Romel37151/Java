package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		
		
	}
	public Producto(String nombre, int precio) {
		this.nombre=nombre;
		this.precio=precio;
		if(precio<0) {
			this.precio=precio*(-1);
		}
	}
	public  double CalcularPrecioPromo(int porcentage) {
		double resultado;
		double descuento=(precio*porcentage)/100;
		resultado=precio-descuento;
		System.out.println("Precio promo: "+resultado);
		return resultado;
		
	}

}
