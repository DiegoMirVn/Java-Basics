package com.sinensia.animales2;

public class Arana extends Animal {

	private static final int NUMPATAS = 8;

	public Arana() {
		super(NUMPATAS);

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
		System.out.println("Las arañas comen mosquitos");
	}

}
