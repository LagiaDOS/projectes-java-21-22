package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Scanner;

public class cima extends zona {

	boolean puerta_cerrada;
	boolean duelo;
	boolean entrada_sellada;
	boolean demonio_mostrado;
	int ataques;
	int defensas;
	
	String atac_defensa;
	boolean dueloganado = false;
	boolean empezarduelo = false;
	

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
	
	
	public void introzona(jugador player) {
			
		if (dueloganado == true && murakumosuelo()==false){System.out.println("Segun sales del templo, Murakumo en mano, un temblor hace que parte de el se derrumbe, sellando la entrada al templo."); entrada_sellada=true;}
				
		if (entrat == true && entrada_sellada==false)	{System.out.println("Estas en el interior del templo. Susanoo te observa, mientras toma un trago de su botella.");}
		
		if (entrat == false) {
			System.out.println("Tras varias horas de andar por el sendero tormentoso llegas finalmente a la cima de la montaña. Delante tuya se alza una pagoda con muros de piedra, y tejados de metal. Cada pocos minutos un relampago cae en esta pagoda, energizando el tejado y dando al aire un peculiar olor. No ves a nadie salvo a ti mismo, pero la puerta de la pagoda esta abierta. Movido por una extraña curiosidad y por motivos que no acabas de entender, te dirijes a la pagoda.");	
			System.out.println("Cuando entras en la pagoda, la puerta detras tuya se cierra de golpe, dejando a solas con la oscuridad y los relampagos que caen fuera. De repente, dos velas se encienden a tus lados, seguido de varias decenas mas, formando un camino que eventualmente culmina en un circulo de velas.");	
			System.out.println("En medio de este circulo puedes ver a un figura humanoide vagamente iluminada, sentada con las piernas cruzadas mientras hacer un trago de una pequeña botella de licor.");	
			System.out.println("Tu eres el chaval que dice ser un guerrero? - Te dice la figura con una voz grave. - Acercate… deja que te vea bien.");	
			System.out.println("Haces unos pocos pasos adelante. Te tiemblan las piernas, el hombre es aun mas terrorifico que las serpientes del lago, incluso cuando esta solo sentado, su aura es suficiente para hacer llorar de terror a un hombre adulto. Pero no puedes permitirte llorar. Tienes que rescatarla cueste lo que cueste.");	
			System.out.println("Ahora ya cerca suya, puedes distinguir las cualidades de este hombre; su piel es de un rojo palido, e incluso sentado es mas alto que ti. Su cabeza esta decorada con una extraña corona de hierro, con una largas y delgadas puas que se alzan hacia arriba. Apenas va vestido, llevando solo un taparrabos de tela y un chaleco de tela tintada de color negro.");	
			System.out.println("- Yo soy Susanoo, dios de la guerra y las tormentas. Habla, humano – te dice el.");	
			entrat = true;}
		
		if (entrada_sellada==true){System.out.println("Estas en la cima de la montaña. La entrada al tiempo esta derrumbada, y solo te acompaña el sonido del frio viento. Pese a que no parezca que puedas hacer nada mas aqui, una extraña calma llena tu alma.");}
		
	}
	
