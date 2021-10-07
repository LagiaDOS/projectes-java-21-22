package dual_aventura_conversacional;

import java.util.ArrayList;

public class lago extends zona {

	boolean presentadas;
	boolean pregunta_pasar;
	boolean risas;
	boolean serpientes_muertas;
	public boolean isPresentadas() {
		return presentadas;
	}
	public void setPresentadas(boolean presentadas) {
		this.presentadas = presentadas;
	}
	public boolean isPregunta_pasar() {
		return pregunta_pasar;
	}
	public void setPregunta_pasar(boolean pregunta_pasar) {
		this.pregunta_pasar = pregunta_pasar;
	}
	public boolean isRisas() {
		return risas;
	}
	public void setRisas(boolean risas) {
		this.risas = risas;
	}
	public boolean isSerpientes_muertas() {
		return serpientes_muertas;
	}
	public void setSerpientes_muertas(boolean serpientes_muertas) {
		this.serpientes_muertas = serpientes_muertas;
	}
	public lago(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean presentadas, boolean pregunta_pasar,
			boolean risas, boolean serpientes_muertas) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.presentadas = presentadas;
		this.pregunta_pasar = pregunta_pasar;
		this.risas = risas;
		this.serpientes_muertas = serpientes_muertas;
	}
	
	
	
	
	
}
