package dual_aventura_conversacional;

import java.util.ArrayList;

public class torre_cima extends zona {

	public torre_cima(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		// TODO Auto-generated constructor stub
	}

	
	public boolean potmoure(torre_medio zona_torre_medio) {
		// TODO Auto-generated method stub
		return false;
	}

}
