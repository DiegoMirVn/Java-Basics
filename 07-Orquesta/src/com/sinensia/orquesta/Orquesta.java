package com.sinensia.orquesta;

public class Orquesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flauta flauta = new Flauta("travesera", "honig");
		Tambor tambor = new Tambor("ciervo","homa");
		Guitarra guitar = new Guitarra("alhambra",5);
		GuitarraElectrica electricGuitar= new GuitarraElectrica("fender",4);
		
		
		flauta.tocar();
		tambor.aporrear();
		guitar.tocar();
		electricGuitar.tocar();
	}

}
