package generador_nombres_lalafel;
import java.util.*;
import java.util.Random;   
import java.util.Scanner;


public class Main {

	static String[] silabas = {"a","ab","abs","ac","ad","ads","af","ag","ah","ahi","ahu","ai","ain","ais","aiz","al","am","an","angs","ans","ap","ar","as","at","au","auc","aug","aun","aus","ax","ay","az","ba","bab","bac","bad","bahu","bai","bais","baj","bal","bam","ban","bap","bar","bas","bau","bax","bay","be","beb","bec","bei","beis","bel","bem","ben","ber","berg","bergs","bes","beu","bey","bez","bi","bia","biad","biais","bial","biam","bian","biar","bias","bic","bid","bie","bieis","biel","bien","bier","bies","biez","bif","big","bihar","bihe","bihen","bihon","bihor","bil","bim","bin","bio","biom","bion","bios","biot","bir","bis","bit","biu","biz","bla","blaj","blan","blar","blas","ble","blen","bles","blez","bli","blia","blie","blin","blio","blir","blis","blo","bloc","bloi","blon","blor","blos","blu","blue","blues","bo","bock","boi","boj","bol","bom","bon","bor","bos","bot","bots","bou","box","boy","bra","brac","brah","brahi","brai","bral","bran","brar","bras","bray","braz","bre","brehi","brehu","brel","bren","brep","bres","brex","bri","bria","briad","briais","brial","brian","briar","brias","bric","brid","brie","brieis","brien","bries","bril","brin","brio","briol","brion","brir","bris","briz","bro","bron","bros","broz","bru","brua","bruad","bruais","bruar","bruas","brue","brueis","brun","bruo","brup","brus","bu","bua","buan","buc","bue","buei","bueis","buen","buer","bues","buey","buha","buhar","buhe","buho","bui","buid","buir","buj","bul","bum","bun","bur","bus","but","buts","bux","buz","ca","cab","cac","cad","caf","cahi","cai","cais","caj","cal","cam","can","cap","car","cas","cat","cau","caus","cauz","cax","cay","caz","ce","ceb","ced","cei","ceis","cel","cem","cen","cep","ceps","cer","ces","cet","ceu","ceug","cez","cha","chad","chai","chais","chal","cham","chan","char","chas","chau","chauz","chay","che","chei","cheis","chel","chen","cher","ches","cheu","chez","chi","chia","chiad","chiais","chian","chiar","chias","chib","chic","chid","chie","chieis","chien","chies","chihem","chil","chim","chin","chio","chip","chir","chis","cho","chog","choj","chol","chom","chon","chor","chos","choz","chu","chua","chuar","chuas","chub","chue","chui","chuis","chuj","chum","chun","chur","chus","chuz","ci","cia","ciad","ciais","cial","cian","ciar","cias","ciaz","cib","cic","cid","cie","cieis","ciem","cien","cier","cies","cil","cim","cin","cio","cion","cios","cir","cis","cit","ciu","ciun","cix","cla","clac","clam","clan","clar","clas","clau","claus","claz","cle","clec","clei","clen","clep","cler","cles","cli","clic","clien","clin","clio","clion","clip","clis","clo","cloi","clon","clos","clu","club","clue","clui","cluid","cluir","cluis","cni","cnt","co","coc","cog","cohi","coi","coin","coj","cok","col","com","comp","con","cons","cop","cor","corps","cos","cot","cox","coy","coz","cra","cral","cran","crar","cras","cre","crei","cren","cres","crex","crez","cri","cria","criad","criais","crian","criar","crias","cric","crieis","crim","crin","crio","crios","crip","cris","criz","cro","croi","crol","cron","crop","cros","croy","cru","crua","crue","cruel","cruen","crup","crus","cruz","cu","cua","cuad","cuai","cuais","cual","cuam","cuan","cuar","cuas","cuaz","cud","cue","cuei","cueis","cuel","cuen","cuer","cues","cuex","cuez","cui","cuid","cuin","cuir","cuis","cul","cum","cun","cuns","cuo","cuor","cuos","cur","cus","cut","cuy","cuz","dac","dad","daf","dai","dais","dal","dam","dan","dap","dar","das","dau","day","daz","de","deb","dec","dehis","dei","deis","del","dem","den","dep","der","des","deu","dex","dez","di","dia","diac","diad","diag","diais","dial","dian","diar","dias","diaz","dic","did","die","dieis","diel","diem","dien","dier","dies","diez","dif","dig","dij","dil","dim","din","dio","dioi","dion","diop","dios","dip","dir","dis","diu","diur","diz","do","doc","dog","doi","dol","dom","don","dong","dop","dor","dos","dou","doy","doz","dra","drac","drad","dral","dran","drar","dras","drau","dray","draz","dre","dreis","dren","dres","drez","dri","dria","driad","driais","drial","drian","driar","drias","drie","drieis","drien","dril","drin","drio","drios","drir","dris","driz","dro","drog","droi","dron","drop","dros","dru","drue","drui","drus","du","dua","duad","duais","dual","duan","duar","duas","dub","duc","due","dueis","duen","duer","dues","dui","duis","duj","dul","dum","dun","duo","duos","dur","dus","duun","dux","duz","dy","e","ec","ei","eins","eis","el","em","en","ep","er","es","et","eu","eus","ex","ez","fa","fac","fad","fai","fais","fal","fam","fan","far","fas","fau","faus","fax","faz","fe","fec","fei","feis","fel","fem","fen","fer","fes","feu","fez","fi","fia","fiad","fiais","fiam","fian","fiar","fias","fic","fie","fieis","fiel","fien","fier","fies","fig","fil","fim","fin","fio","fion","fior","fios","fir","fis","fiu","fiz","fla","flac","flan","flar","flas","flau","flay","fle","flec","fleg","flei","fli","flic","flid","flir","flo","flon","flor","flos","flu","flua","fluc","flue","fluen","flui","fluir","fluis","fluo","flus","flux","fo","fod","foi","fol","fom","fon","for","fos","foz","fra","frac","frag","frahu","frai","fram","fran","frar","fras","frau","fraus","frax","fray","fraz","fre","frei","frej","fren","fres","frey","frez","fri","fria","friad","friais","frial","frian","friar","frias","fric","frie","frieis","frien","frin","frio","frior","frir","fris","friu","friz","fro","fron","fros","fru","fruc","fruen","frui","fruid","fruir","fruis","frun","frus","fu","fuc","fue","fuel","fuen","fuer","fui","fuid","fuir","fuis","ful","fun","fur","fus","fut","ga","gad","gai","gais","gal","gam","gan","gangs","gar","gas","gau","gay","gaz","ge","ged","gei","geis","gel","gen","ger","ges","gi","gia","giad","giais","gial","gian","giar","gias","gid","gie","gieis","gien","gier","gies","gil","gim","gin","gio","gion","gios","gip","gir","gis","gla","glan","glar","glas","glau","gle","gles","gley","gli","glia","glio","glios","glip","glis","glo","glon","glos","glu","gne","gneis","gno","gnos","go","gol","gom","gon","gor","gos","got","gots","goz","gra","gral","gram","gran","grar","gras","graz","gre","grei","greid","gren","gres","greu","grey","grez","gri","gria","griad","griais","grial","grian","griar","grias","griaz","grie","grieis","grien","gries","grim","grin","grio","grion","grir","gris","gro","groi","gron","gror","gros","gru","grua","grue","gruen","grui","gruir","gruis","gruz","gu","gua","guad","guai","guais","gual","guam","guan","guar","guas","guau","guay","gue","guei","gueis","guel","guen","guer","gues","guey","guez","gui","g�i","guia","guiad","guian","guiar","guias","guid","guie","guieis","guien","guil","g�il","guim","g�im","guin","g�in","guio","guion","guir","g�ir","guis","g�is","guiz","gul","gum","gun","gunt","guo","guor","guos","gur","gus","guz","ha","had","haf","hai","hais","hal","ham","hams","han","har","has","hau","haus","hay","haz","he","heb","hec","heis","hel","hem","hen","hep","her","hes","heu","hez","hi","hia","hid","hie","hiel","hien","hier","hies","hil","him","hin","hioi","hip","hir","his","hiz","ho","hol","hom","hon","hor","hos","hoy","hoz","hu","hua","huai","hual","huan","huar","huas","huatl","hue","huel","huen","huer","hues","huey","hui","huid","huil","huin","huir","huis","hun","hur","hus","i","ic","id","ig","il","im","in","ins","io","ion","ip","ir","is","ist","iz","ja","jac","jad","jai","jais","jal","jam","jan","jar","jas","jau","jay","jaz","je","jec","jei","jeis","jel","jem","jen","jer","jes","jey","jez","ji","jia","jiad","jial","jian","jiar","jias","jid","jie","jieis","jien","jier","jies","jil","jim","jin","jio","jion","jir","jis","jo","job","jol","jon","jor","jos","jou","ju","jua","juan","juar","jud","jue","juer","juey","juez","jui","juil","jum","jun","jur","jus","juz","ka","kai","kan","ke","kel","ker","kif","kin","kios","kli","klin","klis","klo","kril","kur","ky","lab","lac","lad","lag","lai","lais","laj","lal","lam","lamb","lan","lans","lap","lar","las","lat","lau","laus","lax","lay","laz","le","lec","led","lef","lei","leis","lej","lel","lem","len","lep","ler","les","let","leu","leus","lex","ley","lez","li","lia","liad","liais","lial","lian","liar","lias","liaz","lib","lic","lid","lie","lieis","lien","lier","lies","lig","lim","limp","lin","lio","lioj","lion","lior","lios","lip","lir","lis","lit","liu","liz","lla","llad","llais","llal","llam","llan","llar","llas","llau","llay","llaz","lle","llei","lleis","llen","ller","lles","llet","llets","llez","lli","llial","llic","llid","llier","llil","llin","llir","llis","lliz","llo","lloi","llon","llor","llos","llu","llue","lluz","lo","loi","loj","lol","lom","lon","lop","lor","lord","los","lua","luan","luar","luas","luc","lud","lue","lueis","luen","lui","luid","luir","luis","lul","lum","lun","luo","lup","lur","lus","lux","luz","ma","mac","mad","mag","mai","mais","maj","mal","mam","man","mans","mar","mas","mau","max","may","maz","me","mec","mei","meis","mel","mem","men","mens","mer","mes","mey","mez","mi","mia","miad","miais","mial","mian","miar","mias","mic","mid","mie","mieis","miel","miem","mien","mier","mies","mig","mil","mim","min","mio","mion","mios","mip","mir","mis","miu","miur","mix","miz","mne","moc","mohi","mohin","moi","mok","mol","mon","mons","mop","mor","mos","moz","mua","mud","mue","mueb","muen","muer","mues","muf","muha","mui","muir","mul","mun","mur","mus","mut","muy","muz","my","na","nac","nad","naf","nag","nai","nais","nal","nam","nan","nap","nar","nas","nau","nax","nay","naz","ne","nec","nei","neis","nel","nem","nen","nep","ner","nes","neu","neus","nex","ney","nez","ni","nia","niad","niais","nial","nian","niar","nias","nic","nid","nie","nieis","niel","nien","nier","nies","nig","nil","nim","nin","nio","nion","nior","nios","nip","nir","nis","nit","niu","nix","niz","no","nob","noc","noi","nol","nom","non","nop","nor","nos","noz","nu","nua","nuad","nuais","nual","nuan","nuar","nuas","nue","nueis","nuen","nuer","nues","nuez","nui","nuid","nuir","nuis","nul","nun","nuo","nuos","nup","nur","nus","nuz","ny","�ac","�ad","�ais","�al","�am","�an","�ar","�as","�az","�ei","�eis","�en","�er","�es","�ez","�id","�ier","�il","�in","�ir","�is","�iu","�ol","�on","�or","�os","�oz","�ue","�us","o","ob","obs","oc","of","oh","oi","ol","om","on","op","or","os","pa","pac","pad","pahi","pai","pais","pal","pam","pan","pans","par","pas","pau","pax","pay","paz","pche","pe","pec","ped","peg","pei","pein","peis","peiz","pel","pen","pep","per","pers","pes","peu","pex","pey","pez","phi","pi","pia","piad","piais","pial","pian","piar","pias","pic","pid","pie","pieis","piel","pien","pier","pies","piez","pig","pil","pim","pin","pio","pioi","pion","pior","pios","pir","pis","pit","piu","pix","piz","pla","plan","planc","plar","plas","plau","plaus","plaz","ple","plec","plei","pleis","plen","ples","pleu","plex","pli","plia","pliad","pliais","plian","pliar","plias","plie","plieis","plien","plin","plio","plios","plir","plis","plo","ploi","plom","plon","plos","plot","plots","plu","plum","plus","po","poi","pol","pom","pon","pop","por","pos","Poy","pra","prac","prag","pran","prar","pras","pre","preg","pren","pres","prez","pri","pria","prie","pries","prin","prio","prion","prior","prios","prir","pris","pro","proc","prog","prohi","pron","pros","pru","prue","prui","pseu","psf","pso","pte","pu","pua","puad","puais","puan","puar","puas","pue","pueis","puel","puen","puer","pues","puf","pug","puk","pul","pum","pun","puo","pur","pus","puy","puz","qua","quark","que","quec","queis","quel","quen","quer","ques","quet","queu","quey","quez","qui","quia","quiais","quial","quian","quias","quid","quiec","quien","quier","quies","quif","quihen","quil","quim","quin","quio","quion","quios","quip","quir","quis","quiu","quiz","ra","rac","rad","rahu","rahus","rai","rail","rais","raj","rak","ral","ram","ran","rap","rar","ras","rat","rau","raus","rauz","rax","ray","raz","re","reb","rec","red","reg","rehi","rehin","rehu","rehur","rei","reis","rel","rem","ren","rens","rep","rer","res","reu","rey","rez","rho","ri","ria","riad","riais","rial","riam","rian","riar","rias","ric","rid","rie","rieis","riel","rien","riep","ries","riez","rig","rihar","rihe","ril","rim","rin","rio","riol","rion","riop","rior","rios","rip","rir","ris","rit","riu","riun","riz","ro","rob","rof","roi","rol","rom","ron","rop","ror","ros","rot","roy","roz","rra","rrai","rraj","rral","rram","rran","rrar","rras","rraus","rraz","rre","rrec","rreg","rrei","rreis","rrel","rrem","rren","rrer","rres","rreu","rrey","rrez","rri","rria","rriad","rriais","rrial","rrian","rriar","rrias","rriaz","rric","rrid","rrie","rrieis","rriel","rrien","rrier","rries","rril","rrim","rrin","rrio","rrion","rrios","rrir","rris","rrit","rro","rrob","rroi","rrol","rrom","rron","rror","rros","rroz","rru","rrua","rruad","rruais","rruan","rruar","rruas","rrue","rrueis","rrui","rruid","rruir","rruis","rrum","rrun","rruo","rrup","rrus","ru","rua","ruad","ruais","ruan","ruar","ruas","rub","ruc","rue","rueis","ruen","rues","ruez","rui","ruin","rum","run","ruo","rup","rur","rus","ruz","sa","sad","sah","sahi","sahu","sai","sais","sal","sam","san","sand","sans","sar","sas","sau","sauz","say","saz","se","sec","sed","seg","sei","seis","sel","sem","sen","sep","ser","ses","set","seu","sex","sey","sez","si","sia","siad","siais","sial","sian","siar","sias","siaz","sid","sie","sieis","siem","sien","sier","sies","sig","sil","sim","sin","sio","siog","sion","sios","sir","sis","sit","so","soi","sois","sol","sols","som","son","sop","sor","sos","soy","soz","su","sua","suad","suais","sual","suar","suas","sub","subs","suc","sud","sue","sueis","suel","suer","sui","suin","suis","sul","sum","sun","suo","sur","sus","swas","ta","tac","tad","tag","tahi","tahu","tai","tais","tal","tam","tan","tar","tas","tat","tau","tax","tay","taz","te","tec","ted","teg","tehis","tei","teis","tel","tem","ten","ter","ters","tes","test","teu","tex","tey","tez","the","ti","tia","tiad","tiais","tial","tiam","tian","tiar","tias","tib","tic","tics","tid","tie","tieis","tiem","tien","tier","ties","tig","tiha","tihen","tiho","til","tim","tin","tio","tiol","tion","tior","tios","tip","tir","tis","tiu","tiz","tla","tlas","tlax","tle","to","toc","tof","toi","tol","tom","ton","top","tor","tos","toy","tra","trac","trad","trahi","trahis","trai","tral","tram","tran","trans","trar","tras","trau","trax","tray","traz","tre","trein","trel","trem","tren","trep","trer","tres","treu","trez","tri","tria","triad","triais","trial","trian","triar","trias","tric","trie","trieis","trien","tries","tril","trin","trio","trion","trios","trip","trir","tris","triun","triz","tro","troj","trol","trom","tron","tror","tros","trox","troz","tru","trua","truad","truais","trual","truan","truar","truas","truc","true","trueis","truen","truha","truhan","trui","truid","truir","truis","trum","trun","truo","truos","trus","truz","tu","tua","tuad","tual","tuan","tuar","tuas","tud","tue","tueis","tuen","tuer","tues","tui","tuid","tuir","tuis","tul","tum","tun","tuo","tuos","tur","tus","tuy","tuz","u","ua","uas","ud","ue","ues","uf","ul","um","un","ur","us","ut","va","vac","vad","vai","vais","val","vam","van","var","vas","vau","vaz","ve","vec","vei","vein","veis","vel","ven","ver","vers","ves","vez","vi","via","viad","viais","vial","vian","viar","vias","viaz","vic","vid","vie","viei","vieis","viem","vien","vier","vies","viet","viets","vil","vim","vin","vio","vion","vior","vios","viot","vir","vis","vit","viu","viz","vo","vod","voi","vol","von","vor","vos","vot","voy","voz","vra","vu","vue","vuel","vues","vul","vun","vus","whis","wich","wol","xa","xac","xad","xais","xal","xan","xar","xas","xau","xe","xeis","xen","xer","xes","xi","xia","xiad","xiais","xial","xian","xiar","xias","xid","xie","xieis","xien","xies","xil","xio","xion","xir","xis","xiu","xo","xon","xor","xos","xu","xua","xual","xul","ya","yac","yad","yai","yais","yak","yal","yam","yan","yar","yas","yat","yaz","ye","yec","yed","yeis","yel","yen","yer","yes","yeu","yez","yi","yil","yin","yis","yo","yoi","yol","yom","yon","yor","yos","yu","yua","yue","yul","yum","yun","yunc","yus","yux","za","zad","zaf","zag","zai","zais","zal","zam","zan","zar","zas","ze","zen","zeu","zeug","zhai","zi","zia","zig","zin","zion","zir","zis","zo","zoi","zol","zom","zon","zor","zos","zra","zrar","zre","zu","zua","zuad","zuais","zuar","zuas","zud","zue","zueis","zui","zuin","zul","zum","zun","zuo","zur","zut","zuz"};
	static Random random = new Random(); 
	
