package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Productos productoA= new Productos();
		Productos productoB= new Productos();
		Productos productoC= new Productos();
		
		productoA.nombre="Gasas";
		productoA.descripcion=" materiales básicos en curaciones de primeros auxilios ";
		productoA.precio=2.50;
		productoA.stockActual=13;
		
		System.out.println("nombre: "+ productoA.nombre);
		System.out.println("descripcion: "+ productoA.descripcion);
		System.out.println("precio: "+ productoA.precio);
		System.out.println("stockActual: "+ productoA.stockActual);
		
		productoB.nombre="Alcohol";
		productoB.descripcion=" desinfectante ";
		productoB.precio=3;
		productoB.stockActual=50;
		
		System.out.println("-----------");
		System.out.println("nombre: "+ productoB.nombre);
		System.out.println("descripcion: "+ productoB.descripcion);
		System.out.println("precio: "+ productoB.precio);
		System.out.println("stockActual: "+ productoB.stockActual);
			
		
		productoC.nombre="Jabon";
		productoC.descripcion=" limpiar el cuerpo y proteger la piel contra virus y bacterias ";
		productoC.precio=1.50;
		productoC.stockActual=30;
		
		System.out.println("-----------");
		System.out.println("nombre: "+ productoC.nombre);
		System.out.println("descripcion: "+ productoC.descripcion);
		System.out.println("precio: "+ productoC.precio);
		System.out.println("stockActual: "+ productoC.stockActual);
		

	}

}
