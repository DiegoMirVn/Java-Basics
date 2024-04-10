package com.sinensia.liga;

import java.util.ArrayList;

public class Equipo {
	private String nombre;
	private int puntos;
	private ArrayList<Jugador>plantilla;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	/**
	 * public ArrayList<Jugador> getPlantilla() {
	 * @param jugador
	 
		return plantilla;
	}*/
	
	public Equipo (String nombre) {
		this.nombre = nombre;
		this.plantilla= new ArrayList<Jugador>();
		this.puntos=0;
	}
	public void agregarJugador(Jugador jugador) {
		plantilla.add(jugador);
	}
	public void sumarVictoria() {
		this.puntos=this.puntos+3;
	}
	public void sumarEmpate() {
		this.puntos=this.puntos+1;
	}
	
	
}
