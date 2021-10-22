package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	
	
	
	public void introzona() 
	{

		if (entrat == true) {
			System.out.println("Estas en la cueva del bosque. El goteo del agua es molesto, pero tolerable.");
		
			if (enigma_resuelto){System.out.println("La estatua no esta haciendo nada, \r\n"
					+ "y hay dos caminos a tu izquierda y derecha, \r\n"
					+ "que se han abierto en la pared.");}
			else {System.out.println("La estatua te observa con sus ojos petreos, esperando una respuesta.");}
		}
		
		
		else {	System.out.println("Bajando por el camino del bosque llegas a la Caverna Espejada, \r\n"
				+ "una cueva cercana al pueblo, en busca de cualquier cosa que pueda ayudarte en tu mision. \r\n"
				+ "Tras bajar por la entrada, llegas a una sala mas o menos rectangular. \r\n"
				+ "Del techo gotea agua, formando charcos en la piedra irregular. \r\n"
				+ "Delante tuya , engastada en la pared hay una estatua muy desgastada, de aproximadamente tu altura. \r\n"
				+ "Cuesta distintguir  que representa exactamente, pero parece algun animal con cabeza de mujer. Esta con los ojos cerrados.\r\n"
				+ "\r\n"
				+ "Segun te acercas, ves como empieza a surgir una voz de la estatua: \r\n"
				+ "- Rojo de la tierra, de hermoso color teñida, tras mis mil agujas me hallaras escondida. Que soy? - Dice en tono monótono.  \r\n");
		entrat = true;}		
	}
	
	
	
	public void parlar(jugador player) 
	{
	Scanner teclat = new Scanner(System.in);			
	if (enigma_resuelto==false) 
	{
		
		int opcio=0;
		
		System.out.println("La estatua ha hablado de alguna forma, asi que te planteas hablarle de vuelta. Que quieres decirle?");
		System.out.println("0.  Eh? Que estas diciendo?");
		System.out.println("1. (responder a su acertijo)");
		
		opcio= teclat.nextInt();
		teclat.nextLine();
		
		switch (opcio) {
		case 0: System.out.println("- Rojo de la tierra, de hermoso color teñida, tras mis mil agujas me hallaras escondida. Que soy? - Repite en tono monótono.");break;
		case 1: 
			//la respuesta es "rosa"
			System.out.println("Introduce la respuesta que quieres darle a la estatua.");
			
			String respuesta;
			respuesta = teclat.nextLine();	
			
			//posar respuesta a tot minuscules
			respuesta = respuesta.toLowerCase();
			
			//comprovar si "respuesta" conte "rosa"
			boolean rosa = respuesta.contains("rosa");
		
			
			if (rosa==true) {//correcte
				System.out.println("- Eres una rosa – Le dices. - Tu respuesta… es correcta. - Dice la estatua. \r\n"
					+ "Notas como algo se mueve en las paredes, y a tu izquierda y derecha se abren unas camaras ocultas.");
					enigma_resuelto=true;}
			
			else {//incorrecte
			System.out.println("No hay respuesta de la estatua... tu respuesta parece equivocada.");
			}
			break;
			
		default: break;
		}
	}else {System.out.println("La estatua no parece hablar mas. Hablar ahora parece una perdida de tiempo. ");}	
		
		
		
		
		
		
	}
	
	
	
}
