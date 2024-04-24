package com.sinensia.ejemplos_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ejemplo2 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pass = "root";
		String sql = "INSERT INTO personas (nombre,apellido,edad) VALUES ('Jorge','Sera',20)";

		try (Connection conexion = DriverManager.getConnection(url, user, pass);
				Statement stmt = conexion.createStatement();) {
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
