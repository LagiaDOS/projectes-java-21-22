package dual_aventura_conversacional;

import java.util.ArrayList;

public class monta�a extends zona {

	boolean espada_ense�ada;
	String nombre_guardia;
	boolean nombre_dado;
	public boolean isEspada_ense�ada() {
		return espada_ense�ada;
	}
	public void setEspada_ense�ada(boolean espada_ense�ada) {
		this.espada_ense�ada = espada_ense�ada;
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
	public monta�a(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean espada_ense�ada, String nombre_guardia,
			boolean nombre_dado) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.espada_ense�ada = espada_ense�ada;
		this.nombre_guardia = nombre_guardia;
		this.nombre_dado = nombre_dado;
	}
	
	
	
	
	
}
