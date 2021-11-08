package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Scanner;

public class cueva_espejo extends zona {

	boolean puzle_resuelto;
	Boolean[] antorchas;
	
//	 {true, true, false, true, false, true, false};
	
	public boolean isPuzle_resuelto() {
		return puzle_resuelto;
	}
	public void setPuzle_resuelto(boolean puzle_resuelto) {
		this.puzle_resuelto = puzle_resuelto;
	}
	public Boolean[] getAntorchas() {
		return antorchas;
	}
	public void setAntorchas(Boolean[] antorchas) {
		this.antorchas = antorchas;
	}
	public cueva_espejo(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean puzle_resuelto, Boolean[] antorchas) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.puzle_resuelto = puzle_resuelto;
		this.antorchas = antorchas;
	}
	
	public boolean potmoure(cueva_esfinge zona_cueva) {
			
			return zona_cueva.enigma_resuelto;
			
		}
	public void moviment_negat() {
		{System.out.println("No hay donde moverse. Solo hay una pared.");}
	}
	
	
	public void introzona(jugador player) 
	{
		if (entrat == true) {System.out.println("El pequeño santuario sigue como siempre. La escritura del marco dice “El espejo de la verdad se revelara cuando la luz y la oscuridad de las hermanas se muestren delante suya.”");}
		
		else {System.out.println("Tras la puerta oculta encuentras una extraña sala. Delante tuya hay varias antorchas apagadas, detras de las cuales hay un pequeño santuario de madera y piedra. \r\n"
				+ "El santuario tiene iconografia solar y lunar, en las mitades derecha e izquierda respectivamente. \r\n"
				+ "\r\n"
				+ "En medio del santuario ves un receptaculo, en el que dentro reposa un espejo antiguo encima de un cojin delicadamente tejido. \r\n"
				+ "Intentas coger el espejo, pero una especie de campo de fuerza impide que puedas cogerlo. \r\n"
				+ "Ves como en el marco del receptaculo esta escrito “El espejo de la verdad se revelara cuando la luz y la oscuridad de las hermanas se muestren delante suya.”"); entrat = true;}		
	System.out.println("Las antorchas estan encendidas de esta forma:");
	
	for (int i = 0; i < antorchas.length; i++) {
		if (antorchas[i]==true){System.out.print("[X]");}
		if (antorchas[i]==false){System.out.print("[ ]");}
		}
	System.out.println();
	
	if (puzle_resuelto==false && antorchas[0] == true && antorchas[1] == true && antorchas[2] == false && antorchas[3] == true && antorchas[4] == false && antorchas[5] == true && antorchas[6] == false) 
	{System.out.println("Tras poner todas las antorchas en la secuencia correcta, ves como  un destello sale del espejo, deslumbrandote. \r\n"
			+ "Al acercarte, te das cuenta que la barrera que lo protegia ha desaparecido, dejando el espejo listo para que lo cojas.");
	objecte espejo = new objecte(2, "Espejo Encantado", true);
	puzle_resuelto=true;
	items_terra.add(espejo); //[X][X][ ][X][ ][X][ ]
	}
	
	if (puzle_resuelto==false && antorchas[0] == false && antorchas[1] == true && antorchas[2] == false && antorchas[3] == true && antorchas[4] == false && antorchas[5] == true && antorchas[6] == true) 
	{System.out.println("Tras poner todas las antorchas en la secuencia correcta, ves como  un destello sale del espejo, deslumbrandote. \r\n"
			+ "Al acercarte, te das cuenta que la barrera que lo protegia ha desaparecido, dejando el espejo listo para que lo cojas.");	objecte espejo = new objecte(2, "Espejo Encantado", true);
	puzle_resuelto=true;
	items_terra.add(espejo); //[ ][X][ ][X][ ][X][X]
	}

	}
	
	
	
	
	
	public void encender() {
		Scanner teclat = new Scanner(System.in);		
		System.out.println("Que antorcha quieres encender? Introduce su numero empezando por la izquierda (1-7)");
		
		try {
			
			int seleccio=teclat.nextInt();
			seleccio--;
			if (antorchas[seleccio]==true) {System.out.println("Esa antorcha ya esta encendida");}
			else {antorchas[seleccio]=true; System.out.println("Has encendido la antorcha.");}	
			
		} catch (Exception e) {
			System.out.println("Esa no es una de las antorchas!");
		}
	
		
		
	}
	
	public void apagar() {
		Scanner teclat = new Scanner(System.in);		
		System.out.println("Que antorcha quieres apagar? Introduce su numero empezando por la izquierda (1-7)");
	
		try {
			int seleccio=teclat.nextInt();
			seleccio--;
			if (antorchas[seleccio]==false) {System.out.println("Esa antorcha ya esta apagada");}
			else {antorchas[seleccio]=false; System.out.println("Has apagado la antorcha la antorcha.");}
			
		} catch (Exception e) {
			System.out.println("Esa no es una de las antorchas!");
		}
		
	
		
		
	}
	
	
	


}
