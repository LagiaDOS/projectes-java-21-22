package dual_aventura_conversacional;
import java.util.ArrayList;

public class herrero extends zona {

	
	boolean espada;
	
	
public herrero(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean espada) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.espada = espada;
	}


	public boolean isEspada() {
		return espada;
	}
	public void setEspada(boolean espada) {
		this.espada = espada;
	}


	
	
	
	public void introzona() 
	{
		System.out.println("introzonaherrero");	
	}
	
	
	
	
	
	
	
	
}

