package com.krakedev.composicion;

public class AdminProducto {
	//resive 2 productos y retorna el de mayor precio y si son iguales retorna null
	
	public Producto masCaro(Producto p1, Producto p2) {
		if(p1.getPrecio()> p2.getPrecio()) {
			return p1;
			
		}else if (p2.getPrecio()>p1.getPrecio()) {
			return p2;
			
		}else {
			return null;
		}
	}

}
