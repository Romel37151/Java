package com.krakedev.controlflujo;

public class Validador {
	public void validarEdad(int edad) {
		if(edad>=5) {
			System.out.println("es mayor a 5");
			
		}else if(edad>10)  {
			System.out.println("es mayor a10");
		}
	}
}
