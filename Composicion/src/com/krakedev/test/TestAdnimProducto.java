package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdnimProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto ms;
		AdminProducto admin = new AdminProducto();
		Producto p = new Producto("Doritos", 1.50);
		Producto p2 = new Producto("Papas", 0.50);
		ms=admin.masCaro(p, p2);
		if(ms==null) {
			System.out.println("Son iguales");
		}else {
		
		System.out.println("el mas caro: "+ ms.getNombre());

	}
		}

}
