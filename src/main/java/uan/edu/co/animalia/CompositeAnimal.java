package uan.edu.co.animalia;

import java.util.ArrayList;
import java.util.List;

public class CompositeAnimal extends AbstractAnimal {

	private List<AbstractAnimal> animals = new ArrayList<AbstractAnimal>();

	public CompositeAnimal(String name) {
		super(name);
	}
	public void addAnimal(AbstractAnimal animal) {
        this.animals.add(animal);
    }

}
