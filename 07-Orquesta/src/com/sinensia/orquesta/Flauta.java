package com.sinensia.orquesta;

public class Flauta extends Instrumento {

	public String modelo;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Constructor para crear flauta partiendo de instrumento
	 * @param modelo
	 */
	public Flauta(String nombre,String modelo) {
		super(nombre,Tipo.VIENTO);
		this.modelo = modelo;
	}

	/**
	 * Sobrrescribre al del padre añadiendo Sonando;
	 */
	@Override
	public void afinar() {
		super.afinar();
		System.out.print("Sonando");
	}



	

	
}
