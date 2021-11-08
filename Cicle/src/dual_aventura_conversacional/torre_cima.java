package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Scanner;

public class torre_cima extends zona {

	boolean espadausada;
	boolean espejousado;
	boolean magatamausada;
	boolean iniciarfinal;
	
	public torre_cima(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean espadausada, boolean espejousado,
			boolean magatamausada, boolean iniciarfinal) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.espadausada = espadausada;
		this.espejousado = espejousado;
		this.magatamausada = magatamausada;
		this.iniciarfinal = iniciarfinal;
	}
	public boolean isEspadausada() {
		return espadausada;
	}
	public void setEspadausada(boolean espadausada) {
		this.espadausada = espadausada;
	}
	public boolean isEspejousado() {
		return espejousado;
	}
	public void setEspejousado(boolean espejousado) {
		this.espejousado = espejousado;
	}
	public boolean isMagatamausada() {
		return magatamausada;
	}
	public void setMagatamausada(boolean magatamausada) {
		this.magatamausada = magatamausada;
	}
	public boolean isIniciarfinal() {
		return iniciarfinal;
	}
	public void setIniciarfinal(boolean iniciarfinal) {
		this.iniciarfinal = iniciarfinal;
	}



	public void introzona(jugador player) 
	{
		
	if(espadausada==true && espejousado == true && magatamausada==true) {secuenciafinal();}	
		
if (entrat == true) {System.out.println("Estas en la cima de la torre. Tsukiyomi sigue con su ritual, y tu hermana sigue inconsciente.\r\n"
		+ "");}
else {System.out.println("Subiendo los ultimos escalones, llegas finalmente a la cima de la torre. Las nubes se  arremolinan alrededor de la cima, dejando un ojo en ellas por donde ves la luna llena, \r\n"
		+ "que ilumina todo. Flotando encima de un altar ves  a tu hermana inconsciente. Mirandola y dandote la espalda ves a una mujer con un vestido blanco y un pelo  negro como la noche misma, \r\n"
		+ "recitando alguna clase de encantamiento. Una nube de oscuridad envuelve toda la cima de la torre, al igual que con Oni, pero muchisimo mas densa.\r\n"
		+ "\r\n"
		+ "Al pisar esta, la mujer se gira subitamente, mostrando su cara. Al verla, la reconoces al momento; marcada con el simbolo de la luna te das cuenta que es la misma persona que rapto a tu hermana. \r\n"
		+ "- Aha! - Dice ella con una voz aguda. - Asi que tu eres el mortal que tantos problemas ha causado? El que mato a mis serpientes y a Oni. \r\n"
		+ "Ya no importa, tus esfuerzos han sido inutiles; pronto, yo Tsukiyomi, recuperare todo mi poder y tomare el lugar que me merezco! \r\n"
		+ "Exclama ella. Sin dejarle actuar tu te abalanzas para atacarla, pero una barrera te bloquea, ademas de que su oscuridad te arrastra hacia las escaleras, no dejandote acercarte siquiera. \r\n"
		+ "- Necio mortal! Acaso crees que puedes atravesar mis defensas?! E incluso si lo hicieras, te reduciria a polvo! \r\n"
		+ "Pero si te arrodillas, clamas mi perdon y vuelves a ese monton de escombros que llamas pueblo, tendre clemencia… - Dice ella en un tono de autosuficiencia.\r\n"); entrat = true;}		
	
if (espadausada==false){System.out.println("Su barrera sigue en medio del camino, impidiendote acercarte.");}
if (espejousado==false){System.out.println("Tsukiyomi aun tiene energia, y con un solo instante podria fulminarte con su magia.");}
if (magatamausada==false){System.out.println("La oscuridad de tsukiyomi sigue arremolinandose a tu alrededor, complicandote el movimiento.");}


	
	}
	
	
	
	
	
	
	
	
	
	
	

	public void parlar(jugador player){System.out.println("Por un segundo piensas en hablar con Tsukiyomi. Pero tras lo que ha hecho, no te parece que merezca la pena siquiera perder tu tiempo asi.");}
	
	public void usaritem(jugador player, int seleccio) 
	{
		int item = player.inventari.get(seleccio).id;

		
		switch (item){
		
		case 2:
			if(espejousado==false) {System.out.println("Alzas el espejo, el cual empieza a brillar, y ves como la magia de Tsukiyomi empieza a ser absorbida en el espejo. - No! Como te atreves! - Te grita ella"); espejousado=true;}
			else {System.out.println("Alzas el espejo, pero no hace nada mas.");}
			 break;
		
		
		
		case 3: 
			if (magatamausada==false) {System.out.println("Alzas la magatama, y esta empieza a brillar como si fuera el sol mismo, al punto que te deja cegado unos segundos. Cuando recuperas la vision, ves que las tinieblas han desaparecido."); magatamausada=true;}
			else {System.out.println("Alzas la magatama, pero ya no hay tinieblas que disipar.");}
			break;
		
		
		case 4: 
		if (espadausada==false) {System.out.println("Desenfundas la Murakumo, y con un rapido corte, destruyes la barrera magica, que se rompe como un cristal.");espadausada=true;}
		else {System.out.println("La barrera ya ha sido destruida.");}
			break;
		
		
		default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;
		
		
		
		}
	}
	
	public boolean potmoure(torre_medio zona_torre_medio) {
		return zona_torre_medio.demonimort;
	}
	
	public void moviment_negat() 
	{
		System.out.println("La oscuridad de oni te bloquea el paso.");	
	}
	public int bajar(int zonaactual) {	System.out.println("Bajas al segundo piso");return 11;}
	public void atacar(jugador player) {System.out.println("Las defensas de tsukiyomi son aun demasiado ferreas, atacar no es buena idea.");}
	public void defender() {System.out.println("Tsukiyomi no te ha atacado por el momento, no es necesario defenderse.");}

	
	
	
	private void secuenciafinal() {
		Scanner teclat = new Scanner(System.in);		
		System.out.println("Tras tu ultimo ataque, Tsukiyomi cae al suelo derrotada e inconsciente. Pasando por encima suya llegas al altar, y consigues despertar a tu hermana. \r\n"
				+ "Ella parece bien, pero la notas distinta. - Que… que ha pasado? - Pregunta ella confundida. - Oh si. Tsukiyomi… esta ella bien?! - Te exclama. \r\n"
				+ "- Esta ahi, inconsciente, pero ya esta, la he vencido y estas a salvo. Cuando acabe con ella con tal que no nos vuelva a hacer daño ya estaremos bien. - Le dices.\r\n"
				+ "\r\n"
				+ "- Acabar con ella? No te referiras a matarla, no? No puedes hacer eso! Es inocente! - Dice tu hermana, sin que entiendas nada de lo que se refiere. \r\n"
				+ "- Pero que estas diciendo? Sabes la de daño que ha causado? No podemos dejarla viva! - Le escarmientas. - Pero… sabes su historia? Deja que te la cuente… - Dice tu hermana\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "- Antaño habia dos hermanas divinas. Una del sol. Y la otra de la luna. Ambas mantenian el equilibrio entre la luz y la oscuridad. \r\n"
				+ "Pero los mortales solo adoraban la luz y el sol, y aborrecian la noche y la oscuridad.\r\n"
				+ "Consumida por el odio y la envidia, la hermana lunar intento acabar con la hermana solar y tomar su lugar, con tal que la adorasen a ella. \r\n"
				+ "Tras una cruenta batalla, ella y sus secuaces fueron derrotados y ejecutados, y la hermana solar  tomo los poderes de su hermana. \r\n"
				+ "El general que ayudo a la hermana solar se refugio en una montaña, y ocultaron el espejo de la luna en una cueva, con tal que al menos parte de su hermana descansara en paz. \r\n"
				+ "Pero la paz no duro, y la hermana lunar volvio de la muerte, con tal de cumplir su venganza, reviviendo a sus secuaces mas poderosos, la oscuridad misma y una serpiente capaz de devorar montañas. \r\n "
				+ "Alzando la torre donde antaño vivio, rapto a la reencarnacion de su hermana, con tal de recuperar sus poderes y robar los suyos. \r\n"
				+ "Tsukiyomi es la hermana solar, y la hermana solar es Amaterasu… y yo misma. Yo soy su reencarnacion.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Estas sin palabras. Inicialmente ibas a acabar con ella. Pero la situacion de tsukiyomi es mas complicada de lo que parecia. \r\n"
				+ "Ante ti se plantean 2 caminos. Acabar con tsukiyomi, o hacer caso a tu hermana y perdonarla. Cual es tu eleccion?");
		
	boolean finalizar = true;	
	
	while (finalizar == true) {
	
	
	String finalescogido="";
	finalescogido= teclat.nextLine();	
	
	switch (finalescogido){
	case "perdonarla": System.out.println("Siguiendo a tu hermana, decides perdonar a tsukiyomi, enfundado tu espada. - Gracias. De verdad. - Te dice tu hermana. \r\n"
			+ "Ayudandola, entre los dos cogeis a la inconsciente tsukiyomi y salis de la torre. Una vez fuera, empiezas a andar hacia el pueblo, pero ves que tu hermana no te sigue. \r\n"
			+ "- Lo siento. No puedo volver al pueblo. Tengo que irme con tsukiyomi, ir con ella por el mundo y hacer que vea el amor de la gente. Pero eventualmente volvere. \r\n"
			+ "No. Volveremos y todo volvera a la normalidad. - Te dice tu hermana. No puedes hacer mucho realmente, estabas siguiendo el plan de tu hermana al fin y al cabo.\r\n"
			+ "\r\n"
			+ "Con tristeza, te despides de tu hermana, que parte con tsukiyomi, mientras tu vuelves al pueblo. Los dias pasan, y durante una noche de tormenta un relampago impacta en la torre del lago, \r\n"
			+ "hundiendola en un solo instante. Aunque no estas seguro de ello, jurarias haber visto una sombra similar a Susanoo en la orilla del lago la misma noche del relampago.\r\n"
			+ "\r\n"
			+ "Las semanas y los meses pasan, y un dia, sin esperartelo, ves dos figuras familiares en la entrada del pueblo. \r\n"
			+ "Tu hermana… y tsukiyomi. Lo ves en su cara, todo el odio y el rencor ha desaparecido, devolviendola a la diosa lunar que era antes. \r\n"
			+ "Todo a vuelto a la normalidad, y os espera un futuro brillante a todos."); finalizar=false;break;
	
			
			
	case "matarla": System.out.println("Ignorando a tu hermana te acercas a la inconsciente Tsukiyomi, hundiendo tu espada en su cuello. Hace un grito ahogado, y notas como su cuerpo se queda sin fuerzas, y se disuelve en oscuridad. \r\n"
			+ "- Su-supongo que es mejor asi… quizas cuando se reencarne podremos arreglar las cosas y empezar de nuevo. - Dice tu hermana, intentando ocultar su tristeza. \r\n"
			+ "- Sin tsukiyomi esta torre no aguantara mucho mas tiempo en pie, volvamos a casa.\r\n"
			+ "\r\n"
			+ "Segun andais de vuelta al pueblo, veis como la tore se derrumba en el lago, llevandose a los cadaveres de las serpientes hacia el fondo del lago, donde no verian la luz del sol nunca mas. \r\n"
			+ "A las pocas horas no quedaba ni rastro de la torre, parecia como si nada de eso hubiera ocurrido, solo fuera un mal sueño.\r\n"
			+ "\r\n"
			+ "Las semanas pasan, y todo a vuelto a la normalidad. Todo lo ocurrido parece tan lejano, que parece irreal. Aun asi, notas como tu hermana aun sigue afectada por todo, pero entre los dos, lo superareis.\r\n");  finalizar=false; break;
	
	default: System.out.println("Eso no es perdonarla o matarla!"); break;
		}
	
	}

	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println("CREDITOS");
	System.out.println("Director, guion, gameplay, codigo y testeo: Roger Ortiz");
	System.out.println("Puzles: Mi amigo Dust el del Discord");
	System.out.println("Agradecimientos: Bonet per ajudarme, y Bordimor el del discord per el mateix.");	
	System.exit(0);
	}
	
	
	
}
