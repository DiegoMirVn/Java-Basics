package com.herencias_electrodomesticos;

public class Electrodomestico {

	/**
	 * Propiedades de electrodomesticos
	 */
	private String nombre;
	private String marca;
	private boolean encendido;
	private boolean apagado;
	private float precio;
	private float voltaje;
	private int velocidad;
	
	
	/*
	 * Getters y Setters
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public boolean isApagado() {
		return apagado;
	}

	public void setApagado(boolean apagado) {
		this.apagado = apagado;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public float getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(float voltaje) {
		this.voltaje = voltaje;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	/**
	 * Contructor 
	 */


	public Electrodomestico(String nombre,String marca,float precio, float voltaje , int velocidad) {
		this.nombre=nombre;
		this.marca=marca;
		this.precio=precio;
		this.voltaje=voltaje;
		this.velocidad=velocidad;
	}
	
	/**
	 * Metodos Propios
	 */
	public void encender() {
		this.encendido=true;
		this.apagado=false;
	}
	public void apagar() {
		this.encendido=false;
		this.apagado=true;
	}
}
