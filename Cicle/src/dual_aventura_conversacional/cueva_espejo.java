package dual_aventura_conversacional;

import java.util.ArrayList;

public class cueva_espejo extends zona {

	boolean puzle_resuelto;
	Boolean[] antorchas;
	
	
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
		else {System.out.println("Tras la puerta oculta encuentras una extraña sala. Delante tuya hay varias antorchas apagadas, detras de las cuales hay un pequeño santuario de madera y piedra. El santuario tiene iconografia solar y lunar, en las mitades derecha e izquierda respectivamente. \r\n"
				+ "\r\n"
				+ "En medio del santuario ves un receptaculo, en el que dentro reposa un espejo antiguo encima de un cojin delicadamente tejido. Intentas coger el espejo, pero una especie de campo de fuerza impide que puedas cogerlo. Ves como en el marco del receptaculo esta escrito “El espejo de la verdad se revelara cuando la luz y la oscuridad de las hermanas se muestren delante suya.”"); entrat = true;}		
	}




}