	//TODO:
	// Majuscules en nom i cognom
	// ajustar les silabas per a que encaixin amb la estructura dels noms
	// cambiar les silabes per fonemes
	
	public static void main(String[] args) {

		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Selecciona quin nom vols generar:");
		System.out.println("1. PlainsFolk Hombre");
		System.out.println("2. PlainsFolk Mujer");
		System.out.println("3. Dunesfolk Hombre");
		System.out.println("4. Dunesfolk Mujer");
		System.out.println("0. Sortir. Posar una opcio no valida tambe surt");
		
		String opcio=teclat.nextLine();
		String nomgenerat="";
		
		switch (opcio) {
		case "1": nomgenerat=generarPlainMale();	System.out.println("El nom generat es: " + nomgenerat);	break;
		case "2": nomgenerat=generarPlainFemale();	System.out.println("El nom generat es: " + nomgenerat);	break;
		case "3": nomgenerat=generarDunesMale();	System.out.println("El nom generat es: " + nomgenerat);	break;
		case "4": nomgenerat=generarDunesFemale();	System.out.println("El nom generat es: " + nomgenerat);	break;
		case "0": System.out.println("Sortir del programa"); break;
		default: System.out.println("Opcio no valida. Sortir del programa"); break;
		}
		
		
		
		
		
		
		
		
		
	}

