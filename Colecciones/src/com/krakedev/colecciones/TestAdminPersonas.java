package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersonas admin=new AdminPersonas();
		admin.agregar(new Persona("Mario","Sandoval",30));
		admin.agregar(new Persona("Arturo","Karl",18));
		admin.agregar(new Persona("Jose","Sandoval"));
		admin.agregar(new Persona("Pedro","Sandoval",25));
		
		admin.imprimir();
		
		Persona p1=admin.buscarPorNombre("Pedro ");
		if(p1!=null) {
		System.out.println("Encontrado: "+p1.getApellido()+" "+p1.getEdad());
		}else {
			System.out.println("Persona no existente");
		}
		ArrayList<Persona> mayores=admin.buscarMayore(8);
		
		System.out.println(mayores.size());
	}

}
