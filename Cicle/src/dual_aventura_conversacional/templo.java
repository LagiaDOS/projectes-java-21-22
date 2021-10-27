package dual_aventura_conversacional;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class templo extends zona {

	boolean magatama_conseguida;

	boolean agua_sagrada=false;
	
	public boolean isMagatama_conseguida() {
		return magatama_conseguida;
	}
	public void setMagatama_conseguida(boolean magatama_conseguida) {
		this.magatama_conseguida = magatama_conseguida;
	}
	
public templo(String nom, String id, Boolean entrat, String zona_adalt, String zona_abaix, String zona_dreta,
			String zona_esquerra, ArrayList<objecte> items_terra, boolean magatama_conseguida) {
		super(nom, id, entrat, zona_adalt, zona_abaix, zona_dreta, zona_esquerra, items_terra);
		this.magatama_conseguida = magatama_conseguida;
	}
	
	
	
public void introzona(jugador player) 
{
	if (entrat == true) {System.out.println("Estas en el templo, descansando momentaneamente. El ambiente te relaja. El sacerdote esta ayudando a los heridos y dando consejo a todos.");}
	else {System.out.println("Subiendo a la parte mas alta del pueblo, subes hasta el templo. Desde la entrada puedes ver todo el pueblo, el lago y el bosque os rodea, sin mencionar la torre que surgio del lago. El interior del templo esta mucho mas ajetreado y caotico que de costumbre. Mucha gente, cuyos hogares fueron destruidos en el ataque, se han refugiado en el templo, esperando que los demonios no ataquen de nuevo. La estatua de la diosa Amaterasu se alza en el medio del templo, con su magatama colgando del cuello. El Sacerdote esta guiando y aconsejando a todos los que puede, y al verte te dice – Bienvenido, has venido buscando consejo tambien?"); entrat = true;}		

	boolean espadasagrada=false;
	boolean espejo=false;
	
	for (int i = 0; i < player.inventari.size(); i++) 
	{
		if (player.inventari.get(i).id==2) {espejo=true;}
		if (player.inventari.get(i).id==4) {espadasagrada=true;}
	}


	if (espejo == true && espadasagrada == true && magatama_conseguida == false) 
	{
		System.out.println("Notas como el espejo y la murakumo brillan, y al sacarlas, un haz de luz surge de cada uno de los objetos, juntandose en la magatama que amaterasu lleva en su cuello, la cual tambien empieza a brillar. Al ocurrir eso, todo el mundo se queda en silencio, observandote. - Oh, asi que ha llegado el momento. - Dice el sacerdote. -Acercate, joven, toma la magatama sagrada. Desconozco que  te deparara el destino, pero la magatama sera parte esencial de eso.");
		objecte magatama = new objecte(3, "Magatama Sagrada", true);
		items_terra.add(magatama);
		magatama_conseguida = true;
	}

}





public void parlar(jugador player)
{
	Scanner teclat = new Scanner(System.in);		

	System.out.println("Decides hablar con el sacerdote. Que le quieres decir?");
	System.out.println("0. Porque no han atacado los demonios este lugar?");
	System.out.println("1. Es la magatama de la estatua de verdad?");
	System.out.println("2. Tengo que rescatar a mi hermana. Hay algo que puedas darme para ayudarme?");
	System.out.println("3. Podrias darme algun consejo?");
	
	int opcio = teclat.nextInt();

	switch (opcio) {
	case 0: System.out.println("- Este es un lugar sagrado bajo la proteccion de amaterasu. Los demonios no pueden entrar en este lugar. Mientras amaterasu nos siga protegiendo estaremos seguros."); break;
	case 1: System.out.println("- Las leyendas dicen que amaterasu entrego su magatama a nuestros antepasados como un simbolo de su proteccion. Y hasta el momento, ha protegido el templo de los demonios.");break;
	case 2: 
		
	if(agua_sagrada==false) {
	System.out.println("-  Puedes tomar la poca agua sagrada que nos queda. Es eficaz contra los demonios, como las que raptaron a tu hermana. Ve con cuidado, joven, incluso con esta agua sagrada no deberias confiarte, los demonios son muy peligrosos.");
	agua_sagrada = true;
	objecte aguasagrada = new objecte(6, "Agua Sagrada", true);
	items_terra.add(aguasagrada);
	}	
	else {System.out.println("- Me temo que no tengo nada mas que pueda ayudarte, joven.");}	
	break;	
	
	case 3: 
		
	Random ran = new Random();
	int next = ran.nextInt(7);
		
	switch (next) {
	case 0: System.out.println("- El mejor ataque es una buena defensa, pero solo defendiendote no puedes ganar nada."); break;
	case 1: System.out.println("- El herrero esta forjando armas para todos, si necesitas alguna forma de defenderte, puedes pedirle alguna arma.");break;
	case 2: System.out.println("- Las serpientes blancas estan acorazadas, ninguna arma mortal puede herirlas, pero se dice que susanoo las mato con su espada."); break;
	case 3: System.out.println("- Amaterasu tenia 2 hermanos, cada uno con sus reliquias. Se dice que si estas se juntan, ocurrira un milagro.");break;
	case 4: System.out.println("- Dicen que la estatua de la cueva es una guardiana a secretos divinos. Pero ningun mortal a podido entenderla.");break;
	case 5: System.out.println("- Se dice que susanoo concede su poder a los que consiguen superar sus desafios.");break;
	case 6: System.out.println("- El agua sagrada es letal contra los demonios.");break;
	
	default: break;
	}	
		
		
		
	break;
	
	
	default: break;
	}
	
	

}





public void usaritem(jugador player, int seleccio) 
{
	
	int item = player.inventari.get(seleccio).id;

	switch (item)
	{
	case 2: 
		System.out.println("- Ese espejo… contiene un gran poder. Tenlo cerca tuya, te mantendra a salvo." );
		break;
	case 3: 			
		System.out.println("- Usa la magatama sagrada con sabiduria, en ella depende el destino.");
		break;
	case 4: 			
		System.out.println("- La espada sagrada de Susanoo…  blandela con cuidado,  es un arma con un poder inalcanzable a los mortales");
		break;
	case 6: 			
		System.out.println("- Esas son las ultimas gotas de agua sagrada que nos quedan, usala solo contra los demonios.");
		break;
		
		
	default: System.out.println("No se te ocurre como usar el/la " + player.inventari.get(seleccio).nom + " aqui puede servir de algo.");break;}

	
	
	
	}



}
