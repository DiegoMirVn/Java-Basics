package com.libreria;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Libro libro1 = new Libro (1231231,"El Quijote", "Cervantes", 800);
		Libro libro2 = new Libro (2141231,"El Lazarillo de Tormes", "Anonimo", 300);

		System.out.println(libro1);
		System.out.println(libro2);
		
		if(libro1.getNumPaginas()>libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo()+ " tiene mas paginas");
		}else if(libro2.getNumPaginas()>libro1.getNumPaginas()) {
			System.out.println(libro2.getTitulo()+ " tiene mas paginas");
		}else {
			System.out.println(" tienen mas paginas");
		}
		
	}

}
