package com.sinensia.interfaces;

public class GestionImpresion {

	/**
	 * Metodo que instancia 2 objetos y llama a sus metodos informeCorto() e informeLargo();
	 */
	public void gestionarImpresion() {
		Factura factura = new Factura(100,1231);
		Pagina pagina = new Pagina(150,34343);
		factura.informeLargo();
		factura.informeCorto();
		pagina.informeLargo();
		pagina.informeCorto();
	}
}
