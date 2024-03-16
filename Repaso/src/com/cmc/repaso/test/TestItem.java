package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item o= new Item();
		Item a=new Item();
		
		o.setNombre("Arroz");
		o.setProductosActuales(20);
		o.imprimir();
		o.vender(20);
		o.imprimir();
		o.devolver(50);
		o.imprimir();
		
		
		a.setNombre("Atun");
		a.setProductosActuales(100);
		a.imprimir();
		a.vender(30);
		a.imprimir();
		a.devolver(12);
		a.imprimir();
		a.devolver(10);
		a.imprimir();
		
		

	}

}
