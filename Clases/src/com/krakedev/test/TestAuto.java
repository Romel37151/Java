package com.krakedev.test;
import com.krakedev.Auto;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1= new Auto("Mazda");
		Auto auto2= new Auto("Toyota",2019,30580);
		
		
		auto1.setAnio(2006);
		auto1.setPrecio(135896);
		
	System.out.println("marca: "+ auto1.getMarca());
	System.out.println("anio: "+ auto1.getAnio());
	System.out.println("precio: "+ auto1.getPrecio());
	
	

	
	System.out.println("--------------");
	System.out.println("marca: "+ auto2.getMarca());
	System.out.println("anio: "+ auto2.getAnio());
	System.out.println("precio: "+ auto2.getPrecio());
				
	
	
		

	}

}
