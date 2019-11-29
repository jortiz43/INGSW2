package uan.edu.co.mineducacion;

import java.util.ArrayList;
import java.util.List;

public class CompositeMinedu extends AbstractMinedu {

	private List<AbstractMinedu> hojas = new ArrayList<AbstractMinedu>();

	public CompositeMinedu(String name) {
		super(name);
	}
	public void addHoja(AbstractMinedu hoja) {
        this.hojas.add(hoja);
    }

}
