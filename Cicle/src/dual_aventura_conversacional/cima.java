package dual_aventura_conversacional;

import java.util.ArrayList;

public class cima extends zona {

	boolean puerta_cerrada;
	boolean duelo;
	boolean entrada_sellada;
	boolean demonio_mostrado;
	int ataques;
	int defensas;
	
	String atac_defensa;
	
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
	{System.out.println("El camino a la cima esta bloqueado por el guardian, no puedes pasar.");}

	public int subir(int zonaactual) {System.out.println("No puedes subir mas arriba"); return zonaactual;}
	
	public int bajar(int zonaactual) {
		if (duelo== true) {System.out.println("No puedes huir en medio del duelo!"); return zonaactual;}
		else {System.out.println("Bajas a la montaña.");return 1;}
		}
	
	public void encender() {System.out.println("Las luces ya estan encedidas.");}
	
	public void apagar() {System.out.println("Soplas en una de las velas, apagandola. Un instante despues se vuelve a encender por arte de magia.");}
	
	public void atacar(jugador player) 
	{
		
		if (demonio_mostrado == false && duelo ==false) {System.out.println("El aura de susano es atemorizante, no te parece buena idea atacarle.");}
		if (demonio_mostrado == true && hasespada(player )==false && duelo == false) {System.out.println("Sin armas? No seas necio, humano, armate antes.- Te dice Susanoo.");}
		if (demonio_mostrado == true && hasespada(player)==false && duelo == false) {System.out.println("No me contendre, humano, preparate! - Te grita susanoo. Ves como en su mano empieza a surgir un relampago, que se solidifica tomando la forma de una espada larga de bronze pulido. Tu desenfundas tu espada, dudando que tu hoja pueda herirlo siquiera."); duelo = true;}

		if (duelo == true) 
		{duelo(atac_defensa="atac");}
		
	
	}
	
	public void defender() {
		if (duelo == false) {System.out.println("No hay necesidad de defenderse.");}
		
		
		if (duelo == true) {duelo(atac_defensa="defensa");}
	}
	
	public boolean hasespada(jugador player) {
		for (int i = 0; i < player.inventari.size(); i++) 
		{if (player.inventari.get(i).id ==1) {return true;}}
		return false;
	}
	
	
	
	
	
	
	
	
	
	public void parlar(jugador player)
	{}
	

	
	public void duelo(String atac_defensa) 
	{}
	
	
	
	
	
	
	
	
	
	
	
}
