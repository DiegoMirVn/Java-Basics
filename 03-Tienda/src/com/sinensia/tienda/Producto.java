package com.sinensia.tienda;

public class Producto {

	private String codProd;
	private String modelo;
	private double precio;
	private int unidades;
	public String getCodProd() {
		return codProd;
	}
	public void setCodProd(String codProd) {
		this.codProd = codProd;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public void venderProd(int ud) {
		if(this.unidades-ud>0) {
			this.unidades=this.unidades-ud;
		}else {
			System.out.println("No es posible realizar la venta");
		}
	}
	
}
