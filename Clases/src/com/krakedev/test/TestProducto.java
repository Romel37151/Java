package com.krakedev.test;

import com.krakedev.Productos;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos productoA= new Productos("Gasas",15);
		Productos productoB= new Productos("Alchol",5.50,30);
		Productos productoC= new Productos("Limpia el cuerpo");
		
		
		productoA.setDescripcion("materiales básicos en curaciones de primeros auxilios");
		productoA.setPrecio(2.50);
	
		
		System.out.println("nombre: "+ productoA.getNombre());
		System.out.println("descripcion: "+ productoA.getDescripcion());
		System.out.println("precio: "+ productoA.getPrecio());
		System.out.println("stockActual: "+ productoA.getStockActual());
		
		
		productoB.setDescripcion("desinfectante");
		
		
		System.out.println("-----------");
		System.out.println("nombre: "+ productoB.getNombre());
		System.out.println("descripcion: "+ productoB.getDescripcion());
		System.out.println("precio: "+ productoB.getPrecio());
		System.out.println("stockActual: "+ productoB.getStockActual());
			
		
		productoC.setNombre("Jabon");
		
		productoC.setPrecio(1.230);
		productoC.setStockActual(30);
		System.out.println("-----------");
		System.out.println("nombre: "+ productoC.getNombre());
		System.out.println("descripcion: "+ productoC.getDescripcion());
		System.out.println("precio: "+ productoC.getPrecio());
		System.out.println("stockActual: "+ productoC.getStockActual());
		

	}

}
