package com.sinensia.liga;

import java.util.ArrayList;

public class LigaEquipos {
	private ArrayList<Equipo>liga;
	
	
	public ArrayList<Equipo> getLiga() {
		return liga;
	}

	public void setLiga(ArrayList<Equipo> liga) {
		this.liga = liga;
	}

	public LigaEquipos() {
		this.liga=new ArrayList<Equipo>();;
	}
	
	public void agregarEquiposLiga(Equipo equipo) {
		this.liga.add(equipo);
	}
	
}
