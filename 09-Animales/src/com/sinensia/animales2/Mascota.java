package com.sinensia.animales2;

public class Mascota extends Animal {

	protected String nombre;

	public Mascota(int numPatas, String nombre) {
		super(numPatas);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void jugar() {
		
	}
}

/*
 
 * 
 * 
 * En los gatos el método comer mostrará el texto
 * "A los gatos les gusta comer peces y arañas" y el método jugar mostrará "A "
 * +Nombre del gato+ " le gusta jugar con pelotas" En los peces el método comer
 * mostrará el texto "Los peces comen  plancton", el método jugar mostrará
 * "estoy nadando" y el método andar añadirá "En realidad no ando, nado"
 */
