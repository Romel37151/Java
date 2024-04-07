package com.krakendev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	    private final static String DRIVER="org.postgresql.Driver";
		private final static  String URL="jdbc:postgresql://localhost:5432/postgres\"";
		private final static String USUARIO="postgres";
		private final static String  CLAVE="Canser37151";
		
		
public static Connection conectar() {
		Connection connection=null;
		try {
			Class.forName("DRIVER");
			connection=DriverManager.getConnection(URL,USUARIO,CLAVE);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return connection;
	
	}
	

}
