package com.sinensia.enumerados;

public class Main {
	
public static void main(String[] args) {
	
   

                Tutoriales t1 = Tutoriales.JAVA;
                Tutoriales t2 = Tutoriales.HTML;
                Tutoriales t3 = Tutoriales.MYSQL;

                System.out.println(t1);
                System.out.println(t2);
                System.out.println(t3);
                System.out.println("Lista de Turoriales:");
                for (Tutoriales tuto : Tutoriales.values()) {
                        System.out.println("\tEl tutorial de " + tuto + " cuesta " + tuto.mostrarPrecio() + " euros");
                }
                System.out.println(Tutoriales.JAVA.ordinal());

        }


}

