package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicico2 {
	public void  metodo1() {
		String a=null;
				a.substring(3);
	}
	public void metodo2() {
		File f= new File("archivo1.txt");  // IOException - CHECKEND
		try {
		f.createNewFile();
		}catch(IOException io) {
			System.out.println("error");
			
		}
		
	}
	public void metodo3() throws IOException{
		File f= new File("archivo1.txt");
		f.createNewFile();
	}
	public void metodo4() {
		metodo3();
		
	}

}
