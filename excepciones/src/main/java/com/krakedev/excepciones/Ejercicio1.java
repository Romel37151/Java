package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio");
		String a = "xxx";
		try {
			a.substring(3);
			System.out.println("fin");

		} catch (Exception ex) {

			System.out.println("entra al catch");
		}finally {
			System.out.println("entra al finally");
		}
		System.out.println("fuera de catch");
	}

}