	public boolean murakumosuelo() 
	{
		for (int i = 0; i < items_terra.size(); i++) 
		{
		 if	(items_terra.get(i).id==4){return true;}
		}
		return false;
		
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
	
	public void encender() {
		
		if (entrada_sellada==true) {
		System.out.println("No hay nada que puedas encender aqui");
		}
		else {System.out.println("Las luces ya estan encedidas.");}
	}
	
	public void apagar() {
		
if (entrada_sellada==true) {System.out.println("No hay nada que apagar aqui.");}
else {		System.out.println("Soplas en una de las velas, apagandola. Un instante despues se vuelve a encender por arte de magia.");
}
		
	
	
	}
	
	public void atacar(jugador player) 
	{
		if(entrada_sellada==false) {	
			if (dueloganado==false) {
				if (duelo == true) 
				{ataques++; duelo(atac_defensa="atac");}
				
				if (duelo== false && dueloganado==false){
					if (demonio_mostrado == false) {System.out.println("El aura de susano es atemorizante, no te parece buena idea atacarle.");}
					if (demonio_mostrado == true && hasespada(player )==false) {System.out.println("Sin armas? No seas necio, humano, armate antes.- Te dice Susanoo.");}
					if (demonio_mostrado == true && hasespada(player)==true ) {System.out.println("No me contendre, humano, preparate! - Te grita susanoo. Ves como en su mano empieza a surgir un relampago, que se solidifica tomando la forma de una espada larga de bronze pulido. Tu desenfundas tu espada, dudando que tu hoja pueda herirlo siquiera."); duelo = true;}
				}
			}
			else {System.out.println("El momento de atacar a susanoo ya ha pasado.");}
		}
		else {System.out.println("No hay nadie a quien atacar...");}
	}
	
	public void defender() {
		
		if (entrada_sellada==false) {
		
			if (duelo == false) {System.out.println("No hay necesidad de defenderse.");}
			if (duelo == true) {defensas++; duelo(atac_defensa="defensa");}
		}
		else {System.out.println("No hay nada de lo que defenderte aqui");}
		
	}
	
	public boolean hasespada(jugador player) {
		for (int i = 0; i < player.inventari.size(); i++) 
		{if (player.inventari.get(i).id ==1) {return true;}}
		return false;
	}
	
	public void duelo(String atac_defensa) 
	{
		if (atac_defensa=="atac") 
		{
		switch (ataques) 
			{
			case 1: System.out.println("- Blandes tu hoja contra susanoo, que se limita a apartarte de una patada. - Eso es todo lo que puedes hacer, humano?!  Vamos! Muestrame te poder! - Te grita susano. Tu te pones de pie dudando de tus oportunidades contra el"); break;
			case 2:	System.out.println("- Vuelves a intentar a atacar a susanoo, imitando las estocadas que has visto a los guardias hacer en sus practicas. Susanoo en resupuesta bloquea tu estocada con su pie, pisando la hoja en movimiento y derribandote de un puñetazo. Con una patada de pasa la espada, diciendo – No tienes nada mas! No conseguiras nada de esa forma! - Te grita susanoo"); break;
			case 3: System.out.println("- Te lanzas hacia susano con tu espada en mano, pero en respuesta, el apunta con su espada hacia ti, y lo ultimo que ves es un destello azulado, seguido por un trueno. Cuando recuperas la vision, ves que estas en el suelo, y un pitido resuena en tus oidos. Intentas mover tu cuerpo, pero no puedes, según lo miras, ves como ha sido todo quemado por un relampago, y que estas sangrando. Todo se esta volviendo negro. Ves como susano se acerca a ti y te dice algo, pero no puedes entenderlo, todo se vuelve negro,y dentro de poco, en nada.");
			System.out.println("Has muerto; GAME OVER.");
			System.exit(0);break;
			
			case 4: System.out.println("Blandes tu espada con fuerza hacia la pierna de susanoo, cortandosela de forma profunda. Su sangre te salpica en la cara, mientras susanoo hace un grito de dolor. El se levanta, mientras tu coges aire.");
			dueloganado = true;
			System.out.println("- Bien hecho, mortal. - Te dice susanoo, en un tono ligeramente orgulloso. - Un trato es un trato. Toma mi espada, la Murakumo. Blandela sabiamente, su poder es superior al de cualquier mortal.- Susanoo planta su espada en el suelo, mientras se sienta. - Vamos, tomala, yo tengo que descansar. - Acercas tu mano a la espada, y esta se encoje hasta adaptarse a tu tamaño.");
			
			objecte murakumo = new objecte(4, "Ame-no-Murakumo", true);
			items_terra.add(murakumo);
			duelo=false;
			break;
			}
			
			
			
			
			
		}
		
		
		
		
		if (atac_defensa=="defensa") 
		{

			switch (defensas) 
			{
			case 1: System.out.println("- Pones tu espada en pose defensiva, en el momento adecuado para desviar uno de los golpes de susanoo hacia el suelo. - Buena jugada chaval… buena jugada… - te dice susanoo, sonriendo sadicamente");break;
			case 2: System.out.println("- Susano intenta hacerte una estocada vertical, pero tu te apartas de una voltereta. Viendo como su espada se ha quedado clavada en el suelo, intentas aprovechar para herirle, pero según te acercas, el te repele con una patada. - Casi lo consigues, mortal… casi lo consigues… - te dice susanoo.\r\n");break;
			case 3: System.out.println("Susano vuelve a abalanzarse hacia ti en una estocada vertical, pero esta vez en lugar de apartarte, te lanzas hacia el. Susano clava su espada en el suelo, justo encima de tu cabeza, tu estas debajo suya, entre el y el suelo. Por su expresion, no se esperaba ese movimiento. Sus manos estan ocupadas y no puede darte una patada. Aprovecha la oportunidad!"); ataques = 3;break;
			case 4: System.out.println("Intentas defenderte con tus brazos, pero ultimo que ves es un destello azulado, seguido por un trueno. Cuando recuperas la vision, ves que estas en el suelo, y un pitido resuena en tus oidos. Intentas mover tu cuerpo, pero no puedes, según lo miras, ves como ha sido todo quemado por un relampago, y que estas sangrando. Todo se esta volviendo negro. Ves como susano se acerca a ti y te dice algo, pero no puedes entenderlo, todo se vuelve negro,y dentro de poco, en nada. ");
			System.out.println("Has muerto; GAME OVER.");
			System.exit(0);break;
			}	
	
		}
		
		
	}
	
	public void usaritem(jugador player, int seleccio) 
	{
		switch (seleccio)
		{case 2: 
		
		if (entrada_sellada==false)	{
		System.out.println("Le enseñas el espejo a susano."); 
		System.out.println("Eso ha llegado a tus manos…?  Hmf, cuida bien de eso, quieres? Es mas valioso que tu, te responde el. No parece dispuesto a decirte mas informacion sobre el espejo.");
		}
		else {System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");}
		
		break;
		default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;}
	}
	
	public void parlar(jugador player)
	{
		Scanner teclat = new Scanner(System.in);		

		if (entrada_sellada == true) {System.out.println("No hay nadie mas en las ruinas...");}
		else {
			
			int opcio=0;
			System.out.println("Decides hablar con Susanoo que quieres decirle?");
			System.out.println("0. - Quien eres?");
			System.out.println("1. - Que es este lugar?");
			System.out.println("2. - Han secuestrado a mi hermana. Necesito ayuda para rescatarla.");
			
			try {
				opcio = teclat.nextInt();
				switch (opcio) {
				case 0: System.out.println("- ya te lo he dicho, soy  Susanoo, dios de la guerra y las tormentas. No me hagas repetirlo"); break;
				case 1:	System.out.println("- Mmh… este lugar era el templo de las tormentas, donde yo formaba a mis soldados y enviaba relampagos a todo el reino. Estos tiempos ya pasaron… este lugar es solo una ruina de lo que era, una mala brisa y se derrumbara todo. "); break;
				
				
				case 2: 
					System.out.println("Hmmh… es acaso ese mi problema? Soy un dios, no un guardia de tu pueblo. Pideselo a ellos, no a mi.");
					System.out.println("- Nadie del pueblo podia hacer nada, eran demasiado fuertes. - Le dices");
					System.out.println("- Hmpf, vaya guardias… guerreros mas lamentables. Ni que os hubieran atacado un demonio.");
					System.out.println("- Si nos ataco un demonio. Uno lunar, acompañado de unas serpientes blancas gigantes.");
				System.out.println("");
				System.out.println("Susanoo se levanta, revelando su altura, de casi 4 metros. - Si lo que dices es verdad, estamos en un problema, uno de proporciones que superan a un mortal como tu. Solo un poder divino puede ayudarte. - Te dice el, en tono preocupado. - Me ayudaras entonces? - Le preguntas – Con una condicion. Combate contra mi. Si consigues herirme te dare mi poder. - Te responde el, notando cierto tono de sed de sangre en su tono de voz. - Tu diras cuando empieza el duelo."); demonio_mostrado = true;
				default: break;				
				}
			} catch (Exception e) {
			System.out.println("Eso no es algo que puedas decir!");
			}
			
				
		}
			
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
}
