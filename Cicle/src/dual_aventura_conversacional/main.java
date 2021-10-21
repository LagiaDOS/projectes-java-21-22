package dual_aventura_conversacional;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	
	
	
	public static void main(String[] args) {
		
	Scanner teclat = new Scanner(System.in);		
		
	ArrayList<objecte> inventari = new ArrayList<objecte>();
	
	// inicialitzar jugador
	jugador player = new jugador("Jugadortest", inventari , 0);
	objecte espada = new objecte(1, "espasa", true);
	player.inventari.add(espada);
	//player.printjugador();
	
	//inicialitzar zones
	int zonaactual=0;
	bosque zona_bosque = new bosque("Bosque", "zona_bosque", false, "zona_lago", "zona_cueva", "zona_pueblo", "zona_montaña", inventari) ;
	montaña zona_montaña = new montaña("Base de la montaña", "zona_montaña", false, null, null, "zona_bosque", "zona_cima", inventari, false, "El guardian", false);
	cima zona_cima = new cima("La cima", "zona_cima", false, null, null, "zona_montaña", null, inventari, false, false, false, false, 0, 0);
	templo zona_templo = new templo("El templo", "zona_templo", false, null, "zona_pueblo", null, null, inventari, false);
	pueblo zona_pueblo = new pueblo ("El pueblo", "zona_pueblo", false, "zona_templo", "zona_herrero", null, "zona_bosque", inventari);
	herrero zona_herrero = new herrero("La herreria", "zona_herrero", false, "zona_pueblo", null, null, null, inventari, false);
	cueva_esfinge zona_cueva = new cueva_esfinge("la cueva", "zona_cueva", false, "zona_bosque", null, "zona_espejo", "zona_grabado", inventari, false);
	zona zona_grabado = new zona("zona con grabados", "zona_grabado", false, null, null, "zona_cueva", null, inventari);
	cueva_espejo zona_espejo = new cueva_espejo("sala con las antorchas", "zona_espejo", false, null, null, null, "zona_cueva", inventari, false, null);
	lago zona_lago = new lago("el lago", "zona_lago", false, "zona_torre_base", "zona_bosque", null, null, inventari, false, false, true, false);
	torre_base zona_torre_base = new torre_base("la base de la torre", "zona_torre_base", false, null, "zona_lago", "zona_torre_medio", null, inventari);
	torre_medio zona_torre_medio = new torre_medio("el medio de la torre", "zona_torre_medio", false, null, null, "zona_torre_cima", "zona_torre_base", inventari);
	torre_cima zona_torre_cima = new torre_cima("la cuspide de la torre", "zona_torre_cima", false, null, null, null, "zona_torre_medio", inventari);
	
	zona[] arrayzones = {zona_bosque, zona_montaña, zona_cima, zona_templo, zona_pueblo, zona_herrero, zona_cueva, zona_grabado, zona_espejo, zona_lago, zona_torre_base, zona_torre_medio, zona_torre_cima};
	
	
	
	
	//bucle principal
	
	boolean jugant = true;
	zonaactual = 0;
		
	//System.out.println("TEST DEL SWITCH");
	int z = 0;
	//System.out.println(check_pasar(z, arrayzones));
	
	
	while (jugant == true) 
	{
		
		//System.out.println("La zona actual es: " + arrayzones[zonaactual].nom);
		//arrayzones[zonaactual].introzona();
		//arrayzones[zonaactual].introzona();
		//arrayzones[zonaactual].introzona();
		//cambiar a una altre zona
		//arrayzones[zonaactual].introzona();
		//arrayzones[zonaactual].introzona();
		
		System.out.println("Que vols fer?");
		System.out.println("1: Parlar.");
		System.out.println("2: Moure");
		System.out.println("3. Agafar o deixar objectes.");
		
		int comanda;
		
		comanda = teclat.nextInt();	
		
		switch (comanda){
		
		//parlar
		case 1: break;
		
		
		
		// agafar/deixar items
		case 3:

			System.out.println("Que vols fer?");
			System.out.println("1. Deixar un objecte.");
			System.out.println("2. Agafar un objecte.");
			
			int tiraragafar = teclat.nextInt();
			
			switch (tiraragafar) {
			case 1: //tirar
			if (player.inventari==null) {System.out.println("No tens res per deixar!");}
			if (player.inventari!=null) {System.out.println("Que vols deixar?");
			for (int i = 0; i < player.inventari.size(); i++) {System.out.println(i +". " + player.inventari.get(i).nom);}

			int objectetirar;
			objectetirar = teclat.nextInt();
			arrayzones[zonaactual].items_terra.add(player.inventari.get(objectetirar));
			System.out.println("Has deixat el/la " + player.inventari.get(objectetirar).nom + " al terra.");
			player.inventari.remove(objectetirar);
			}
			
			break;
			
			
		case 2: 
			//agafar
			
			if (arrayzones[zonaactual].items_terra==null) {System.out.println("No hi ha res per agafar!");}
						
			if (arrayzones[zonaactual].items_terra !=null) {System.out.println("Que vols agafar?");
			for (int i = 0; i < arrayzones[zonaactual].items_terra.size(); i++) {System.out.println(i +". " + arrayzones[zonaactual].items_terra.get(i).nom);}
			int objecteagafar;
			objecteagafar = teclat.nextInt();
			player.inventari.add(arrayzones[zonaactual].items_terra.get(objecteagafar));
			System.out.println("Has agafat el/la " + arrayzones[zonaactual].items_terra.get(objecteagafar).nom + ".");
			arrayzones[zonaactual].items_terra.remove(objecteagafar);
			}
		
			break;
		default: System.out.println("Opcio no valida introduida. Abortant.");break;
			}	
				
				
				
			
				
			
			
			
			
			//jugant = false;	
			break;
		
		
		//sistema de moviment
		//introduir cambi de zona manual.

		case 2: 
				
		
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
				if(arrayzones[zonaactual].zona_adalt != null ) 
				{
					for(int i = 0; i < arrayzones.length; i++){
						if	(arrayzones[zonaactual].zona_adalt == arrayzones[i].id){
							if (check_pasar(i, arrayzones)==true) {
								System.out.println("moure a la zona de adalt, que es " + arrayzones[i].id); 
								zonaactual=i ; 
								break;
							}else {arrayzones[i].moviment_negat();}
						} 
						
					}
				}else System.out.println("No pots anar alla.");
				break; //adalt
			
			case 2: 
				if (arrayzones[zonaactual].zona_abaix != null) 
				{
					for(int i = 0; i < arrayzones.length; i++){
						if(arrayzones[zonaactual].zona_abaix == arrayzones[i].id){
							if (arrayzones[i].potmoure()==true) {
								System.out.println("moure a la zona de abaix, que es " + arrayzones[i].id); 
								zonaactual=i ; 
								break;
							}else {arrayzones[i].moviment_negat();}
						} 				}
				}else {System.out.println("No pots anar alla.");}
				break; //abaix
			
			case 3: 
				if(arrayzones[zonaactual].zona_dreta != null)
				{
					for(int i = 0; i < arrayzones.length; i++){
						if(arrayzones[zonaactual].zona_dreta == arrayzones[i].id){
							if (arrayzones[i].potmoure()==true) {
								System.out.println("moure a la zona de dreta, que es " + arrayzones[i].id);
								zonaactual=i ;
								break;
							}else {arrayzones[i].moviment_negat();}
						}
					}
				}else {System.out.println("No pots anar alla.");}
				break; //dreta
	
			case 4: 
				if(arrayzones[zonaactual].zona_esquerra != null){
					for(int i = 0; i < arrayzones.length; i++){
						if	(arrayzones[zonaactual].zona_esquerra == arrayzones[i].id){
							if (arrayzones[i].potmoure()==true) {
								System.out.println("moure a la zona de esquerra, que es " + arrayzones[i].id);
								zonaactual=i ; 
								break;
							}else {arrayzones[i].moviment_negat();}
						} 
					}
				}else {System.out.println("No pots anar alla."); arrayzones[zonaactual].moviment_negat();}
				break;//esquerra
			default: jugant= false; break;}
		
		System.out.println(arrayzones[zonaactual].potmoure());
		System.out.println();

		}
		
		
	
	
	
	}
	
	
}





