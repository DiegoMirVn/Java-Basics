package com.cuenta;

public class Cuenta {

	private String titular;
	private double cantidad;
	
	/*
	 * Getters Setters
	 */
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	/*
	 * Constructor
	 */
	public Cuenta (String titular) {
		this.titular = titular;
	}
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	/*
	 * Metodos Propios
	 */
		public void ingresarCantidad(double valor){
	
			if(valor>0) {
				double saldoNuevo = this.getCantidad()+valor;
				this.setCantidad(saldoNuevo);
			}else {
				System.out.println("La cantidad aportada es inferior a 0");
			}
		}
		public void retirarCantidad(double valor) {
	
			double saldoActual = this.getCantidad()-valor;
			if(saldoActual <=0) {
				this.setCantidad(0.0);
			}else {
				this.setCantidad(saldoActual);
			}
		}
		@Override
		public String toString() {
			return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
		}
		
}


 