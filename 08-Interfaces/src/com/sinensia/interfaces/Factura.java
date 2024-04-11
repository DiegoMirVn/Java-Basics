package com.sinensia.interfaces;

public class Factura implements Imprimible{

	protected int nFactura;
	protected int codigoCliente;
	
	public Factura(int factura, int codCli) {
		this.nFactura=factura;
		this.codigoCliente=codCli;
	}
	
	/**
	 * Metodo para generar informacion completa sobre factura
	 */
	@Override
	public void informeLargo() {
		System.out.println("El numero de paginas es: "+ nFactura + "y el numero de cliente  es:  "+ codigoCliente);
		
	}
/**
 * Metodo para generar informacion parcial sobre factura
 */
	@Override
	public void informeCorto() {
		System.out.println("El numero de paginas es: "+ nFactura);
		
	}

}
