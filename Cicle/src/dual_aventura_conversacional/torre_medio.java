package dual_aventura_conversacional;

import java.util.ArrayList;

public class torre_medio extends zona {

	public torre_medio(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		// TODO Auto-generated constructor stub
	}

	

	public void introzona(jugador player) 
	{
		if (entrat == true) {System.out.println("Has entrat a " + nom + " Segona visita");}
		else {System.out.println("Has entrat a " + nom + " Primera visita"); entrat = true;}		
	}
	
	
	public boolean potmoure() {
		//cada zona te el seu potmoure propi amb les condicions propies. Aixo es nomes un default por si acaso
		return true;
	}
	
	public void moviment_negat() 
	{
	
		
	}
	
	public void parlar(jugador player){System.out.println("No hay nadie con quien hablar...");}
	
	public void atacar(jugador player) {System.out.println("No hay nada que atacar aqui.");}
	
	public void defender() {System.out.println("No hay necesidad de defenderse.");}
	
	public int subir(int zonaactual) {System.out.println("No hay nada donde subir."); return zonaactual;}
	
	public int bajar(int zonaactual) {System.out.println("No hay nada donde bajar."); return zonaactual;}
	
	public void encender() {System.out.println("No hay nada que encender.");}
	
	public void apagar() {System.out.println("No hay nada donde apagar.");}
	
	public void usaritem(jugador player, int seleccio) 
	{
		switch (seleccio)
		{default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;}
	}	
	
	
	
	
	
}
