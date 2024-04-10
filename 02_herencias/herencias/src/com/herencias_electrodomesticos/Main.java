package com.herencias_electrodomesticos;

public class Main {

	public static void main(String[] args) {
		
		ReproductorCd discman = new ReproductorCd("asdaw12","Sony",150.3f, 2.0f,700);
		Tocadiscos touchDisks = new Tocadiscos("45645ghjg","Sony",150.2f, 2.0f,700);
		discman.encender();
		discman.darPlay();
		discman.darRewind();
		discman.apagar();
		
		touchDisks.encender();
		
		Lavadora lavadora = new Lavadora("h123er","Balay",350.45f,220.0f,2330);
		System.out.println(discman);
	}

}
