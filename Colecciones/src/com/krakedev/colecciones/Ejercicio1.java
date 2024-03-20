package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cadenas;
		String valorRecuperado;
		String cadena;
		cadenas = new ArrayList<String> ();
		cadenas.add("dos"); // con .add se agregan elementos al Array list
		cadenas.add("cuantro");
		valorRecuperado=cadenas.get(0);//recupera la variable en dicha posicion
		
		for(int i=0;i<cadenas.size();i++) {
			 cadena=cadenas.get(i);
			 System.out.println("Cadena: "+cadena);
			 
			
		}
		System.out.println(cadenas.size()); //muestra los elementos q tiene el ArrayList
		System.out.println(valorRecuperado);
	}

}
