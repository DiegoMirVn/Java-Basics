package com.sinensia.animales2;

public class Pez extends Mascota {

	private static final int NUMPATAS = 0;

	public Pez(String nombre) {
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
	public void jugar() {

		System.out.println("Estoy nadando");
	}

	@Override
	public void andar() {
		System.out.println("En realidad no ando, nado");

	}

	@Override
	public void comer() {
		System.out.println("Los peces comen plancton");
	}

}
