package com.sinensia.figuras_geometricas;

public class Rectangulo extends FiguraGeometrica{

	private float base;
	private float altura;
	private float perimetro;
	private float area;

	public Rectangulo(float base, float altura) {
		super();
		this.base = base;
		this.altura = altura;
	}


	public float getBase() {
		return base;
	}


	public void setBase(float base) {
		this.base = base;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
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

		this.area = this.base * this.altura;

		return area;
	}

	@Override
	public float calcularPerimetro() {
		this.perimetro = this.base*2 + this.altura*2;
		return perimetro;
	}


	@Override
	public String toString() {
		return "Rectangulo [base=" + base + ", altura=" + altura + ", perimetro=" + perimetro + ", area=" + area
				+ ", calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}

	
}
