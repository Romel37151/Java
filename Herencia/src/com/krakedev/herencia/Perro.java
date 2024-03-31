package com.krakedev.herencia;

public class Perro extends Animal{
	
	public void ladrar () {
		
		System.out.println("ladra");
		
	}
	public void dormir () {
		super.dormir();
		System.out.println("perro durmiendo");
	}
}
