package com.sinensia.electrodomesticos;

public class Television extends Electrodomestico {

	protected int resolucion;
	protected boolean sintonizadorTdt;
	private final int PULGADASBASE=20;
	private final boolean TDT = false;
	/**
	 * 
	 */
	protected Television() {
		super();
		this.resolucion=PULGADASBASE;
		this.sintonizadorTdt=TDT;
	}
	/**
	 * @param precio
	 * @param peso
	 */
	protected Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion=PULGADASBASE;
		this.sintonizadorTdt=TDT;
	}
	/**
	 * @param precioBase
	 * @param color
	 * @param letraGasto
	 * @param peso
	 */
	protected Television(double precioBase, GamaColores color, LetraGastoEnergia letraGasto, double peso,int resolucion,boolean tdt) {
		super(precioBase, color, letraGasto, peso);
		this.resolucion=resolucion;
		this.sintonizadorTdt=tdt;
	}
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}
	public void setSintonizadorTdt(boolean sintonizadorTdt) {
		this.sintonizadorTdt = sintonizadorTdt;
	}
	
	/**
	 * Agregamos el valor del calcularPrecioPadre un incremento del 30%
	 * si resolucion > de 40 pulgadas, y de 50 euros si lleva tdt incorporado.
	 */
	@Override
	public double calcularPrecioFinal() {
		
		double precioSinSuplemento = super.calcularPrecioFinal();
		double subidaPrecioTamaño = precioSinSuplemento*1.3;
		double TARIFATDT=50;
		
		precioFinal = (this.getResolucion()<40) ? precioSinSuplemento : subidaPrecioTamaño;
		precioFinal = (this.sintonizadorTdt) ? (precioFinal+TARIFATDT) : precioFinal;
		
		return precioFinal;
	}
	
	
	
}
