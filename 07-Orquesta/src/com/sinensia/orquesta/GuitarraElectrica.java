package com.sinensia.orquesta;

public class GuitarraElectrica extends Guitarra{

	private int potencia;
	
	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	/**
	 * Constructor a partir de intrumento
	 * @param nombre
	 * @param numCuerdas
	 */
	public GuitarraElectrica(String nombre, int numCuerdas) {
		super(nombre, numCuerdas);
		this.potencia=potencia;
	}

	@Override
	public void tocar() {
	System.out.println("Tocando la guitarra electrica");
	}

	
}
