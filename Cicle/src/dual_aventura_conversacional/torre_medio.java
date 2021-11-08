package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Scanner;

public class torre_medio extends zona {


	boolean demonimort;
	
	public torre_medio(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean demonimort) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.demonimort = demonimort;
	}
	public boolean isDemonimort() {
		return demonimort;
	}
	public void setDemonimort(boolean demonimort) {
		this.demonimort = demonimort;
	}


	
	
	
	public void introzona(jugador player) 
	{
		if (entrat == true) {
			
			System.out.print("Subes al segundo piso de la torre.");
			
			if (demonimort==true) {System.out.println("La puerta esta abierta, y lo unico que queda de Oni es un charco de materia oscura en el suelo.");}
			else {System.out.println("La oscuridad de Oni sigue envolviendo la sala, cortandote el paso.");}
		}
		
		
		
		else {System.out.println("Subiendo por las escaleras llegas a otra camara circular, como la primera. \r\n"
				+ "Los grabados son identicos a los de la primera camara, pero el trazo y los colores son mucho mas burdos, como si el orfebre los hubiera hecho en un arrebato de locura.\r\n"
				+ "No hay nadie aparte de ti, pero aun asi, te sientes observado. Impulsado por tu instinto, te das la vuelta y ves como tu sombra no se mueve contigo. \r\n"
				+ "-Vaya vaya, parece ser que has aprendido algo desde la ultima vez. - Dice una voz que hace eco. \r\n"
				+ "Ves como tu sombra se separa de tu cuerpo, y esta empieza a salir del suelo, tomando forma fisica. Primero de aspecto humano, rapidamente crece de tamaño y proporciones, \r\n"
				+ "con un cuerno saliendo de su frente. Al verlo, recuerdas esa figura, estuvo presente en la noche del secuestro de tu hermana! \r\n"
				+ "- Tu! - Le gritas enfadado. - Devuelveme a mi hermana!. \r\n"
				+ "- Me temo que no, chaval,  eso arruinaria nuestros planes. Asi que ahora vete de la torre, vale? Ah, y mi nombre es Oni, ahorrate preguntarmelo. \r\n"
				+ "Te respone el demonio Oni con calma.\r\n"
				+ ""); entrat = true;}		
	}
	public boolean potmoure(torre_base zona_torre_base) {
		if(zona_torre_base.puzleresolt==true) {return true;}
		else {return false;}
		}
	public void moviment_negat() 
	{
	
		System.out.println("La puerta esta sellada. Necesitas abrirla para poder subir.");
		
	}
	
	public void parlar(jugador player){
		
		
		if(demonimort==true) {System.out.println("No hay nadie con quien hablar...");}
		else {
			
			Scanner teclat = new Scanner(System.in);		

			System.out.println("Enfadado, decides hablar con Oni. Que quieres decirle?");
			System.out.println("0. Porque os habeis llevado a mi hermana?!");
			System.out.println("1. Dejame pasar!");
		
			
			try {

				int opcio = teclat.nextInt();
				switch (opcio){
				case 0: System.out.println("- Eso no te incumbe, chaval. - Te dice Oni. - Pero lo que nos interesa no es tu hermana, si no lo que hay dentro suya. No es nada personal… \r\n"
						+ "- No puedes evitar enfadarte al escuchar las respuestas de Oni.");break;
				
				
				
				case 1: System.out.println("Me temo que no puedo hacer eso. Hazte un favor y vuelve a tu casa, quieres? - Te responde Oni. Su respuesta te enfada. Esta claro que tendras que pasar a la fuerza.");
					
				
					break;
				default: System.out.println("Eso no es algo que puedas decir!"); break;
				}
			} catch (Exception e) {
				System.out.println("Eso no es algo que puedas decir!");
			}
			
			
			
		}
		
		
	
	
	
	}
	

	
	
	
	
	public int subir(int zonaactual) {

		if (demonimort == true) {System.out.println("Subes a la cima.");return 12;}
		else {System.out.println("La oscuridad de Oni te bloquea el paso."); return zonaactual;}
			
	
	
	}
	public int bajar(int zonaactual) {
	
	System.out.println("Bajas al primer piso");return 10;
	
	
	
	
	}
	public void atacar(jugador player) {
		
		if (demonimort==true){		System.out.println("No hay nada que atacar aqui.");
}
		else {System.out.println("Atacas a Oni como puedes, pero tus ataques se limitan a atravesarlo sin hacerle nada.");}
		
	
	}
	public void usaritem(jugador player, int seleccio) 
	{
	
		int item = player.inventari.get(seleccio).id;

		switch (item)
		{
		case 1: 
			
			if(demonimort==true) {System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");}
			else {System.out.println("Desenfundas tu espada, intentando cortar a Oni con ella, pero tu ataque lo atraviesa sin hacerle nada. Oni se limita a suspirar decepcionado. \r\n"
					+ "- Estoy hecho de sombras, chaval, ninguna espada puede herirme.");}
			break;	
			
		case 4: 			
			if(demonimort==true) {System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");}
			else {System.out.println("Desenfundando la Murakumo, asestas varios cortes, dañando parte de la camara en el proceso. \r\n"
					+ "- Ah, la espada de Susanoo, una arma magistral… contra aquellos que pueden ser cortados.  Guardate el sudor, deja la torre.");}
			break;	
			
		case 6: 
			if(demonimort==true) {System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");}
			else {System.out.println("Destapas la botella de agua sagrada, y rocias a Oni con ella. Al entrar en contacto con ella, Oni hace un aullido de dolor, y ves como empieza a derretirse. \r\n"
					+ "-Tu…! Como… te atreves…! Mi señora… ella me vengara! Sufriras toda la eternidad en una tiniebla eterna…!\r\n"
					+ "Te grita Oni enfadao mientras se derrite y es reducido a apenas una mancha negra en el suelo. Con su muerte, la oscuridad se disipa, dejandote paso a las escaleras que suben."); demonimort= true;}
			break;	
			
		default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;}
	
	
	
	
	
	
	}	
	
	
	
	
	
}
