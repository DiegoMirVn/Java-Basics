package com.sinensia.liga;

import java.util.ArrayList;

public class Equipo {
	String nombre;
	int puntos;
	ArrayList<Jugador>plantilla;
	
	public Equipo (String nombre) {
		this.nombre = nombre;
		this.plantilla= new ArrayList<Jugador>();
	}
	public void agregarJugador(Jugador jugador) {
		plantilla.add(jugador);
	}
	
	
}
