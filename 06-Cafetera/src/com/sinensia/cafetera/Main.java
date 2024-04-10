package com.sinensia.cafetera;

public class Main {

	public static void main(String[] args) {
	
		Cafetera belica1 = new Cafetera() ;
		Cafetera belica2 = new Cafetera(4000) ;
		Cafetera belica3 = new Cafetera(2000, 2200) ;
		
		
		
		belica1.agregarCafeCafetera(300);
		belica2.agregarCafeCafetera(300);
		belica3.agregarCafeCafetera(300);
	
	}

}
