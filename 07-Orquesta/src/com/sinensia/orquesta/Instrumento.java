package com.sinensia.orquesta;

public class Instrumento {

	private String nombre;
	private Tipo tipo;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * Contructor
 * @author 6003070
 * @param nombre
 * @param tipo
 */
	public Instrumento (String nombre , Tipo tipo) {
		this.nombre=nombre;
		this.tipo = tipo;
	}
	
/**
 * Metodo que afina el instrumento
 */
	public void afinar() {
		System.out.println("Afinando el intrumento "+ this.nombre);
	}
	
	/**
	 * Metodo que comineza a tocar  el instrumento
	 */
	public void tocar() {
		System.out.println("Tocando el intrumento "+ this.nombre);
	}
}
