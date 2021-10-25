package dual_aventura_conversacional;

import java.util.ArrayList;

public class zona_mural extends zona {

	public zona_mural(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		// TODO Auto-generated constructor stub
	}

	
	

	public boolean potmoure(cueva_esfinge zona_cueva) {
		return zona_cueva.enigma_resuelto;
	}
	
	
	public void moviment_negat() 
	{System.out.println("No hay donde moverse. Solo hay una pared.");}
	
}