public static boolean check_pasar(int z, zona[] arrayzones) {
	
//	zona_bosque, 	0, condicional
//	zona_montaña, 	1, condicional
//	zona_cima, 		2, condicional
//	zona_templo,	3, true
//	zona_pueblo, 	4, true
//	zona_herrero, 	5, true
//	zona_cueva,		6, true
//	zona_grabado, 	7, condicional
//	zona_espejo, 	8, condicional
//	zona_lago, 		9, true
//	zona_torre_base,	10, condicional
//	zona_torre_medio, 	11, condicional
//	zona_torre_cima;	12, condicional
// default	(true)
	
	bosque zona_bosque = (bosque) arrayzones[0]; 
	montaña zona_montaña = (montaña) arrayzones[1]; 
	cima zona_cima = (cima) arrayzones[2]; 
	templo zona_templo = (templo) arrayzones[3]; 
	pueblo zona_pueblo = (pueblo) arrayzones[4]; 
	herrero zona_herrero = (herrero) arrayzones[5]; 
	cueva_esfinge zona_cueva_esfinge = (cueva_esfinge) arrayzones[6]; 
	zona zona_grabado = arrayzones[7]; 
	cueva_espejo zona_espejo = (cueva_espejo) arrayzones[8]; 
	lago zona_lago = (lago) arrayzones[9];
	torre_base zona_torre_base = (torre_base) arrayzones[10]; 
	torre_medio zona_torre_medio = (torre_medio) arrayzones[11]; 
	torre_cima zona_torre_cima = (torre_cima) arrayzones[12]; 

	switch (z) {
	case 0:	return zona_bosque.potmoure(zona_lago);
	case 1: return zona_montaña.potmoure(zona_cima);
	case 2: return zona_cima.potmoure(zona_montaña);
	case 3: return true;
	case 4: return true;
	case 5: return true;
	case 6: return true;
	case 7: return zona_espejo.potmoure(zona_cueva_esfinge);
	
	case 8: break;
	
	case 9: return true;
	case 10: return zona_torre_base.potmoure(zona_lago);
	
	case 11: break;
	case 12: break;
	
	default: return false;
	}
	
	
	System.out.println("no hauries de estar aqui");
	return false;
	
}



}







