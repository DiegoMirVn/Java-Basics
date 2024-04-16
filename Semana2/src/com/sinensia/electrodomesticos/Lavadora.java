package com.sinensia.electrodomesticos;

public class Lavadora extends Electrodomestico {

	protected double carga;
	protected final double CARGA = 5;

	/**
	 * 
	 */
	protected Lavadora() {
		super();
		this.carga = CARGA;
	}

	/**
	 * @param precio
	 * @param peso
	 */
	protected Lavadora(double precio, double peso, double carga) {
		super(precio, peso);
		this.carga = CARGA;

	}

	/**
	 * @param precioBase
	 * @param color
	 * @param letraGasto
	 * @param peso
	 */
	protected Lavadora(double precioBase, GamaColores color, LetraGastoEnergia letraGasto, double peso, double carga) {
		super(precioBase, color, letraGasto, peso);
		this.carga = carga;

	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	/**
	 * Toma el precio Final del metodo del padre y agrega 50 si pasa de 30 kilos
	 * carga.
	 */
	@Override
	public double calcularPrecioFinal() {

		double precioSinCarga =super.calcularPrecioFinal();
		final int  TRAMOCARGA=50;
		precioFinal = ((this.getPESO()<30.0)) ? precioSinCarga  : (precioSinCarga+TRAMOCARGA);
		return precioFinal;
	}

}
