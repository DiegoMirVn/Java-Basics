package com.sinensia.animales2;

public class Animal {

	protected int numPatas;

	public Animal(int numPatas) {
		this.numPatas = numPatas;
	}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public void andar() {
		System.out.println("Este " + this.getClass().getSimpleName() + "anda sobre " + this.numPatas + "patas");

	}

	public void comer() {

	}
}
