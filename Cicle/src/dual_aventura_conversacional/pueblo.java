package dual_aventura_conversacional;

import java.util.ArrayList;

public class pueblo extends zona {

	public pueblo(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		// TODO Auto-generated constructor stub
	}

	
	public void introzona(jugador player) 
	{
		if (entrat == true) {System.out.println("Llegas a la plaza de tu pueblo. La gente sigue trabajando para reparar todo, el herrero sigue forjando, y el templo sigue intacto.");}
		else {System.out.println("Sigues el sendero del bosque volviendo hasta tu pueblo. Gran parte del pueblo fue destruido en el ataque reciente, y ves a varios de tus vecinos reparando sus casas y las calles. Los muros estan rotos, y no parece ser la prioridad repararlos, defendiendoos hay  varios guardias y milicianos, con armas que parecen recien forjadas, aunque dudas si siquiera servirian contra los demonios que atacaron. Por algun motivo, el templo esta intacto, y no sufrio un rasguño en el asalto. Escuchas el matrilleante sonido de la forja del herrero, el cual esta trabajando incesantemente por armar a todos."); entrat = true;}		
	}
	
	public void parlar(jugador player)
	{
	System.out.println("Intentas hablar con la gente, pero todo el mundo parece demasiado ocupado como para hacerlo. Los pocos que te dirigen palabra te consuelan por el rapto de tu hermana, y te aconsejan que vuelvas a tu casa y no te involucres con los demonios.");	
		
	}
	
	public void atacar(jugador player) {System.out.println("Atacar a tus vecinos te parece una idea estupida y deleznable");}
		
	public int subir(int zonaactual) {System.out.println("Subirse a los tejados no te parece buena idea."); return zonaactual;}

	public void encender() {System.out.println("Quemar tu pueblo te parece mas propio de los demonios que de una persona como tu.");}
	

	
	
	
	
	
}
