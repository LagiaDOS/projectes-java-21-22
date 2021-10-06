package dual_aventura_conversacional;
import java.util.ArrayList;

public class jugador {


	String nom;
	ArrayList<objecte> inventari = new ArrayList<objecte>();
	int id_zona;
	
	public jugador(String nom, ArrayList<objecte> inventari, int id_zona) {
		super();
		this.nom = nom;
		this.inventari = inventari;
		this.id_zona = id_zona;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<objecte> getInventari() {
		return inventari;
	}
	public void setInventari(ArrayList<objecte> inventari) {
		this.inventari = inventari;
	}
	public int getId_zona() {
		return id_zona;
	}
	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}
	
	
	
	public void afegiritemstest() 
	{
		
		objecte espasa = new objecte(0, "Espasa", true);
		objecte escut = new objecte(1, "Escut", true);
		objecte candil = new objecte(2, "Candil", true);
		objecte arco = new objecte(0, "Arco", true);
		

		inventari.add(espasa);
		inventari.add(escut);
		inventari.add(candil);
		inventari.add(arco);
		
		
	}
	
	
	public void printjugador() 
	{
		System.out.println(nom);
		System.out.println(inventari);
		System.out.println(id_zona);
	}
	
	

}








