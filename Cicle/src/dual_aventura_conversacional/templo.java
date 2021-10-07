package dual_aventura_conversacional;

import java.util.ArrayList;

public class templo extends zona {

	boolean magatama_conseguida;

	public boolean isMagatama_conseguida() {
		return magatama_conseguida;
	}
	public void setMagatama_conseguida(boolean magatama_conseguida) {
		this.magatama_conseguida = magatama_conseguida;
	}
	
public templo(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean magatama_conseguida) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.magatama_conseguida = magatama_conseguida;
	}
	
	
	
	
}