	public static int generadorRand() 	{
		int numaleatorio = random.nextInt(silabas.length); 
		return numaleatorio;
	}
	
	public static String generarPlainMale() {
		
		//1. The phoneme pattern used is AB - CB
		//2. The A and C phonemes do not have to rhyme.
		//3. The A, B, and C phonemes are usually limited to one or two syllables.
		
		//- Zorido Manarido
		//- Kopel Yorpel
		//- Alka Zolka
		//- Waguda Mabaguda
		
		String nombre="";
		int aleatorio;
		
		aleatorio = generadorRand();
		String Silaba_A=silabas[aleatorio];
		
		aleatorio = generadorRand();
		String Silaba_B=silabas[aleatorio];
		
		aleatorio = generadorRand();
		String Silaba_C=silabas[aleatorio];
		
		nombre = Silaba_A+Silaba_B+" "+Silaba_C+Silaba_B;
		
		return nombre;}
	
	public static String generarPlainFemale() {
		
		//1. The phoneme pattern used is ABB - AB.
		//2. The A and B phonemes are always one syllable, and most often a single consonant paired with a single vowel, or simply a single vowel.
		
		//- Mimomo Mimo
		//- Tokiki Toki
		//- Ulala Ula
		//- Honmeme Honme
		String nombre="";
		int aleatorio;
		
		aleatorio = generadorRand();
		String Silaba_A=silabas[aleatorio];
		
		aleatorio = generadorRand();
		String Silaba_B=silabas[aleatorio];
			
		nombre = Silaba_A+Silaba_B+Silaba_B + " " + Silaba_A+Silaba_B;
		
		return nombre;}
	
