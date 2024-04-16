package com.sinensia.animales2;

public class Gato extends Mascota {

	private static final int NUMPATAS = 4;

	/**
	 * @param numPatas
	 * @param nombre
	 */
	protected Gato(String nombre) {
		super(NUMPATAS, nombre);

	}

	@Override
	public String getNombre() {

		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {

		super.setNombre(nombre);
	}

	@Override
	public int getNumPatas() {

		return super.getNumPatas();
	}

	@Override
	public void andar() {

		super.andar();
	}

	@Override
	public void comer() {

		System.out.println("Los gatos comen peces y arañas");
		;
	}

	@Override
	public void jugar() {

		System.out.println("A " + this.getNombre() + "le gusta jugar con las pelotas");
	}

}
