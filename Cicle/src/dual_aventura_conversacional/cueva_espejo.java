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
}
