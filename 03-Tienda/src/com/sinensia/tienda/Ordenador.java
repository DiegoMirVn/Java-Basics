package com.sinensia.tienda;

public class Ordenador extends Producto{

	private String procesador;
	private int memRam;
	private String memDisc;
	

public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public int getMemRam() {
		return memRam;
	}
	public void setMemRam(int memRam) {
		this.memRam = memRam;
	}
	public String getMemDisc() {
		return memDisc;
	}
	public void setMemDisc(String memDisc) {
		this.memDisc = memDisc;
	}


}
