package com.sinensia.ejemplos_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static String url = "jdbc:mysql://localhost:3306/empleados";
	private static String user = "root";
	private static String pass = "root";

	public static Connection generarConexion() {

		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(url, user, pass);
			return conexion;
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}

		;
		return conexion;

	}
	
	
}
