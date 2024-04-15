package com.sinensia.figuras_geometricas_interfaces;

public class Circulo extends FiguraGeometrica {

	private float radio;


	public Circulo() {
		super();
		
	}
	

	public Circulo(float radio) {
		super();
		this.radio = radio;
	}


	@Override
	public float calcularArea() {
		
		float resultado =(float) (Math.PI* (Math.pow(this.radio, 2)));
		return resultado;
	}

	@Override
	public float calcularPerimetro() {
		float resultado = (float) (Math.PI * radio);
		return resultado;
	}

	@Override
	public String toString() {
		return "Circulo [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}
	
	

	
	
}
