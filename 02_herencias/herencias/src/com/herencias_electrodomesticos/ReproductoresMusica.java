package com.herencias_electrodomesticos;

public class ReproductoresMusica extends Electrodomestico{

	
	private boolean play;
	private boolean rewind;
	
	public boolean isPlay() {
		return play;
	}
	public void setPlay(boolean play) {
		this.play = play;
	}
	public boolean isRewind() {
		return rewind;
	}
	public void setRewind(boolean rewind) {
		this.rewind = rewind;
	}
	
	/**
	 * 
	 * @param nombre
	 * @param marca
	 * @param precio
	 * @param voltaje
	 * @param velocidad
	 */
	public ReproductoresMusica(String nombre, String marca, float precio, float voltaje, int velocidad) {
		super(nombre, marca, precio, voltaje, velocidad);
		
	}
	
	/**
	 * Metodos Propios
	 */
	public void darPlay() {
		this.play=true;
		this.rewind=false;
	}
	public void darRewind() {
		this.play=false;
		this.rewind=true;
	}
}
