package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensageria(Telefono telefono) {
		if(telefono.getOperadora()=="movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) {
		
		int contar = 0;
		if (telf1.getOperadora()=="movi") {
			contar=contar+1;
		}
		if(telf2.getOperadora()=="movi") {
			contar=contar+1;
		}
		if(telf3.getOperadora()=="movi") {
			contar=contar+1;
		}
		return contar;
	}
	
	public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3, Telefono telf4) {
		
		int contar = 0;
		if (telf1.getOperadora()=="claro") {
			contar=contar+1;
		}
		if(telf2.getOperadora()=="claro") {
			contar=contar+1;
		}
		if(telf3.getOperadora()=="claro") {
			contar=contar+1;
		}
		if(telf4.getOperadora()=="claro") {
			contar=contar+1;
		}
		return contar;
	}
}
