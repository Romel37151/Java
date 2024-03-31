package com.krakedev.herencia;

public class Cuenta {
	private String nuemeroCuenta;
	private double saldo;
	
	
	
	
	public Cuenta(String nuemeroCuenta, double saldo) {
		
		this.nuemeroCuenta = nuemeroCuenta;
		this.saldo = saldo;
	}
	public String getNuemeroCuenta() {
		return nuemeroCuenta;
	}
	public void setNuemeroCuenta(String nuemeroCuenta) {
		this.nuemeroCuenta = nuemeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cuenta [nuemeroCuenta=" + nuemeroCuenta + ", saldo=" + saldo + "]";
	}
	
	
	
	

}
