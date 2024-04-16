package com.sinensia.electrodomesticos;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		float precioTv = 0;
		float precioLavadora = 0;
		float precioElectrodomesticos = 0;
		float precioTotal = 0;

		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(100, GamaColores.GRIS, LetraGastoEnergia.A, 25);
		Electrodomestico electrodomestico3 = new Electrodomestico(300, GamaColores.GRIS, LetraGastoEnergia.F, 50);
		Electrodomestico lavadora1 = new Lavadora();
		Electrodomestico lavadora2 = new Lavadora(100, GamaColores.GRIS, LetraGastoEnergia.A, 25, 15);
		Electrodomestico lavadora3 = new Lavadora(300, GamaColores.GRIS, LetraGastoEnergia.F, 50, 70);
		Electrodomestico television1 = new Television();
		Electrodomestico television2 = new Television(100, GamaColores.GRIS, LetraGastoEnergia.A, 25, 30, true);
		Electrodomestico television3 = new Television(300, GamaColores.GRIS, LetraGastoEnergia.F, 50, 0, false);
		Electrodomestico television4 = new Television(300, GamaColores.GRIS, LetraGastoEnergia.F, 50, 0, false);

		List<Electrodomestico> catalogo = new ArrayList<Electrodomestico>();
		catalogo.add(electrodomestico1);
		catalogo.add(electrodomestico2);
		catalogo.add(electrodomestico3);
		catalogo.add(lavadora1);
		catalogo.add(lavadora2);
		catalogo.add(lavadora3);
		catalogo.add(television1);
		catalogo.add(television2);
		catalogo.add(television3);
		catalogo.add(television4);

		for (Electrodomestico aparato : catalogo) {
			System.out.println(aparato);
			precioTotal += aparato.getPrecioFinal();
			
			if (aparato instanceof Lavadora) {
				precioLavadora+= aparato.getPrecioFinal();
			} 
			if (aparato instanceof Television) {
				precioTv+= aparato.getPrecioFinal();
			} 
			if (aparato instanceof Electrodomestico) {
				precioElectrodomesticos+= aparato.getPrecioFinal();
			} 

		}
		

		System.out.println("El precio del total de lavadoras es: " + precioLavadora);
		System.out.println("El precio del total de televisiones es: " + precioTv);
		System.out.println("El precio del total de todos los  electrodomesticos es: " + precioElectrodomesticos);
	}

}
