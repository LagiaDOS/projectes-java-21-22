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
	zona zonacentre = new zona ("Centre", "centre", false, "adalt", "abaix", "dreta", "esquerra", null);//0
	zona zonaadalt = new zona ("Adalt", "adalt", false, null, "centre", null, null, null);//1
	zona zonaabaix = new zona ("Abaix", "abaix", false, "centre", null, null, null, null);//2
	zona zonadreta = new zona ("Dreta", "dreta", false, null, null, null, "centre", null);//3
	zona zonaesquerra = new zona ("Esquerra", "esquerra", false, null, null, "centre", null, null);//4
	
	
	herrero zonaherrero = new herrero ("herrero", "centre", false, "adalt", "abaix", "dreta", "esquerra", null, true);
	
	int zonaactual=0;
	zona[] arrayzones = {zonacentre, zonaadalt, zonaabaix, zonadreta, zonaesquerra, zonaherrero};
	
	
	
	
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







