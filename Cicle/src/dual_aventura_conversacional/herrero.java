package dual_aventura_conversacional;
import java.util.ArrayList;
import java.util.Scanner;

public class herrero extends zona {

	
	boolean espada;
	
	
	public herrero(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean espada) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.espada = espada;
	}
	public boolean isEspada() {
		return espada;
	}
	public void setEspada(boolean espada) {
		this.espada = espada;
	}


	public void encender() {System.out.println("El fuego de la forja ya esta encendido");}
	public void apagar() {System.out.println("Por un momento piensas en apagar la forja, pero el pensamiento de un martillazo del herrero te hace retractarte.");}
		
	public void introzona(jugador player) 
	{
		if (entrat == true) {System.out.println("Bajando por el camino llegas al herrero, que sigue forjando. Esta aun ocupado, y te dice que seas rapido.");}
		
		else {System.out.println("Bajando por el camino  llegas al Herrero. Segun entras a la herreria, ves varias lanzas y espadas apiladas en una pared, junto con armaduras rudimentarias de hierro. \r\n"
				+ "Ves al Herrero forjando otra espada. Por su aspecto, debe haber estado todos los dias desde el ataque forjando, una capa de ollin y restos de metal le ensucian tanto la ropa como la piel, \r\n "
				+ "y no parece haberse limpiado desde entonces. Al verte, el dice “Hm? Ah, el chaval que le raptaron la hermana. Ando muy ocupado, si quieres algo, se rapido. - Te dice de forma contundente."); entrat = true;}		
	}
		
	public void usaritem(jugador player, int seleccio) 
	{
		int item = player.inventari.get(seleccio).id;

		switch (item)
		{
		case 1: 
			System.out.println("- Si, es la espada que te di. Tu punto cual es? - Te responde el Herrero molesto." );
			
			break;
		case 4: 			
			System.out.println("- Que diablos?! Donde has conseguido eso?! No… mejor no me lo digas. Temo el saberlo siquiera. Solo… solo no saques mas esto aquí, de acuerdo? - Dice el herrero claramente atemorizado");
			break;
		default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;}
	}
	
	
	
	public void parlar(jugador player)
	{
		Scanner teclat = new Scanner(System.in);		

		System.out.println("Decides hablar el Herrero. Que quieres?");
		System.out.println("0. - Podrias ser mas educado?");
		System.out.println("1. - Quiero rescatar a mi hermana.  Podrias darme algo con lo que defenderme?");
	
		
		try {

			int opcio = teclat.nextInt();
			switch (opcio){
			case 0: System.out.println("Chaval, llevo  dias trabajando sin cesar con tal de armar a todo el mundo. Todo segundo que no estoy trabajando es una persona menos a la que no armo. \r\n"
					+ "Y cuando esos demonios vuelvan, agradeceras hasta la ultima lanza. Y ahora, que es lo que quieres?");break;
			
			case 1: 
				
				if(espada==false) {
				System.out.println("- Huh? Acaso te crees que voy a dejar que te lleves algo en tu mision inutil? Por mucho que me enorgullezca de mi trabajo no haran ni cosquillas a esas serpientes del lago.\r\n"
						+ "- Me da igual, si no lo intento no lo conseguire. - Le respondes\r\n"
						+ "-Hmpr… no vas a irte, verdad? Esta bien, llevate UNA sola espada, y nada mas. Y no molestes mas! - El herrero deja una espada en una mesa, lista para que la cojas tu.");
				espada=true;
				objecte espada = new objecte(1, "Espada", true);
				items_terra.add(espada);
				}
				else {System.out.println("- Huh? Ya te he dado una espada.");}

				break;
			default: System.out.println("Eso no es algo que puedas decir!"); break;
			}
		} catch (Exception e) {
			System.out.println("Eso no es algo que puedas decir!");
		}
		
		
		
		
		
		
		
		
		
		
	}
	
}

