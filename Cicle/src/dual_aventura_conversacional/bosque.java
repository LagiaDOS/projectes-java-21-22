package dual_aventura_conversacional;

import java.util.ArrayList;

public class bosque extends zona {

	public bosque(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		// TODO Auto-generated constructor stub
	}

	
	
	public boolean potmoure(lago zona_lago) {
		//cada zona te el seu potmoure propi amb les condicions propies. Aixo es nomes un default por si acaso
		
		
		if (zona_lago.risas == true) {return true;}
		else {return false;}
	
		
		
	}
	
	
	
}
