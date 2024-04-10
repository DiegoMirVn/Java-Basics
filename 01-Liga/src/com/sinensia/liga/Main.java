package com.sinensia.liga;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
	String[] lista = {"Barsa", "Celta","Depor","Madrid"};
	String[] listaJugadores = {"Karpin", "Mostovoi","Giovannela"};
	//String[] listaJugadores = {"Karpin", "Mostovoi","Giovannela"};
	//String[] listaJugadores = {"Karpin", "Mostovoi","Giovannela"};
	//String[] listaJugadores = {"Karpin", "Mostovoi","Giovannela"};
	

	
	for(int i=0; i<lista.length;i++) {
		Equipo equipo = new Equipo(lista[i]);
		for(int j=0;j<listaJugadores.length;j++) {
			Jugador jugador = new Jugador(listaJugadores[j]);
			System.out.println(jugador.nombre);
			equipo.agregarJugador(jugador);
		}
	}
	}

//
}
