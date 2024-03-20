package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));
		
		Producto productoA = new Producto("KE34", "Papitas", 0.85);
		Producto productoB = new Producto("BDCR", "Galletas", 2.54);
		Producto productoC = new Producto("KK34", "Doritos", 0.50);
		Producto productoD = new Producto("BD85", "Chicles", 0.25);
		Producto productoE = new Producto("KE34", "Colas", 1.50);
		Producto productoF = new Producto("75CR", "Chupetes", 1.05);
		
		maquina.cargarProducto(productoA, "A", 1);
		maquina.cargarProducto(productoB, "B", 3);
		maquina.cargarProducto(productoC, "C", 1);
		maquina.cargarProducto(productoD, "D", 4);
		maquina.cargarProducto(productoE, "E", 2);
		maquina.cargarProducto(productoF, "F", 5);
		
		ArrayList<Producto> menores=maquina.buscarMenores(1.00);
		
		System.out.println("Productos menores:"+menores.size());
		
		Producto m;
		for(int i=0;i<menores.size();i++) {
			m=menores.get(i);
			System.out.println("Nombre: "+m.getNombre()+" "+"precio: "+m.getPrecio());
			
			
		}
		
		
	

	}

}
