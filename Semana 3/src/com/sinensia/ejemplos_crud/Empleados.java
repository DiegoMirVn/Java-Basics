package com.sinensia.ejemplos_crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Empleados {

	public static void main(String[] args) {

		String querySelect = "SELECT * FROM empleados";
		String querySelectWhere = "SELECT * FROM empleados WHERE last_name = ?";
		String queryUpdate = "INSERT INTO empleados (first_name,last_name,email,gender,company,department,job_title) VALUES (?,?,?,?,?,?,?)";
		String queryDelete = "DELETE FROM empleados WHERE gender = ?";
		String apellido = "Spray";
		String gender = "Male";

		try (Connection connect = Conexion.generarConexion();
				ResultSet rs = obtenerResultSetNoPreparado(generarStatement(connect), querySelect);
				ResultSet rs1 = obtenerResultSetPreparado(
						generarPreparedStatement(querySelectWhere, connect, apellido));

		) {
			eliminarFilaTablaEmpleados(connect, queryDelete, gender);
			insertarFilaTablaEmpleados(connect, queryUpdate, "Diego", "Miras", "email@google.es", "Male", "Yahoo",
					"Programmer", "Junior Developer");

			while (rs.next()) {
				System.out.print(rs.getString(1));
				System.out.print("------");
				System.out.print(rs.getString(2));
				System.out.print("------");
				System.out.print(rs.getString(3));
				System.out.print("------");
				System.out.print(rs.getString(4));
				System.out.print("------");
				System.out.print(rs.getString(5));
				System.out.print("------");
				System.out.print(rs.getString(6));
				System.out.print("------");
				System.out.print(rs.getString(7));
				System.out.print("------");
				System.out.print(rs.getString(8));
				System.out.println("");
			}
			while (rs1.next()) {
				System.out.print(rs1.getString(1));
				System.out.print("------");
				System.out.print(rs1.getString(2));
				System.out.print("------");
				System.out.print(rs1.getString(3));
				System.out.print("------");
				System.out.print(rs1.getString(4));
				System.out.print("------");
				System.out.print(rs1.getString(5));
				System.out.print("------");
				System.out.print(rs1.getString(6));
				System.out.print("------");
				System.out.print(rs1.getString(7));
				System.out.print("------");
				System.out.print(rs1.getString(8));
				System.out.println("");
			}

		} catch (

		SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Creamos statement con la conexion
	 * 
	 * @param conexion
	 * @return
	 * @throws SQLException
	 */
	public static Statement generarStatement(Connection conexion) throws SQLException {

		Statement stmt = conexion.createStatement();
		return stmt;

	}

	/**
	 * Genera el ResultSet de datos a partir de un statement y la query que
	 * necesitamos, en este caso solo funciona para la SELECT * FROM tabla
	 * 
	 * @param stmt
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public static ResultSet obtenerResultSetNoPreparado(Statement stmt, String query) throws SQLException {

		ResultSet rs = stmt.executeQuery(query);

		return rs;
	}

	/**
	 * Genera el objeto Statement preparado a partir de una conexion, el script sql
	 * para consulta preparada y una variable que sustituye al ?
	 * 
	 * @param query
	 * @param conexion
	 * @param dato
	 * @return
	 * @throws SQLException
	 */

	public static PreparedStatement generarPreparedStatement(String query, Connection conexion, String dato)
			throws SQLException {

		PreparedStatement pstmt = conexion.prepareStatement(query);
		pstmt.setString(1, dato);

		return pstmt;

	}

	/**
	 * Generar un ResultSet para consulta preparada;
	 * 
	 * @param prepareStmt
	 * @return
	 * @throws SQLException
	 */

	public static ResultSet obtenerResultSetPreparado(PreparedStatement prepareStmt) throws SQLException {

		ResultSet rs = prepareStmt.executeQuery();

		return rs;
	}

	/**
	 * Inserta una fila en la tabla pasandole una serie de parametros para cada
	 * columna
	 * 
	 * @param conexion
	 * @param query
	 * @param params
	 * @throws SQLException
	 */
	public static void insertarFilaTablaEmpleados(Connection conexion, String query, String... params)
			throws SQLException {

		PreparedStatement pstmt = conexion.prepareStatement(query);

		for (int i = 0; i < params.length; i++) {
			pstmt.setString(i + 1, params[i]);
		}
		pstmt.execute();
	}

	public static void eliminarFilaTablaEmpleados(Connection conexion, String query, String... params)
			throws SQLException {

		PreparedStatement pstmt = conexion.prepareStatement(query);

		for (int i = 0; i < params.length; i++) {
			pstmt.setString(i + 1, params[i]);
		}
		pstmt.execute();
	}
}
