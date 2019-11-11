package uan.edu.co.animalia;

import java.util.ArrayList;
import java.util.List;

public class ImprimirPantalla {

	private List  animals = new ArrayList();

	public List getAnimals() {
		return  animals;
	}

	public void setAnimals(List animals) {
		this. animals = animals;
	}

	public void addAnimal(AbstractAnimal animal) {
		 animals.add(animal);
	}

	public void imprimir() {
		for (AbstractAnimal anim: animals) {
			System.out.println(anim.getName());

		}
	}
}
