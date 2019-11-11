package uan.edu.co.animalia;

public abstract class AbstractAnimal {
	protected String name;

	public AbstractAnimal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
