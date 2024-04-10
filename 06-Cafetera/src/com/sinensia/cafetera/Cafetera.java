package com.sinensia.cafetera;

public class Cafetera {

	private  final int CAPBASE = 1000; //centimetro cubicos = c.c 
	private int maximaCap ;
	private int content;
	
	
	public int getMaximaCap() {
		return maximaCap;
	}
	public void setMaximaCap(int maximaCap) {
		this.maximaCap = maximaCap;
	}
	public int getContent() {
		return content;
	}
	public void setContent(int content) {
		this.content = content;
	}
	public int getCAPBASE() {
		return CAPBASE;
	}
	/**
	 * Contructor por si genera una cafetara sin prametros 1000 de capacidad
	 */
	public Cafetera() {
		this.maximaCap=CAPBASE;
	}
	
	/**
	 * Cuando quieres cambiar el valormaximo porque es otro modelo de cafetera, y la quieres llena desde su creacion
	 * @param valorMax
	 */
	public Cafetera(int valorMax) {
		this.maximaCap=valorMax ;
		this.content=valorMax;
		
	}
	
	/**
	 * Contructor para crear cafetera que tenga una capacidad definida en el, y que previene desborde de contenido inicializando
	 * valor de contenido a como maximo igual a su capacidad.
	 * @param valorMax
	 * @param valorCont
	 */
	public Cafetera(int valorMax, int valorCont) {
		if(valorMax<valorCont) {
			this.content= valorMax;
			this.maximaCap=valorMax;
		}else {
			this.content=valorCont;
			this.maximaCap=valorMax;
		}
	}
		
	public void llenarCafetera() {
		this.content=this.maximaCap;
	}
	public void servirTaza(int miliTaza) {
		if(this.content-miliTaza <0) {
			System.out.println("No alcanza para llenar la taza");
			this.content=0;
		}else {
			this.content= this.content-miliTaza;
		}
		
	}
	public void vaciarCafetera() {
		this.content=0;
	}
	public void agregarCafeCafetera(int miliCafetera) {
		this.content=this.content+miliCafetera;
	}
	@Override
	public String toString() {
		return "Cafetera [maximaCap=" + maximaCap + ", content=" + content + "]";
	}
	
	

	
	
}
