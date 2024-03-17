package com.krakedev.composicion;

public class Direccion {
	private String calleP;
	private String calleS;
	private String numero;
	private double latitud;
	private double longitud;
	
	public Direccion() {
		
	}
	public Direccion(String calleP, String calleS, String numero) {
		super();
		this.calleP = calleP;
		this.calleS = calleS;
		this.numero = numero;
	}
	public String getCalleP() {
		return calleP;
	}
	public void setCalleP(String calleP) {
		this.calleP = calleP;
	}
	public String getCalleS() {
		return calleS;
	}
	public void setCalleS(String calleS) {
		this.calleS = calleS;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
	
	
	

}
