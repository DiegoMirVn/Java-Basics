package com.sinensia.orquesta;

public class Tambor extends Instrumento{

	private String tamano;
	
	
	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public Tambor(String nombre, String tamano) {
		super(nombre,Tipo.PERSUSION);
		this.tamano=tamano;
	}

	public void aporrear() {
	System.out.println("Aporreando tambor " +this.getNombre());
	}
}
