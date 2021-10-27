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
	
	
	public void introzona(jugador player) 
	{
		if (entrat == true) {System.out.println("Estas en la sala del mural iluminado con las antorchas.\r\n"
				+ "Las antochas estan encedidas en este orden:\r\n"
				+ "[X][X][  ][X][  ][X][  ]");}
		else {System.out.println("Detras de la pared encuentras una extraña sala escarvada en la cueva de la roca. Lo mas significativo que encuentras es un mural al fondo, iluminado por unas antorchas, algunas de ellas apagadas. El mural representa dos figuras femeninas gemelas entrelazas. El siguente mural contiene las dos figuras, ahora separadas, enfrentandose en una batalla. El ultimo tiene a una de las figuras cayendo por un abismo oscuro, mientras la otra se alza en medio de un dia soleado. Al lado de una de las antorchas ves una suelta en el suelo, aun encendida.\r\n"
				+ "\r\n"
				+ "Las antochas estan encedidas en este orden:\r\n"
				+ "[X][X][  ][X][  ][X][  ]"); entrat = true;
		objecte antorcha = new objecte(5, "Antorcha", true);
		items_terra.add(antorcha);
		}		
	}
		
	public void encender() {System.out.println("Intentas encender una de las antorchas, pero esta se apaga al momento, como si algo impidiese que se encendiesen las antorchas.");}
	
	public void apagar() {System.out.println("Intentas apagar una de las antorchas, pero esta se vuelve a encender al momento. No parece ser posible estinguir este fuego.");}
	
	
	
	
	
}
