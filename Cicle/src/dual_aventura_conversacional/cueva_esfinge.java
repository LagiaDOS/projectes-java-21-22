package dual_aventura_conversacional;

import java.util.ArrayList;

public class cueva_esfinge extends zona {
	Boolean enigma_resuelto;

	public Boolean getEnigma_resuelto() {
		return enigma_resuelto;
	}

	public void setEnigma_resuelto(Boolean enigma_resuelto) {
		this.enigma_resuelto = enigma_resuelto;
	}

	public cueva_esfinge(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, Boolean enigma_resuelto) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.enigma_resuelto = enigma_resuelto;
	}
	
	
	
	
	
}
