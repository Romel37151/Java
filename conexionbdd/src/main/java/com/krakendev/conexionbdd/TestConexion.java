package com.krakendev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Canser37151");
		    System.out.println("fin");
		   
		    ps=connection.prepareStatement("insert into persona( cedula, nombre, apellido,numeros_hijos,estatura,cantidad_ahorrada,fecha_nacimento,hora_nacimeinto)"
		    		+ "values(?,?,?,?,?,?,?,?)");
		    ps.setString(1, "1105232972");
		    ps.setString(2, "jonathan");
		    ps.setString(3, "perez");
		    ps.setInt(4, 4);
		    ps.setDouble(5, 1.61);
		    ps.setBigDecimal(6, new  BigDecimal(1234.5));
		    
		    
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
				
				Time timeSQL=new Time(fechamiles);
				System.out.println(timeSQL);
				
				ps.setDate(7, fechaSQL);
				ps.setTime(8, timeSQL);
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		    System.out.println("ejecuta insert");
		    
		    
		     ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		/// ejemplo 2
		
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Canser37151");
		    System.out.println("fin");
		 
		    ps=connection.prepareStatement("insert into registros_entrada (codigo_registro,cedula_empleado,fecha,hora)"
		    		+ "		    values (?,?,?,?)");
		    ps.setInt(1, 85691);
		    ps.setString(2, "1754247722");
		  
		    
		    
			SimpleDateFormat sf= new SimpleDateFormat("yyyy/MM/dd  hh:mm:ss");
			
			String fechaStr="2020/01/8   8:50:00";
			
			
			try {
				Date fecha= sf.parse(fechaStr);
				System.out.println(fecha);
				
				long fechamiles=fecha.getTime();
				System.out.println(fechamiles);
				//crea un java.sql.Date partiendo de un java.util.Date 
				java.sql.Date fechaSQL= new java.sql.Date(fechamiles);
				System.out.println(fechaSQL);
				
				Time timeSQL=new Time(fechamiles);
				System.out.println(timeSQL);
				
				ps.setDate(3, fechaSQL);
				ps.setTime(4, timeSQL);
				
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		    System.out.println("ejecuta insert");
		    
		    
		     ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
