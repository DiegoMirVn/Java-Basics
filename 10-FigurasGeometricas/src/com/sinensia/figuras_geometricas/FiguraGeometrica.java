package com.sinensia.figuras_geometricas;

public abstract class FiguraGeometrica {

	public FiguraGeometrica() {

	}

	public float calcularArea() {
		return 0;
		
	}

	public float calcularPerimetro() {
		return 0;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [calcularArea()=" + calcularArea() + ", calcularPerimetro()=" + calcularPerimetro()
				+ "]";
	}

}
