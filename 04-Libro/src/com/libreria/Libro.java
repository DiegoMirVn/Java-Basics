package com.libreria;

public class Libro {

	private int isbn;
	private String titulo;
	private String autor;
	private int numPaginas;
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public Libro (int isbn,String titulo, String autor, int numPaginas) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.numPaginas=numPaginas;
	}
	
	@Override
	public String toString() {
		return "El libro con ISBN " + isbn + "creado por el autor" + autor + "y tiene " + numPaginas + "páginas";
	}
	
}
/*
 * 
“El libro con ISBN creado por el autor XXX tiene YYY páginas” 
En el fichero main, crear 2 objetos Libro (los valores que se quieran) y 
mostrarlos por pantalla. 
Por último, indicar cuál de los 2 tiene más páginas.
 */