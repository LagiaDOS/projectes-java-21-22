package dual_aventura_conversacional;

import java.util.ArrayList;

public class montaña extends zona {

	boolean espada_enseñada;
	String nombre_guardia;
	boolean nombre_dado;
	public boolean isEspada_enseñada() {
		return espada_enseñada;
	}
	public void setEspada_enseñada(boolean espada_enseñada) {
		this.espada_enseñada = espada_enseñada;
	}
	public String getNombre_guardia() {
		return nombre_guardia;
	}
	public void setNombre_guardia(String nombre_guardia) {
		this.nombre_guardia = nombre_guardia;
	}
	public boolean isNombre_dado() {
		return nombre_dado;
	}
	public void setNombre_dado(boolean nombre_dado) {
		this.nombre_dado = nombre_dado;
	}
	public montaña(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean espada_enseñada, String nombre_guardia,
			boolean nombre_dado) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.espada_enseñada = espada_enseñada;
		this.nombre_guardia = nombre_guardia;
		this.nombre_dado = nombre_dado;
	}
	
	
	
	
	
}
