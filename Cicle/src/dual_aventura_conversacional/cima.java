package dual_aventura_conversacional;

import java.util.ArrayList;

public class cima extends zona {

	boolean puerta_cerrada;
	boolean duelo;
	boolean entrada_sellada;
	boolean demonio_mostrado;
	int ataques;
	int defensas;
	public boolean isPuerta_cerrada() {
		return puerta_cerrada;
	}
	public void setPuerta_cerrada(boolean puerta_cerrada) {
		this.puerta_cerrada = puerta_cerrada;
	}
	public boolean isDuelo() {
		return duelo;
	}
	public void setDuelo(boolean duelo) {
		this.duelo = duelo;
	}
	public boolean isEntrada_sellada() {
		return entrada_sellada;
	}
	public void setEntrada_sellada(boolean entrada_sellada) {
		this.entrada_sellada = entrada_sellada;
	}
	public boolean isDemonio_mostrado() {
		return demonio_mostrado;
	}
	public void setDemonio_mostrado(boolean demonio_mostrado) {
		this.demonio_mostrado = demonio_mostrado;
	}
	public int getAtaques() {
		return ataques;
	}
	public void setAtaques(int ataques) {
		this.ataques = ataques;
	}
	public int getDefensas() {
		return defensas;
	}
	public void setDefensas(int defensas) {
		this.defensas = defensas;
	}
	public cima(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean puerta_cerrada, boolean duelo,
			boolean entrada_sellada, boolean demonio_mostrado, int ataques, int defensas) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.puerta_cerrada = puerta_cerrada;
		this.duelo = duelo;
		this.entrada_sellada = entrada_sellada;
		this.demonio_mostrado = demonio_mostrado;
		this.ataques = ataques;
		this.defensas = defensas;
	}
	
	
	public boolean potmoure(montaña zona_montaña) {
		return zona_montaña.espada_enseñada;
	}

	public void moviment_negat() 
	{System.out.println("El cami a la cima esta tallat");}
	
}
