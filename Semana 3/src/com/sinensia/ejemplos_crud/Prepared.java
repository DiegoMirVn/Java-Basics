package com.sinensia.ejemplos_crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prepared {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/bdpersonas";
		String user = "root";
		String pass = "root";
		String sql = "SELECT * FROM personas WHERE nombre = ?";
		int valor = 21;

		try (Connection conexion = DriverManager.getConnection(url, user, pass);) {

			// PreparedStatement pstmt = generarConsultaParametrizada(sql, "Pepito",
			// conexion);

			// ResultSet rs = generarConsultaParametrizada(sql, "Pepito",
			// conexion).executeQuery(); // pstmt.executeQuery();

			mostrarLineas(generarConsultaParametrizada(sql, "Pepito", conexion));
			/*
			 * while (rs.next()) { System.out.println(rs.getString(1)); }
			 */
		} catch (

		SQLException e) {

			e.printStackTrace();
		}

	}

	public static PreparedStatement generarConsultaParametrizada(String sql, String nombre, Connection conexion)
			throws SQLException {

		PreparedStatement pstmt = conexion.prepareStatement(sql);
		pstmt.setString(1, nombre);
		return pstmt;

	}

	public static void mostrarLineas(PreparedStatement pstmt) throws SQLException {

		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}

	}

}
