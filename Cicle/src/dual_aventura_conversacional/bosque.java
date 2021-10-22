package dual_aventura_conversacional;

import java.util.ArrayList;

public class bosque extends zona {

	public bosque(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		// TODO Auto-generated constructor stub
	}

	

	public void introzona() 
	{
		if (entrat == true) {System.out.println("Estas en el bosque, aun buscando pistas y recursos para rescatar a tu hermana.");}
		else {System.out.println("Estas en medio del bosque, una suave brisa fria sopla en esta mañana. \r\n"
				+ "Los arboles parecen en buen estado, aunque no escuchas a ningun animal hacer ruido. \r\n"
				+ "Parecen estar atemorizados de algo.  \r\n"
				+ "Al norte esta el Lago Plateado, al sur la Caverna Espejada, al este tu pueblo, y al oeste la base de la Montaña del Relampago."); entrat = true;}		
	}
	
	
	public boolean potmoure(lago zona_lago) {
		//cada zona te el seu potmoure propi amb les condicions propies. Aixo es nomes un default por si acaso
		if (zona_lago.risas == true) {return true;}
		else {return false;}	
	}
	
	public void parlar(jugador player) 
	{
	System.out.println("El bosque esta vacio, no hay nadie con quien hablar.");
	}
	
	
	public void moviment_negat() 
	{
			System.out.println("Huir con las serpientes aun observandote no parece buena idea, al menos no mientras aun te esten prestando atencion");
	}
	
	
}
