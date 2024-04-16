package com.sinensia.electrodomesticos;

public class Electrodomestico {

	protected static float precioClase;
	protected final double PRECIOBASE;
	protected final GamaColores COLOR;
	protected final LetraGastoEnergia LETRAGASTO;
	protected final double PESO;
	protected double precioFinal;
	protected final static int TRAMO1 = 10;
	protected final static int TRAMO2 = 50;
	protected final static int TRAMO3 = 80;
	protected final static int TRAMO4 = 100;

	/**
	 * Objetos Electrodomestico por defecto
	 */
	public Electrodomestico() {

		this.PRECIOBASE = 100;
		this.COLOR = GamaColores.BLANCO;
		this.LETRAGASTO = LetraGastoEnergia.F;
		this.PESO = 5;
	}

	/**
	 * Objetos Electrodomestico convalores por defecto , precio y peso definido
	 * 
	 * @param precio
	 * @param peso
	 */
	public Electrodomestico(double precio, double peso) {
		this.PRECIOBASE = precio;
		this.PESO = peso;
		this.COLOR = GamaColores.BLANCO;
		this.LETRAGASTO = LetraGastoEnergia.F;
	}

	/**
	 * Objetos Electrodomesticos con todos los valores nuevos
	 * 
	 * @param precioBase
	 * @param color
	 * @param letraGasto
	 * @param peso
	 */
	public Electrodomestico(double precioBase, GamaColores color, LetraGastoEnergia letraGasto, double peso) {

		this.PRECIOBASE = precioBase;
		this.COLOR = color;
		this.LETRAGASTO = letraGasto;
		this.PESO = peso;
	}

	public double getPRECIOBASE() {
		return PRECIOBASE;
	}

	public GamaColores getCOLOR() {
		return COLOR;
	}

	public LetraGastoEnergia getLETRAGASTO() {
		return LETRAGASTO;
	}

	public double getPESO() {
		return PESO;
	}

	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

	/**
	 * Comprueba si la letra pasada es igual a la del consumo del objeto
	 * 
	 * @param letra
	 */
	public void consumoEnergetico(String letra) {
		if (letra.equals(this.LETRAGASTO.getLetra())) {
			System.out.println("Es la letra correcta");
		} else {
			System.out.println("No es la letra correcta");
		}

	}

	/**
	 * Cmprueba si el color pasado es igual al color del objeto
	 * 
	 * @param color
	 */
	public void comprobarColor(String color) {
		if (color.equals(this.getCOLOR().getNombre())) {
			System.out.println("Es el color correcto");
		} else {
			System.out.println("No es el color correcto");
		}
	}

	/**
	 * Asigna precioFinal al objeto, tomando como valores las propiedades internas
	 * del enum LetraGastoEnergetico y del peso del articulo (constantes TRAMO)
	 */
	public double calcularPrecioFinal() {
		double incrementoConsumo = this.LETRAGASTO.getValor();
		double incrementoPeso;
		if (this.getPESO() < 20) {
			incrementoPeso = TRAMO1;
		} else if (this.getPESO() < 50) {
			incrementoPeso = TRAMO2;
		} else if (this.getPESO() < 80) {
			incrementoPeso = TRAMO3;
		} else {
			incrementoPeso = TRAMO4;
		}

		precioFinal = incrementoConsumo + incrementoPeso + this.PRECIOBASE;
		
		return precioFinal;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+ "--------"+" PRECIOBASE=" + this.PRECIOBASE + "--------"+ "COLOR=" + this.COLOR +  "--------"+" LETRAGASTO=" +this. LETRAGASTO
				+ "--------"+"PESO=" + this.PESO + "--------"+" PRECIOFINAL=" + this.calcularPrecioFinal() ;
	}
	


}