	public static String generarDunesMale() {
		//1. The phoneme pattern used is AAB - CCB
		//2. The A and C phonemes are 1 syllable, the B phoneme 2.
		//3. The A and C phonemes may rhyme, but do not have to.
		//4. Syllables are most often a single consonant paired with a single vowel, or simply a single vowel.
		
		//- Jajariku Nanariku (rhyming)
		//- Momomena Lolomena (rhyming)
		//- Nunulupa Tatalupa (non-rhyming)
		//- Fafajoni Kukujoni (non-rhyming)
		
		
		String nombre="";
		int aleatorio;
		
		aleatorio = generadorRand();
		String Silaba_A=silabas[aleatorio];
		
		aleatorio = generadorRand();
		String Silaba_B=silabas[aleatorio];
		
		aleatorio = generadorRand();
		String Silaba_C=silabas[aleatorio];
		
		nombre = Silaba_A+Silaba_A+Silaba_B+" " + Silaba_C + Silaba_C + Silaba_B;
		
		return nombre;}
	
	public static String generarDunesFemale() {
		
		//1. The phoneme pattern used is AAB - AB
		//2. The A and B phonemes are 1 syllable (with the A phoneme always repeated in the forename).
		//3. Syllables are most often a single consonant paired with a single vowel, or simply a single vowel.
		
		//- Jajano Jano
		//- Kokobi Kobi
		//- Yayamo Yamo
		//- Chuchumu Chumu
		
		String nombre="";
		int aleatorio;
		
		aleatorio = generadorRand();
		String Silaba_A=silabas[aleatorio];
		
		aleatorio = generadorRand();
		String Silaba_B=silabas[aleatorio];
			
		nombre = Silaba_A+Silaba_A+Silaba_B + " " + Silaba_A+Silaba_B;
		
		return nombre;}
	
	
	
}

