package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf1=new Telefono("movi","09891230438",2);
		Telefono telf2=new Telefono("claro","0987418627",22);
		Telefono telf3=new Telefono("movi","0985418539",12);
		AdminTelefono at=new AdminTelefono();
		int contar=at.contarMovi(telf1, telf2, telf3);
		
		System.out.println("contar movi:"+contar);

	}

}
