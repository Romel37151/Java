package com.krakedev;

public class Productos {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stockActual;
	
	public Productos (String nombre, int stockActual) {
		this.nombre=nombre;
		this.stockActual=stockActual;
		
		
	}
	public Productos (String nombre, double precio,int stockActual) {
		this.nombre=nombre;
		this.stockActual=stockActual;
		this.precio=precio;
		
		
	}
	public Productos (String descripcion) {
		this.descripcion=descripcion;
		
		
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	
	
	

}
