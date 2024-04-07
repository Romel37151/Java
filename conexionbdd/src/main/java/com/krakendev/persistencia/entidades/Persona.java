package com.krakendev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Persona {

	private String cedula;
	private String nombre;
	private String apellido;
	
	private EstadoCivil estadocivil;
	
	private int nuemroHijos;
	private double estatura;
	private BigDecimal caidadhAORRADA;
	private Date fechaNacimiento;
	private Date horaNacimiento ;
	
	public Persona() {
		
	}
	
	public Persona(String cedula, String nombre, String apellido, EstadoCivil estadocivil, int nuemroHijos,
			double estatura, BigDecimal caidadhAORRADA, Date fechaNacimiento, Date horaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.estadocivil = estadocivil;
		this.nuemroHijos = nuemroHijos;
		this.estatura = estatura;
		this.caidadhAORRADA = caidadhAORRADA;
		this.fechaNacimiento = fechaNacimiento;
		this.horaNacimiento = horaNacimiento;
	}
	public Persona(String cedula, String nombre, EstadoCivil estadocivil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.estadocivil = estadocivil;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}
	public int getNuemroHijos() {
		return nuemroHijos;
	}
	public void setNuemroHijos(int nuemroHijos) {
		this.nuemroHijos = nuemroHijos;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public BigDecimal getCaidadhAORRADA() {
		return caidadhAORRADA;
	}
	public void setCaidadhAORRADA(BigDecimal caidadhAORRADA) {
		this.caidadhAORRADA = caidadhAORRADA;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getHoraNacimiento() {
		return horaNacimiento;
	}
	public void setHoraNacimiento(Date horaNacimiento) {
		this.horaNacimiento = horaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", estadocivil="
				+ estadocivil + ", nuemroHijos=" + nuemroHijos + ", estatura=" + estatura + ", caidadhAORRADA="
				+ caidadhAORRADA + ", fechaNacimiento=" + fechaNacimiento + ", horaNacimiento=" + horaNacimiento + "]";
	}
	
	
	
	
}
