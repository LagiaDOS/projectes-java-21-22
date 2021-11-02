package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Scanner;

public class lago extends zona {

	boolean presentadas;
	boolean pregunta_pasar;
	boolean risas;
	boolean serpientes_muertas;
	boolean moures;
	
	boolean espadasagradainventario = false;
	boolean espadasagradasuelo = false;
	boolean duelo = false;
	
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
	public boolean isMoures() {
		return moures;
	}
	public void setMoures(boolean moures) {
		this.moures = moures;
	}
	
	public lago(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean presentadas, boolean pregunta_pasar,
			boolean risas, boolean serpientes_muertas, boolean moures) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.presentadas = presentadas;
		this.pregunta_pasar = pregunta_pasar;
		this.risas = risas;
		this.serpientes_muertas = serpientes_muertas;
		this.moures = moures;
	}

	
public void atacar(jugador player) {System.out.println("Atacar a las serpientes te parece una idea inutil.");}
	
public void defender() {System.out.println("Incluso aunque te defendieses, de poco serviria contra los ataques de las serpientes.");}
	





	





public void introzona(jugador player) 
{
	
	
	for (int i = 0; i < player.inventari.size(); i++){if (player.inventari.get(i).id==4){espadasagradainventario=true;}}
	for (int i = 0; i < items_terra.size(); i++){if (items_terra.get(i).id==4){espadasagradasuelo=true;}}
	
	
	
	if (entrat == true &&  moures == true && serpientes_muertas==false){
		System.out.println("- Tu! - Grita uzume – Te creias que con ese truco podrias escapar de nosotras?! - Ves como energia empieza a acumularse en la boca de uzume, mientras todo el lago empieza a burbujear y hace mas calor, pero antes que nada pueda ocurrir, azume le da un coletazo, interrumpiendola. - Acaso quieres destruir todo esto mientas le matas? Por humillante que haya sido eso… no debemos dejar que nuestras emociones se nos suban a la cabeza… tenemos objetivos mas importantes. - Eres una aburrida! Podemos matarlo ya? Quiero irme a nadar. - Dice izume en tono quejica. - Silencio! Las dos! Ahora… que hacemos con este? - Les incrimina azume.");
	moures=false;
	risas=false;
	}
		
	
	if (entrat == true &&  moures == false && risas==true &&serpientes_muertas==false){
		System.out.println("Las serpientes se siguen riendo de forma salvaje, dejandote via libre para dejar el lago y volver al bosque.");
	}
	
	
	if (entrat==false) {System.out.println("Una bruma espesa cubre el lago y obsturye, impidiendote ver la otra orilla. Pese a ello, eres mas que capaz de ver la torre que ahora surge de sus profunidades, alzandose mas alla de la niebla. Puedes notar como el agua se mueve, como si alguna monstruosidad enorme se ocultara en las aguas. Solo que no es “como si” ya que recuerdas como las serpientes del lago casi te matan. Segun piensas en ese peligro,  ves como tres gigantescas serpientes salen del agua, mirandote fijamente.\r\n"
			+ "- Vaya vaya – Dice la del medio. - Una ratita ha salido de su escondite. - En todo burlesco\r\n"
			+ "- Es muy mono, nos lo podemos quedar? - Pregunta la de la derecha, que ves que es significativamente mas pequeña que las otras dos, en un tono perturbadoramente infantil e inocente.\r\n"
			+ "- Tsch! Dejad de hacer tonterias y matemoslo de una vez! - Responde la de la izquierda en tono enfadado.\r\n"
			+ "\r\n"
			+ "- Somos las hermanas serpientes! Azume, Uzume e Izume! Tiembla ante nosotros mortal! - Te dicen las tres de forma simultanea."); entrat = true; moures = false; System.out.println("");}	

	
	if (espadasagradainventario==true && serpientes_muertas==false && duelo == false) {System.out.println("- Ah! E-e-esa espada! - Dice uzume, claramente asustada. - C-como la ha conseguido?! - Dice izume tambien asustada. - Eso ahora no importa! Tenemos que acabar con el rapido! - P-pero si la desfenunda…! - Dize izuma – Grrrrr! Haced algo, rapido! - Dice uzume. Notas como la espada en tu cinto tiembla ligeramente."); duelo = true;}
	if (espadasagradainventario==true && serpientes_muertas==false && duelo == true) {System.out.println("Las serpientes siguen observandote, esperando a tu siguiente movimiento, pero parecen demasiado atemorizadas como para actuar."); duelo = true;}

	
	if (espadasagradasuelo==true && serpientes_muertas == false) {System.out.println("- A-a-acaba de soltar la espada?! - Exclama uzume – Rapido antes que la recoj- dice azume, sienda interrumpida por izume, que antes que puedas hacer nada te aplasta con su cola, reduciendote a poco mas que una mancha roja en el suelo. Tu fin es rapido e indoloro, pero sabes que le fallaste a tu hermana, y llevaras eso hasta el fin de los tiempos en tu alma.");
	System.out.println("GAME OVER");
	System.exit(0);
	}
	
	if (serpientes_muertas==true) {System.out.println("El agua del lago esta manchada de roja de la sangre de las serpientes, y muchos de los arboles han sido o bien derribados por sus golpes de las serpientes o bien por tu corte al matarlas. El olor es mejor no mencionarlo, pero no puedes dejar que algo tan pequeño te impida continuar; vamos pequeño heroe, entra en la torre y cumple tu objetivo!");}
	
	
	
}	





	public void parlar(jugador player){
		Scanner teclat = new Scanner(System.in);		
		
		
		try {

			if (serpientes_muertas==false) {
				if (espadasagradainventario==false) {
				
					if (risas == false) {
						
						System.out.println("Por algun motivo, decides hablar con las serpientes. Que quieres decirles?");
						System.out.println("0. Quienes sois?");
						System.out.println("1. Me dejais pasar a la torre?");
						int opcio = teclat.nextInt();
						
						switch (opcio){
						case 0:
							
							
							if (presentadas == false) {
							System.out.println("- Huh?! No estas aterrado?! Acaso al golpearte en la cabeza perdiste la capacidad de tener miedo? - Dice la del medio. - Hm, escucha nuestros nombres de nuevo, mortal! Pues somos Azume, Uzume e Izume, las hijas de Orochi! Tiembla ante nuestra presencia!\r\n"
									+ "- Yo soy Izume! - Dice la de la derecha\r\n"
									+ "- Hmpf! Y yo Uzume – Responde de mala manera la de la izquierda.");
							presentadas= true;
							}
							else {System.out.println("- Creo que el humano se ha roto – Dice izume – No izume, solo es idiota, ya le hemos responido hace nada y no se acuerda. - Le dice azume.");}
							
							
							break;
						case 1: 
						
								if (pregunta_pasar==false) {System.out.println("Tras varios segundos de silencio incomodo, las tres serpientes se ponen a reir de manera salvaje, derribando varios de los arboles de su alrededor con sus golpes. - Hahahahaha! No sabia que los mortales podian hacer humor asi. - Dice uzume. - Espera… el mortal lo dice en serio! - No...pfff… no puedes pasar...pfff – dice azume entre risas que intenta aguantarse.  Las 3 serpientes siguen riendose sin parar, y no estan prestandote atencion, de querer irte, este parece un buen momento para ello.");
								risas = true;
								pregunta_pasar=true;
								}
								else {
									System.out.println("-Te crees que eso funcionara dos veces? - Dice uzume en tono engreido. - A diferencia de los tuyos… nosotras aprendemos de nuestros errores – Responde azume de forma engreida tambien. -Pfffffffffff hahahahahah! - Se rie izume de forma salvaje – Lo..pfff… lo siento hahahahahah… es que es tan.. pffffff gracioso! – Izume para… pfff! - Le escarmienta azume – Que nos lo…pfff… contagias! Hahahahahah! - Se rie uzume, mientras las tres empiezan a reir salvajemente.\r\n"
											+ " ");
								risas = true;	
								}
							
							
							
							
							break;
						default: break;
						}
					}
					else {System.out.println("Las serpientes estan riendose de forma salvaje, no parecen poder reirse por el momento.");}
				}
				else {System.out.println("Las serpientes te estan mirando de forma atemorizada. No parecen dispuestas a hablar.");}
			}else {System.out.println("Las serpiente estan muertas. Ya no puedes hablar con ellas.");}
		} catch (Exception e) {
			System.out.println("Eso no es algo que puedas decir!");
		}
		
		
	}
	



	public void usaritem(jugador player, int seleccio) 
	{
		
		int item = player.inventari.get(seleccio).id;
		
		switch (item)
		{
		case 1: System.out.println("Necesitaras una espada mucho mas grande si quieres herir a las serpientes."); break;
		case 6: System.out.println("Incluso si el agua es capaz de herir a los demonios, necesitaras mucha mas agua para dañar a las serpientes."); break;
		case 4: 
			
			if (serpientes_muertas==false) {
			System.out.println("Acercas tu mano a la empuñadura de la espada, y según la coges, tu cuerpo se mueve solo, haciendo un rapido corte horizontal en el aire. Durante unos segundos nada ocurre, ni tu ni las serpientes os moveis un dedo, pero subitamente, ves como algo empieza a gotear de sus cuellos: sangre.\r\n"
			+ "\r\n"
			+ "- Susanoo… maldito… bastardo… - Dicen izume, azume y uzume respectivamente, mientras sus cabezas cortadas se deslizan de sus cuellos y caen al lago, seguido de sus cuerpos, haciendo una ola que te empapa completamente de agua. Ves como la marea arrastra los tres cuerpos, posicionandolos de forma idonea para que sirvan de puente para llegar a la torre sin mojarte. Notas como una voz empieza a hablarte en la cabeza – Hm, uno pensaria que tras su primera muerte esas pensarian en meterse con mi hermana de nuevo. Al menos asi serviran de algo… bien hecho mortal, has demostrado ser digno de mi poder, ahora, entra en esa torre y rescata a Amaterasu! - La reconoces sin problema alguno, es susanoo, pero antes que puedas preguntarle nada y resolver tus preguntas, deja de hablar, y no responde nada que dices."); 
			serpientes_muertas=true;
			}
			else {System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo ahora.");}
			
			break;
		default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;}
	
	
	
	}
	
	
	
	
	
}
