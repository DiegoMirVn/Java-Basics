package com.sinensia.electrodomesticos;

public enum GamaColores {

	BLANCO("BLANCO"),NEGRO("NEGRO"), ROJO("ROJO"),AZUL("AZUL"),GRIS("GRIS");

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	GamaColores(String string) {
		this.nombre=string;
	}

	
}
