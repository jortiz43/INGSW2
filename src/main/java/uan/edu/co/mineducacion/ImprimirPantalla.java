package uan.edu.co.mineducacion;

import java.util.ArrayList;
import java.util.List;

public class ImprimirPantalla {

	private List  hojas = new ArrayList();

	public List getHojas() {
		return  hojas;
	}

	public void setHojas(List hojas) {
		this. hojas = hojas;
	}

	public void addHoja(AbstractMinedu hoja) {
		 hojas.add(hoja);
	}


}
