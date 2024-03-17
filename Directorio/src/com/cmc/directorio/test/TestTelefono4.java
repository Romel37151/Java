package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf1=new Telefono("movi","09891230438",2);
		Telefono telf2=new Telefono("claro","0987418627",22);
		Telefono telf3=new Telefono("claro","0985418539",12);
		Telefono telf4=new Telefono("claro","0925341876",30);
		AdminTelefono at=new AdminTelefono();
		int contar=at.contarClaro(telf1, telf2, telf3, telf4);
		
		System.out.println("contar claro: "+contar);
	}

}
