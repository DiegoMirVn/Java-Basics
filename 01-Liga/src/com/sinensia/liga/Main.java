package com.sinensia.liga;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
	String[] lista = {"Barsa", "Celta","Depor","Madrid"};
	String[] listaJugadoresCelta = {"Karpin", "Mostovoi","Giovannela"};
	String[] listaJugadoresDepor= {"Makai", "Fran","Bebeto"};
	String[] listaJugadoresMadrid = {"Ronaldo", "Figo","Zidane"};
	String[] listaJugadoresBarsa = {"Guardiola", "Rivaldo","Koeman"};;
	
	LigaEquipos liga = new LigaEquipos();
	
	for(int i=0; i<lista.length;i++) {
		Equipo equipo = new Equipo(lista[i]);
		liga.agregarEquiposLiga(equipo);

	}

		for(int k=0;k<listaJugadoresCelta.length;k++) {
			Jugador jugador = new Jugador(listaJugadoresCelta[k] , liga.getLiga().get(0));
			liga.getLiga().get(0).agregarJugador(jugador);
			
		}
		for(int k=0;k<listaJugadoresDepor.length;k++) {
			Jugador jugador = new Jugador(listaJugadoresDepor[k] , liga.getLiga().get(1));
			liga.getLiga().get(1).agregarJugador(jugador);
			
		}
		for(int k=0;k<listaJugadoresMadrid.length;k++) {
			Jugador jugador = new Jugador(listaJugadoresMadrid[k] , liga.getLiga().get(2));
			liga.getLiga().get(2).agregarJugador(jugador);
			
		}
		for(int k=0;k<listaJugadoresBarsa.length;k++) {
			Jugador jugador = new Jugador(listaJugadoresBarsa[k] , liga.getLiga().get(3));
			liga.getLiga().get(3).agregarJugador(jugador);

			
			
		}
	
	}
	
	}

