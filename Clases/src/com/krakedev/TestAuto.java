package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.marca= "Mazda";
		auto1.anio= 2020;
		auto1.precio= 13580;
		
	System.out.println("marca: "+ auto1.marca);
	System.out.println("anio: "+ auto1.anio);
	System.out.println("precio: "+ auto1.precio);
	
	
	auto2.marca= "Toyota";
	auto2.anio= 2023;
	auto2.precio= 30500;
	
	System.out.println("--------------");
	System.out.println("marca: "+ auto2.marca);
	System.out.println("anio: "+ auto2.anio);
	System.out.println("precio: "+ auto2.precio);
				
	
	
		

	}

}
