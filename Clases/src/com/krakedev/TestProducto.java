package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos productoA= new Productos();
		Productos productoB= new Productos();
		Productos productoC= new Productos();
		
		productoA.setNombre("Gasas");
		productoA.setDescripcion("materiales básicos en curaciones de primeros auxilios");
		productoA.setPrecio(2.50);
		productoA.setStockActual(15);
		
		System.out.println("nombre: "+ productoA.getNombre());
		System.out.println("descripcion: "+ productoA.getDescripcion());
		System.out.println("precio: "+ productoA.getPrecio());
		System.out.println("stockActual: "+ productoA.getStockActual());
		
		productoB.setNombre("Alchol");
		productoB.setDescripcion("desinfectante");
		productoB.setPrecio(5.50);
		productoB.setStockActual(2);
		
		System.out.println("-----------");
		System.out.println("nombre: "+ productoB.getNombre());
		System.out.println("descripcion: "+ productoB.getDescripcion());
		System.out.println("precio: "+ productoB.getPrecio());
		System.out.println("stockActual: "+ productoB.getStockActual());
			
		
		productoC.setNombre("Jabon");
		productoC.setDescripcion("limpiar el cuerpo y proteger la piel contra virus y bacterias ");
		productoC.setPrecio(1.230);
		productoC.setStockActual(30);
		System.out.println("-----------");
		System.out.println("nombre: "+ productoC.getNombre());
		System.out.println("descripcion: "+ productoC.getDescripcion());
		System.out.println("precio: "+ productoC.getPrecio());
		System.out.println("stockActual: "+ productoC.getStockActual());
		

	}

}
