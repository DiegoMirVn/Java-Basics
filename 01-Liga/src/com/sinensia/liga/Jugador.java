package com.sinensia.liga;

public class Jugador {

	private String nombre;
	private int goles;
	private Equipo equipo;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getGoles() {
		return goles;
	}

	public void setGoles(int goles) {
		this.goles = goles;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Jugador(String nombre,Equipo equipo) {
		this.nombre = nombre;
		this.equipo=equipo;
		this.goles=0;
		
	}
}
