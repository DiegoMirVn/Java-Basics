package com.sinensia.electrodomesticos;

public enum LetraGastoEnergia {

	A("A", 100), B("B", 80), C("C", 60), D("D", 50), E("E", 30), F("F", 10);

	private String letra;
	private int valor;

	public String getLetra() {
		return letra;
	}

	public void setLetra(String letra) {
		this.letra = letra;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	LetraGastoEnergia(String letra, int valor) {
		this.letra = letra;
		this.valor = valor;
	}
}
