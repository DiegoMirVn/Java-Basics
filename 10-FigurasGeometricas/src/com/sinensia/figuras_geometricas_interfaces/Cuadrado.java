package com.sinensia.figuras_geometricas_interfaces;

public class Cuadrado extends FiguraGeometrica {

	private float lado;

	private float perimetro;
	private float area;

	public Cuadrado(float lado) {
		super();
		this.lado = lado;

	}

	public float getLado() {
		return lado;
	}

	public void setLado(float lado) {
		this.lado = lado;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	@Override
	public float calcularArea() {

		this.area = this.lado * this.lado;

		return area;
	}

	@Override
	public float calcularPerimetro() {
		this.perimetro = this.lado * 4;
		return perimetro;
	}

	@Override
	public String toString() {
		return "Cuadrado [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}

}
