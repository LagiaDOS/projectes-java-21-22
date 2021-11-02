package dual_aventura_conversacional;
import java.util.ArrayList;
import java.util.Scanner;



public class main {

	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);		

	
	int zonaactual=0;
	
	// Demanar el nom del jugador
	System.out.println("Cual es tu nombre?");
	String nom ;
	nom= teclat.nextLine();	
	
	
	// Posar la intro
	System.out.println("Recuerdas la fatidica noche de hace 1 semana con mucha claridad. \r\n"
			+ "Estabas con tu hermana, comiendo tranquilamente, cuando una explosion derribo vuestra casa. \r\n"
			+ "De entre los escombros solo pudiste ver como un demonio marcado con la luna se la llevaba inconsciente. \r\n"
			+ "Cuando conseguistes salir de los escombros y los seguiste hacia el lago, solo pudiste ver como el demonio ando por encima del agua hacia una torre que se alzaba en medio de este. \r\n"
			+ "Cuando te sumergiste, herido, en el lago para seguirlo, solo pudiste ver paralizado como tres titanicas serpientes blancas surgieron de las aguas.  \r\n"
			+ "Con el corazon congelado de mierdo, huiste del lago corriendo, mientras las serpientes se mofaban de ti llamandote “Patetico mortal!”.\r\n"
			+ "\r\n"
			+ "Has estado una semana recuperadote de tus heridas, y estas preparado para ir a rescatar a tu hermana. \r\n"
			+ "Pero las serpientes estan en medio de la torre, y aun has de encontrar una forma de derrotarlas…");
	
	
	//Inicialitzar items: espasa, mirall, magatama, espada legendaria
	objecte espada = new objecte(1, "Espada", true);
	objecte espejo = new objecte(2, "Espejo Encantado", true);
	objecte magatama = new objecte(3, "Magatama Sagrada", true);
	objecte murakumo = new objecte(4, "Ame-no-Murakumo", true);
	objecte antorcha = new objecte(5, "Antorcha", true);
	objecte aguasagrada = new objecte(6, "Agua Sagrada", true);

		
	
	// inicialitzar jugador
	ArrayList<objecte> inventari = new ArrayList<objecte>();
	jugador player = new jugador(nom, inventari , 0);
	//player.printjugador();
	
	
	player.inventari.add(espada);
	player.inventari.add(murakumo);

	
	//inicialitzar zones
	ArrayList<objecte> inventaribosque = new ArrayList<objecte>();
	bosque zona_bosque = new bosque("el Bosque.", "zona_bosque", false, "zona_lago", "zona_cueva", "zona_pueblo", "zona_montaña", inventaribosque);
	
	ArrayList<objecte> inventarimontaña = new ArrayList<objecte>();
	montaña zona_montaña = new montaña(" la Base de la montaña.", "zona_montaña", false, null, null, "zona_bosque", "zona_cima", inventarimontaña, false, "El guardian", false);	
	
	ArrayList<objecte> inventaricima = new ArrayList<objecte>();
	cima zona_cima = new cima("en la cima de la montaña.", "zona_cima", false, null, null, "zona_montaña", null, inventaricima, false, false, false, false, 0, 0);
	
	ArrayList<objecte> inventaritemplo = new ArrayList<objecte>();
	templo zona_templo = new templo("el templo de tu pueblo.", "zona_templo", false, null, "zona_pueblo", null, null, inventaritemplo, false);
	
	ArrayList<objecte> inventaripueblo = new ArrayList<objecte>();
	pueblo zona_pueblo = new pueblo ("tu pueblo.", "zona_pueblo", false, "zona_templo", "zona_herrero", null, "zona_bosque", inventaripueblo);
	
	ArrayList<objecte> inventariherrero = new ArrayList<objecte>();
	herrero zona_herrero = new herrero("la herreria de tu pueblo.", "zona_herrero", false, "zona_pueblo", null, null, null, inventariherrero, false);
	
	ArrayList<objecte> inventariesfinge = new ArrayList<objecte>();
	cueva_esfinge zona_cueva = new cueva_esfinge("la cueva del bosque.", "zona_cueva", false, "zona_bosque", null, "zona_espejo", "zona_grabado", inventariesfinge, false);
	
	ArrayList<objecte> inventaribosquemural = new ArrayList<objecte>();
	zona_mural zona_grabado = new zona_mural("una zona con grabados.", "zona_grabado", false, null, null, "zona_cueva", null, inventaribosquemural);
	
	ArrayList<objecte> inventariespejo = new ArrayList<objecte>();
	Boolean[] arrayantorchas = {false, false, false, false, false, false, false};
	cueva_espejo zona_espejo = new cueva_espejo("una sala con antorchas.", "zona_espejo", false, null, null, null, "zona_cueva", inventariespejo, false, arrayantorchas);
	
	ArrayList<objecte> inventarilago = new ArrayList<objecte>();
	lago zona_lago = new lago("el lago.", "zona_lago", false, "zona_torre_base", "zona_bosque", null, null, inventarilago, false, false, false, false, false);
	
	ArrayList<objecte> inventaribase = new ArrayList<objecte>();
	torre_base zona_torre_base = new torre_base("la base de la Torre.", "zona_torre_base", false, null, "zona_lago", "zona_torre_medio", null, inventaribase);
	
	ArrayList<objecte> inventarimedio = new ArrayList<objecte>();
	torre_medio zona_torre_medio = new torre_medio("el medio de la Torre.", "zona_torre_medio", false, null, null, "zona_torre_cima", "zona_torre_base", inventarimedio);
	
	ArrayList<objecte> inventaricuspide = new ArrayList<objecte>();
	torre_cima zona_torre_cima = new torre_cima("la cuspide de la Torre.", "zona_torre_cima", false, null, null, null, "zona_torre_medio", inventaricuspide);
	
	zona[] arrayzones = {zona_bosque, zona_montaña, zona_cima, zona_templo, zona_pueblo, zona_herrero, zona_cueva, zona_grabado, zona_espejo, zona_lago, zona_torre_base, zona_torre_medio, zona_torre_cima};
	
	
	//comandes
	//moure, parlar, agafar, deixar, atacar, defensar, pujar, baixar, encendre
	

	
	//bucle principal
	
	boolean jugant = true;
	zonaactual = 0;
		

	
	while (jugant == true) 
	{
		
		System.out.println();
		System.out.println("=================================");
		
		System.out.println("Te encuentras en " + arrayzones[zonaactual].nom);
		
		arrayzones[zonaactual].introzona(player);
		
		System.out.println("Que quieres hacer?");
		String comanda = "";
		comanda = teclat.nextLine();
		comanda = comanda.toLowerCase();
		
		switch (comanda) {
		case "mover": 
		
		System.out.println("En que direccion quieres ir?");
		String cambi = teclat.nextLine();

			switch (cambi){
			case "arriba": 
				if(arrayzones[zonaactual].zona_adalt != null ) 
				{
					for(int i = 0; i < arrayzones.length; i++){
						if	(arrayzones[zonaactual].zona_adalt == arrayzones[i].id){
							if (check_pasar(i, arrayzones, zonaactual)) {
								if(i==9) {zona_lago.moures=true;}
								System.out.println("Te has movido a " + arrayzones[i].nom); 
								zonaactual=i ; 
								break;
							}else {arrayzones[i].moviment_negat();}
						} 
						
					}
				}else {System.out.println("No puedes ir en esa direccion"); arrayzones[zonaactual].moviment_negat();}
				break; //adalt
			
			case "abajo": 
				if (arrayzones[zonaactual].zona_abaix != null) 
				{
					for(int i = 0; i < arrayzones.length; i++){
						if(arrayzones[zonaactual].zona_abaix == arrayzones[i].id){
							if (check_pasar(i, arrayzones, zonaactual)) {
								System.out.println("Te has movido a " + arrayzones[i].nom); 
								zonaactual=i ; 
								break;
							}else {arrayzones[i].moviment_negat();}
						} 				}
				}else {System.out.println("No puedes ir en esa direccion"); arrayzones[zonaactual].moviment_negat();}
				break; //abaix
			
			case "derecha": 
				if(arrayzones[zonaactual].zona_dreta != null)
				{
					for(int i = 0; i < arrayzones.length; i++){
						if(arrayzones[zonaactual].zona_dreta == arrayzones[i].id){
							if (check_pasar(i, arrayzones, zonaactual)) {
								System.out.println("Te has movido a " + arrayzones[i].nom);
								zonaactual=i ;
								break;
							}else {arrayzones[i].moviment_negat();}
						}
					}
				}else {System.out.println("No puedes ir en esa direccion"); arrayzones[zonaactual].moviment_negat();}
				break; //dreta

			case "izquierda": 
				if(arrayzones[zonaactual].zona_esquerra != null){
					for(int i = 0; i < arrayzones.length; i++){
						if	(arrayzones[zonaactual].zona_esquerra == arrayzones[i].id){
							if (check_pasar(i, arrayzones, zonaactual)) {
								System.out.println("Te has movido a " + arrayzones[i].nom);
								zonaactual=i ; 
								break;
							}else {arrayzones[i].moviment_negat();}
						} 
					}
				}else {System.out.println("No puedes ir en esa direccion"); arrayzones[zonaactual].moviment_negat();}
				break;//esquerra
			default: break;}
		System.out.println();
		break;
		
		
		
		case "hablar": 
			arrayzones[zonaactual].parlar(player); 
			break;
			
			
			
			
		case "coger": 
			if (arrayzones[zonaactual].items_terra.isEmpty()) {System.out.println("No hay nada que recoger!");}
			
			if (arrayzones[zonaactual].items_terra.isEmpty()==false) {System.out.println("Que quieres coger?");
			for (int i = 0; i < arrayzones[zonaactual].items_terra.size(); i++) {System.out.println(i +". " + arrayzones[zonaactual].items_terra.get(i).nom);}
			
			try {
				int objecteagafar;
				objecteagafar = teclat.nextInt();
				player.inventari.add(arrayzones[zonaactual].items_terra.get(objecteagafar));
				System.out.println("Cogiste el/la" + arrayzones[zonaactual].items_terra.get(objecteagafar).nom + "."); //tu lo tomaste cuerda
				arrayzones[zonaactual].items_terra.remove(objecteagafar);
			} catch (Exception e) {
				System.out.println("Introduce un numero de un objeto correcto");

			}
			
			
			
			
			}
			break;
			
			
			
		case "dejar": 		
			
			if (player.inventari.isEmpty()) {System.out.println("No tienes nada para dejar!");}
			
			if (player.inventari.isEmpty()==false) {System.out.println("Que quieres dejar?");
			for (int i = 0; i < player.inventari.size(); i++) {System.out.println(i +". " + player.inventari.get(i).nom);}

			try {
				int objectetirar;
				objectetirar = teclat.nextInt();
				arrayzones[zonaactual].items_terra.add(player.inventari.get(objectetirar));
				System.out.println("Dejaste el/la " + player.inventari.get(objectetirar).nom + " en el suelo.");
				player.inventari.remove(objectetirar);
			} catch (Exception e) {
				System.out.println("Introduce un numero de un objeto correcto");

			}
			
		
			}break;
			
			
			
			
		case "atacar": 
		arrayzones[zonaactual].atacar(player);
		break;
		
		
		case "defender": 
		arrayzones[zonaactual].defender();
		break;
		
		
		case "subir": 
		zonaactual = arrayzones[zonaactual].subir(zonaactual);			
		break;
		
		
		case "bajar": 
		zonaactual = arrayzones[zonaactual].bajar(zonaactual);	
		break;
		
		
		case "encender": 
		arrayzones[zonaactual].encender();		
		break;
		
		
		case "apagar":
		arrayzones[zonaactual].apagar();		
		break;
		
		case "usar":
			Scanner teclat2 = new Scanner(System.in);		
			if (player.inventari.isEmpty()) {System.out.println("No tienes nada que usar!");}
			if (player.inventari.isEmpty()==false)	{
			System.out.println("Que objeto quieres usar?");
			for (int i = 0; i < player.inventari.size(); i++) {System.out.println(i +". " + player.inventari.get(i).nom);}
			int seleccio = 1;

			
			try {
				seleccio = teclat2.nextInt();
				arrayzones[zonaactual].usaritem(player, seleccio);
			} catch (Exception e) {
				System.out.println("Introduce un numero de objeto correcto");
			}
			
			
			
			
			}
		break;
		
		
		
		
		default: System.out.println("Introduce una opcion valida");break;
		}
		
		
		
		
		

		
	

		}
		
		
	
	
	
	}
	
	






@SuppressWarnings("unused")
public static boolean check_pasar(int z, zona[] arrayzones, int zonaactual) {
	
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
	zona_mural zona_grabado = (zona_mural) arrayzones[7]; 
	cueva_espejo zona_espejo = (cueva_espejo) arrayzones[8]; 
	lago zona_lago = (lago) arrayzones[9];
	torre_base zona_torre_base = (torre_base) arrayzones[10]; 
	torre_medio zona_torre_medio = (torre_medio) arrayzones[11]; 
	torre_cima zona_torre_cima = (torre_cima) arrayzones[12]; 

	switch (z) {
	case 0:	if(zonaactual==9){return zona_bosque.potmoure(zona_lago);} 
			if(zonaactual!=9){return true;} break;
			
	case 1: return zona_montaña.potmoure(zona_cima);
	case 2: return zona_cima.potmoure(zona_montaña);
	
	case 3: return true;
	case 4: return true;
	case 5: return true;
	case 6: return true;
	case 7: return zona_grabado.potmoure(zona_cueva_esfinge);
	case 8: return zona_espejo.potmoure(zona_cueva_esfinge);
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







