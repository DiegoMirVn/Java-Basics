package com.sinensia.ejemplos_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo1 {

	public static void main(String[] args) {

		String cadenaConexion = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pass = "root";

		try (Connection conexion = DriverManager.getConnection(cadenaConexion, user, pass);
				Statement sentencia = conexion.createStatement();)

		{
			sentencia.executeUpdate("INSERT INTO personas (nombre,apellido,edad) VALUES ('Pepito','Sera',20)");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
