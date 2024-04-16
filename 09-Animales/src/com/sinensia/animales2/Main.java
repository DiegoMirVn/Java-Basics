package com.sinensia.animales2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Animal(0);
		Animal arana = new Arana();
		Animal gato = new Gato("Bigotitos");
		Mascota masco = new Mascota(5, "Mascotita");
		Animal pez = new Pez("Nemo");

		List<Animal> zoo = new ArrayList<Animal>();

		zoo.add(arana);
		zoo.add(gato);
		zoo.add(pez);

		for (Animal criatura : zoo) {
			if (criatura instanceof Gato) {
				criatura.andar();
				((Gato) criatura).jugar();
				criatura.comer();
			} else if (criatura instanceof Pez) {
				criatura.andar();
				((Pez) criatura).jugar();
				criatura.comer();
			} else if (criatura instanceof Arana) {
				criatura.andar();
				criatura.comer();
			} else {
				criatura.andar();
				criatura.comer();
			}
		}

	}
}
