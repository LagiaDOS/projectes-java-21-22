package dual_aventura_conversacional;
import java.util.ArrayList;


	



public class torre_base extends zona {
	
	
boolean puzleresolt;


	

	
	

public torre_base(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
		String zona_esquerra, ArrayList<objecte> items_terra, boolean puzleresolt) {
	super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
	this.puzleresolt = puzleresolt;
}
public boolean isPuzleresolt() {
	return puzleresolt;
}
public void setPuzleresolt(boolean puzleresolt) {
	this.puzleresolt = puzleresolt;
}





	public void introzona(jugador player) 
	{
		if (entrat == true) {
			System.out.print("Estas en el primer piso de la torre.");
			if (puzleresolt==true) {System.out.println("El porton esta abierto, dejandote paso al siguiente piso de la torre.");}
			else {System.out.println("El porton esta cerrado, grabado al lado de esta cerradura ves escrito burdamente “Los susurros son la llave”. ");}
		}
		
		
		else {System.out.println("Entrando por el porton abierto de la torre, llegas a la base de esta. Estas en una enorma camara circular, sostenida por 2 gruesas columnas de piedra. \r\n"
				+ "Las paredes estan decoradas con intrincados murales, representando una noche eterna, gobernada por una figura femenina, que se alza por encima de otra figura femenina, que yace muerta en el suelo."
				+ "\r\n"
				+ "Al fondo de la camara hay un porton de piedra cerrado. Ves una cerradura, pero no una llave. Grabado al lado de esta cerradura ves escrito burdamente “Los susurros son la llave”. "); entrat = true;}		
	}
	public void parlar(jugador player){
		
		
		if(puzleresolt==false){System.out.println("Guiado por el grabado decides susurrar a la cerradura, pidiendole que se abra. Sorprendentemente, escuchas el sonido de un mecanismo activandose, y ves como el porton se abre. "); puzleresolt=true;}
		else{System.out.println("Susurras de nuevo a la puerta, esperando que ocurra algo, pero no ocurre nada mas.");}
	
	}
	public int subir(int zonaactual) {

		
		if (puzleresolt == true) {System.out.println("Subes al siguiente piso.");return 11;}
		else {System.out.println("El porton esta cerrado."); return zonaactual;}
			
	
	}
	
	
	
	
	public boolean potmoure(lago zona_lago) {
		return zona_lago.serpientes_muertas;
}
	public void moviment_negat() 
	{System.out.println("Las serpientes cortan tu camino a la torre.");}
}
