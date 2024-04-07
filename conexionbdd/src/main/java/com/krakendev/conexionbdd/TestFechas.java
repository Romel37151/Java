package com.krakendev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		// Date java.util.Date
		//Date java.sql.Date
		
		SimpleDateFormat sf= new SimpleDateFormat("yyyy/MM/dd  hh:mm:ss");
		
		String fechaStr="2020/05/23   10:5:04";
		try {
			Date fecha= sf.parse(fechaStr);
			System.out.println(fecha);
			
			long fechamiles=fecha.getTime();
			System.out.println(fechamiles);
			//crea un java.sql.Date partiendo de un java.util.Date 
			java.sql.Date fechaSQL= new java.sql.Date(fechamiles);
			System.out.println(fechaSQL);
			
			Time t=new Time(fechamiles);
			System.out.println(t);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
