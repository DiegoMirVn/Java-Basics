package com.sinensia.orquesta;

import java.util.ArrayList;
import java.util.List;

public class Orquesta {

	public static void main(String[] args) {

		Instrumento flauta = new Flauta("travesera", "honig");
		Instrumento tambor = new Tambor("de piel de ciervo","homa");
		Instrumento guitar = new Guitarra("guitarra",5);
		Instrumento electricGuitar= new GuitarraElectrica("fender",4);
		
		List<Instrumento>banda = new ArrayList();
		banda.add(flauta);
		banda.add(tambor);
		banda.add(guitar);
		banda.add(electricGuitar);
	
		
		for(Instrumento instrumento : banda) {
			if(instrumento instanceof Tambor) {
				((Tambor) instrumento).aporrear();
			}else {
				instrumento.tocar();
			}
		}
		
	}

}
