package com.krakedev.test;
import com.krakedev.Fecha;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha Fecha1=new Fecha(8963);
		Fecha f1= new Fecha(200,5,6);
		
		Fecha1.setDia(2);
		Fecha1.setMes(3);
		System.out.println(Fecha1.getAnio());
		System.out.println(f1.getAnio());
		System.out.println(f1.getMes());
		System.out.println(f1.getDia());
		
		

	}

}
