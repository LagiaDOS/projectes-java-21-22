package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Scanner;

public class montaña extends zona {

	boolean espada_enseñada;
	String nombre_guardia;
	boolean nombre_dado;
	String nombreJ = "chaval";
	
	
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
	
	public boolean potmoure(cima zona_cima) {
		
		if (zona_cima.duelo == true) {return false;}
		if (zona_cima.duelo == false) {return true;}

		return true;
	}
	
	public void introzona(jugador player) 
	{
		if (entrat == true) {System.out.println("Tras caminar durante cerca de una hora, llegas finalmente a la base de la montaña del relampago. Anillos de nubes negruzcas se arremolinan alrededor de su cima, mientras constantes truenos hacen retumbar la montaña entera.\r\n"
				+ nombre_guardia + "esta protegiendo el camino a la cima, como la ultima vez que lo viste.");}
		else {System.out.println(
				"Tras caminar durante cerca de una hora, llegas finalmente a la base de la montaña del relampago. Anillos de nubes negruzcas se arremolinan alrededor de su cima, mientras constantes truenos hacen retumbar la montaña entera.\r\n"+
				"Te tiemblan las piernas, pero haras lo que sea necesario para recuperar a tu hermana. Segun empiezas a subir el sendero poco a poco, una voz te grita: \r\n"
				+ "- Alto ahi! - De un salto baja enfrente tuya un hombre musculoso, cubierto en una armadura de placas y cadenas, empuñando una lanza mas grande que ti mismo y un escudo de metal mas similar a una pared que una herramienta de guerra \r\n"
				+ "– Esta montaña es un santuario para guerreros! Aquellos incapaces de empuñar un arma no tienen lugar aquí! Marchate, o afrenta las consecuencias de tu intrusion.\r\n"
				); entrat = true;}		
	}
	
	public void moviment_negat() 
	{
		System.out.println("Piensas en huir durante tu duelo... pero la puerta esta sellada. La unica forma que tienes de huir es ganar!");
		
	}
	
	public void parlar(jugador player) 
	{
	Scanner teclat = new Scanner(System.in);		

	
	int opcio=0;

	
	System.out.println("Decides hablar con " + nombre_guardia + " que quieres decirle?");
	System.out.println("0. - Quien eres?");
	System.out.println("1. - Que hay en la cima de la montaña?");
	System.out.println("2. - Que puedo hacer para pasar?");
	
	
	
	try {
		opcio = teclat.nextInt();
		switch (opcio) {
		case 0: if (nombre_dado==false) {System.out.println("- Yo soy Gyoubu Oniwa! Identificate! - Te grita el hombre");
		System.out.println(" Mi nombre es " +  player.nom +". - Le respondes");
		nombreJ=player.nom;
		nombre_dado=true;
		nombre_guardia = "Gyoubu";
		
		}else {System.out.println("Acaso no me has escuchado?! Mi nombre es Gyoubu Oniwa!");}	break;	
		
		case 1: 	System.out.println("-El templo del señor Susanoo! Solo aquellos con el valor de derramar la sangre de sus enemigos tienen permitido pasar!");
		break;	

		case 2: 	System.out.println("- Demuestrame que eres en guerrero!");
		break;	

		default: break;
		}
	} catch (Exception e) {
System.out.println("Eso no es algo que puedas decire!");
	}
	

	

	}
	

	
	public void atacar() {System.out.println("No te parece buena idea atacar a " +nombre_guardia + ".");}
	
	public void defender() {System.out.println("No hay necesidad de defenderse de " + nombre_guardia + ".");}
	
	public int subir(int zonaactual) {
		
	if (espada_enseñada == true) {System.out.println("Subes a la cima");return 2;}
	else {System.out.println("No puedes subir a la cima, " + nombre_guardia + " esta en el camino."); return zonaactual;}
		
	}
	
	
	
	public void usaritem(jugador player, int seleccio) 
	{
		int item = player.inventari.get(seleccio).id;
		
		switch (item)
		{
		case 1: 
		System.out.println("Desenfundas tu espada, enseñandosela a " + nombre_guardia + ".");
		if(espada_enseñada==false){System.out.println(" - Hmmm… una niña pequeña seria mas guerrera que tu, pero supongo que tecnicamente eres un guerrero… puedes pasar "+  nombreJ + ". Mientras enfundas tu espada " + nombre_guardia + " se aparta dejandote paso al sendero que sube a la cima de la montaña. "); espada_enseñada=true;	}
		else {System.out.println("- Hm?! Ya me has enseñado tu espada! Puedes pasar! Acaso no me has escuchado?! TENGO QUE GRITAR MAS PARA QUE ME ESCUCHES?! - Te grita " + nombre_guardia + ", dejandote casi sordo.");}
		break;	
		default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;}
	}
	
	
}
