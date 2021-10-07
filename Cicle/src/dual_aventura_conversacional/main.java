package dual_aventura_conversacional;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	
	
	
	public static void main(String[] args) {
		
	Scanner teclat = new Scanner(System.in);		
		
	// inicialitzar jugador
	jugador player = new jugador("Jugadortest", null, 0);
	//player.printjugador();

	//inicialitzar zones
	int zonaactual=0;
	zona zona_bosque = new zona("Bosque", "zona_bosque", false, "zona_lago", "zona_cueva", "zona_pueblo", "zona_montaña", null) ;
	montaña zona_montaña = new montaña("Base de la montaña", "zona_montaña", false, null, null, "zona_bosque", "zona_cima", null, false, "El guardian", false);
	cima zona_cima = new cima("La cima", "zona_cima", false, null, null, "zona_montaña", null, null, false, false, false, false, 0, 0);
	templo zona_templo = new templo("El templo", "zona_templo", false, null, "zona_pueblo", null, null, null, false);
	pueblo zona_pueblo = new pueblo ("El pueblo", "zona_pueblo", false, "zona_templo", "zona_herrero", null, "zona_bosque", null);
	herrero zona_herrero = new herrero("La herreria", "zona_herrero", false, "zona_pueblo", null, null, null, null, false);
	cueva_esfinge zona_cueva = new cueva_esfinge("la cueva", "zona_cueva", false, "zona_bosque", null, "zona_espejo", "zona_grabado", null, false);
	zona zona_grabado = new zona("zona con grabados", "zona_grabado", false, null, null, "zona_cueva", null, null);
	cueva_espejo zona_espejo = new cueva_espejo("sala con las antorchas", "zona_espejo", false, null, null, null, "zona_cueva", null, false, null);
	lago zona_lago = new lago("el lago", "zona_lago", false, "zona_torre_base", "zona_bosque", null, null, null, false, false, false, false);
	torre_base zona_torre_base = new torre_base("la base de la torre", "zona_torre_base", false, null, "zona_lago", "zona_torre_medio", null, null);
	torre_medio zona_torre_medio = new torre_medio("el medio de la torre", "zona_torre_medio", false, null, null, "zona_torre_cima", "zona_torre_base", null);
	torre_cima zona_torre_cima = new torre_cima("la cuspide de la torre", "zona_torre_cima", false, null, null, null, "zona_torre_medio", null);
	
	zona[] arrayzones = {zona_bosque, zona_montaña, zona_cima, zona_templo, zona_pueblo, zona_herrero, zona_cueva, zona_grabado, zona_espejo, zona_lago, zona_torre_base, zona_torre_medio, zona_torre_cima};
	
	
	
	//bucle principal
	
	boolean jugant = true;
	zonaactual = 0;
	
	
	
	
	while (jugant == true) 
	{
		
		System.out.println("La zona actual es: " + arrayzones[zonaactual].nom);
		
		//arrayzones[zonaactual].introzona();
		//arrayzones[zonaactual].introzona();
		//cambiar a una altre zona
		//arrayzones[zonaactual].introzona();
		//arrayzones[zonaactual].introzona();
		
		//introduir cambi de zona manual.

		System.out.println("Introdueix a on vols anar:");
		System.out.println("Adalt :   1");
		System.out.println("Abaix :   2");
		System.out.println("Dreta :   3");
		System.out.println("Esquerra: 4");
		System.out.println("No s'aceptara altres valors");
		
		int cambi = teclat.nextInt();
		
		
		//System.out.println("cambi actual: " + cambi);
		

		switch (cambi){
		case 1: 
			if(arrayzones[zonaactual].zona_adalt != null) 
			{
				for(int i = 0; i < arrayzones.length; i++){
					if	(arrayzones[zonaactual].zona_adalt == arrayzones[i].id){
						System.out.println("moure a la zona de adalt, que es " + arrayzones[i].id); 
						zonaactual=i ; 
						break;
					}  
				}
			}else System.out.println("No pots anar alla.");
			break; //adalt
		
		case 2: 
			if (arrayzones[zonaactual].zona_abaix != null) 
			{
				for(int i = 0; i < arrayzones.length; i++){
					if(arrayzones[zonaactual].zona_abaix == arrayzones[i].id){
						System.out.println("moure a la zona de abaix, que es " + arrayzones[i].id); 
						zonaactual=i ; 
						break;
					} 
				}
			}else {System.out.println("No pots anar alla.");}
			break; //abaix
		
		case 3: 
			if(arrayzones[zonaactual].zona_dreta != null)
			{
				for(int i = 0; i < arrayzones.length; i++){
					if(arrayzones[zonaactual].zona_dreta == arrayzones[i].id){
						System.out.println("moure a la zona de dreta, que es " + arrayzones[i].id);
						zonaactual=i ;
						break;
					}
				}
			}else {System.out.println("No pots anar alla.");}
			break; //dreta

		case 4: 
			if(arrayzones[zonaactual].zona_esquerra != null){
				for(int i = 0; i < arrayzones.length; i++){
					if	(arrayzones[zonaactual].zona_esquerra == arrayzones[i].id){
						System.out.println("moure a la zona de esquerra, que es " + arrayzones[i].id);
						zonaactual=i ; 
						break;
					} 
				}
			}else {System.out.println("No pots anar alla.");}
			break;//esquerra
		default: jugant= false; break;}
		
		System.out.println();

	}
	
	
	
	
	}





	
	
	
}







