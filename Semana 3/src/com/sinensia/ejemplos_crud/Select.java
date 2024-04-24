package com.sinensia.ejemplos_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) {
		String cadenaConexion = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pass = "root";
		String query = "SELECT * FROM personas";

		try (Connection conexion = DriverManager.getConnection(cadenaConexion, user, pass);
				Statement stmt = conexion.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				) {

			while (rs.next()) {
				System.out.print(rs.getString("nombre"));
				System.out.print(rs.getString("apellido"));
				System.out.println(rs.getInt("edad"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
