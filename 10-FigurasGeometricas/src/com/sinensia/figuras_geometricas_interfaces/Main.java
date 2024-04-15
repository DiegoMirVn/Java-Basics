package com.sinensia.figuras_geometricas_interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		FiguraGeometrica forma2 = new Cuadrado(4.5f);
		FiguraGeometrica forma3 = new Circulo(4.6f);
		FiguraGeometrica forma4 = new Rectangulo(2.3f, 6.5f);

		
		List<FiguraGeometrica> formas = new ArrayList<FiguraGeometrica>();
		formas.add(forma2);
		formas.add(forma3);
		formas.add(forma4);
		

		
		for(FiguraGeometrica forma : formas) {
			System.out.println(forma);
		
		}
	}

}
