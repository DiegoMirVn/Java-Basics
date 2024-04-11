package com.sinensia.orquesta;

public class Guitarra extends Instrumento {

	private int numCuerdas;
	
	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public Guitarra(String nombre, int numCuerdas) {
		super(nombre, Tipo.CUERDA_PULSADA);
		this.numCuerdas=numCuerdas;
	}

	public void tocar() {
		System.out.println("Tocando el intrumento "+ this.getNombre());
	}
		
	}


