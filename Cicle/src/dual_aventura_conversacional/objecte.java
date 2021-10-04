package dual_aventura_conversacional;
import java.util.ArrayList;

public class objecte {
	
	int id;
	String nom;
	boolean deixar;
	
	
	
	
	
	public objecte(int id, String nom, boolean deixar) {
		super();
		this.id = id;
		this.nom = nom;
		this.deixar = deixar;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isDeixar() {
		return deixar;
	}
	public void setDeixar(boolean deixar) {
		this.deixar = deixar;
	}
	
	
	
	
	
	
	
	
	
	
}
