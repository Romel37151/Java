package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.setMarca("Mazda");
		auto1.setAnio(2006);
		auto1.setPrecio(135896);
		
	System.out.println("marca: "+ auto1.getMarca());
	System.out.println("anio: "+ auto1.getAnio());
	System.out.println("precio: "+ auto1.getPrecio());
	
	
	auto2.setMarca("Toyota");
	auto2.setAnio(2019);
	auto2.setPrecio(30589);
	
	System.out.println("--------------");
	System.out.println("marca: "+ auto2.getMarca());
	System.out.println("anio: "+ auto2.getAnio());
	System.out.println("precio: "+ auto2.getPrecio());
				
	
	
		

	}

}
