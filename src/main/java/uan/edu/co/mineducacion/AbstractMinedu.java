package uan.edu.co.mineducacion;

public abstract class AbstractMinedu {
	protected String name;

	public AbstractMinedu(String name) {
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
