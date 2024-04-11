package com.sinensia.interfaces;

public class Pagina implements Imprimible {

	protected int nPaginas;
	protected int nLineas;
	
	
	public Pagina(int paginas,int lineas) {
		this.nPaginas = paginas;
		this.nLineas=lineas;
	}
	
	/**
	 * Metodo para generar informacion completa sobre Pagina
	 */
	@Override
	public void informeLargo() {
		System.out.println("El numero de paginas es: "+ nPaginas + "y el numero de lineas es:  "+ nLineas);
		
	}

	/**
	 * Metodo para generar informacion parcial sobre Pagina
	 */
	@Override
	public void informeCorto() {
		System.out.println("El numero de paginas es: "+ nPaginas);
		
	}

}
