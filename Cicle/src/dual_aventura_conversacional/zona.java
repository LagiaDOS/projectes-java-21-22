package dual_aventura_conversacional;

import java.util.ArrayList;

public class zona {


	String nom;
	String id;
	Boolean entrat;
	String zona_adalt;
	String zona_abaix;
	String zona_dreta;
	String zona_esquerra;
	ArrayList<objecte>  items_terra = new ArrayList<objecte>();
	
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getEntrat() {
		return entrat;
	}
	public void setEntrat(Boolean entrat) {
		this.entrat = entrat;
	}
	public String getZona_adalt() {
		return zona_adalt;
	}
	public void setZona_adalt(String zona_adalt) {
		this.zona_adalt = zona_adalt;
	}
	public String getZona_abaix() {
		return zona_abaix;
	}
	public void setZona_abaix(String zona_abaix) {
		this.zona_abaix = zona_abaix;
	}
	public String getZona_dreta() {
		return zona_dreta;
	}
	public void setZona_dreta(String zona_dreta) {
		this.zona_dreta = zona_dreta;
	}
	public String getZona_esquerra() {
		return zona_esquerra;
	}
	public void setZona_esquerra(String zona_esquerra) {
		this.zona_esquerra = zona_esquerra;
	}
	public ArrayList<objecte> getItems_terra() {
		return items_terra;
	}
	public void setItems_terra(ArrayList<objecte> items_terra) {
		this.items_terra = items_terra;
	}
	
	public zona(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra) {
		super();
		this.nom = nom;
		this.id = id;
		this.entrat = entrat;
		this.zona_adalt = zona_adalt;
		this.zona_abaix = zona_abaix;
		this.zona_dreta = zona_dreta;
		this.zona_esquerra = zona_esquerra;
		this.items_terra = items_terra;
	}
	

	
	public boolean camilliure() {
		
		return true;
	}
	
	
	public void introzona() 
	{
		if (entrat == true) {System.out.println("Has entrat a " + nom + " Segona visita");}
		else {System.out.println("Has entrat a " + nom + " Primera visita"); entrat = true;}		
	}
	
	
	
	
	
}