package dual_aventura_conversacional;
import java.util.ArrayList;

public class torre_base extends zona {

	public torre_base(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public boolean potmoure(lago zona_lago) {
		
		
		return zona_lago.serpientes_muertas;

	}
	
	public void moviment_negat() 
	{System.out.println("La entrada a la torre esta sellada");}
}
