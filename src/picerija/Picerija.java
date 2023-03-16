package picerija;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		
		
		double pelna = 0,cena=0;
		String vards="";
		String telNr ="";
		String adrese="";
		String[] atbilde = {"Jā, es gribu piegādi uz savu adresi", "Nē, es atbraukšu pats pakaļ"};
		int izveletaisIndekss = 1;
		
		
		String[] opcijas = {"Sakt darbu","Apskatīt klienta informāciju",
				"Nodot picu klientam","Apskatīties šodienas peļņu", "Beigt darbu"};
		String izvele;
		
		
		do{
		izvele = (String)JOptionPane.showInputDialog(null,"Izvelies darbibu" , "Darbibas izvele",JOptionPane.QUESTION_MESSAGE,null,opcijas,opcijas[4]);
			
		switch(izvele){
			
			
		case"Sakt darbu":
				
			JOptionPane.showMessageDialog(null, "Jums zvana klients", "Informācija",JOptionPane.INFORMATION_MESSAGE);
				
			do{
				telNr = JOptionPane.showInputDialog("Klienta nummurs... ");
 
			}while (!(telNr.startsWith("2") && telNr.length() == 8));
				do{
			vards = JOptionPane.showInputDialog("Klientu sauc...");
		}while(vards.length()<=3);
			izvele = (String)JOptionPane.showInputDialog(null, "Vai jums būs jāpiegādā pica, vai paši atbrauksiet pakaļ? Piegāde maksā 10 eiro"
						,"Par piegādi", JOptionPane.QUESTION_MESSAGE, null, atbilde, atbilde[0]);
			izveletaisIndekss = Arrays.asList(atbilde).indexOf(izvele);
			boolean pakal = (izveletaisIndekss==0) ? false : true;
      		if(pakal==false){
      				
      			String[] pilsetas = {"Liepāja", "Grobiņa", "Cimdinieki"};
      			String pilIzvele;
      			pilIzvele = (String)JOptionPane.showInputDialog(null,"Izvelies pilsētu, uz kuru gribi lai piegādā picu!" ,
      					"Pilsētas izvēle",JOptionPane.QUESTION_MESSAGE,null,pilsetas,pilsetas[2]);
      			cena = cena+10;
      			
      				do{
      			adrese = JOptionPane.showInputDialog("Labi, kāda ir jūsu adrese?");
      				}while(adrese.length()<=4);
      				
      				
      			JOptionPane.showMessageDialog(null, "Tātad, veiksim piegādi uz "+pilIzvele+" "+adrese+"",
      					"Informācija",JOptionPane.INFORMATION_MESSAGE);
      			
      			
      			String[] picas = {"Siera picu", "Veģitāro picu", "Peperoni picu","Havaiešu picu","Šķiņķa picu"};
      			String picIzvele;
      			picIzvele = (String)JOptionPane.showInputDialog(null,"Kādu picu jūs sūtīsiet?  Siera pica: no 4 e/gab, Veģitārā pica: no 4e/gab,"
      					+ "Peperoni pica: no 5e/gab, Havaiešu pica: no 5e/gab, Šķiņķa pica: no 6e/gab",
      					"Picas izvēle",JOptionPane.QUESTION_MESSAGE,null,picas,picas[4]);
      			
      			
      			int cenaPic;
      			
      			if(picIzvele=="Siera picu"){
      				cenaPic=4;
      			}else if(picIzvele=="Veģitāro picu"){
      				cenaPic=4;
      			}else if(picIzvele=="Peperoni picu"){
      				cenaPic=5;
      			}else if(picIzvele=="Havaiešu picu"){
      				cenaPic=5;
      			}else if(picIzvele=="Šķinķa picu"){
      				cenaPic=6;
      			}
      			
      			
      			
      			String[] picuLiel = {"Mazā ir 25cm, un cena ir tāda paša", "Vidējā ir 35cm, bet cena pieaug pa 3 eiro gabalā",
					"Lielā ir 50cm, bet cena pieaug pa 5 eiro gabalā"};
      			String picLIzvele;
      			picLIzvele = (String)JOptionPane.showInputDialog(null,"Cik liela būs jūsu pica?" ,
      					"Picas lieluma izvēle",JOptionPane.QUESTION_MESSAGE,null,picuLiel,picuLiel[2]);
      			
      			
      			
      			int cenaPicLiel;
      			
      			if(picLIzvele=="Mazā ir 25cm, un cena ir tāda paša"){
      				cenaPicLiel=0;
      			}else if(picLIzvele=="Vidējā ir 35cm, bet cena pieaug pa 3 eiro gabalā"){
      				cenaPicLiel=3;
      			}else if(picLIzvele=="Lielā ir 50cm, bet cena pieaug pa 5 eiro gabalā"){
      				cenaPicLiel=5;
      			}
      			
      			String exDz="";
      			
      			exDz = JOptionPane.showInputDialog(null,"Cik piedevas gribēsiet? Par katru ir jāmaksā 1 eiro!");
      			Integer.parseInt(exDz);
      			int i;
      			do{
      			for(i=0; exDz.length()>=i;i++){
      			String[] extra = {"Siers", "Gaļa", "Peperoni","Sīpoli","Mērce","Sēnes","Zaļumi"};
      			String exIzv;
      			exIzv = (String)JOptionPane.showInputDialog(null,"Kādas peidevas jūs gribēsiet? Par piedevu jāmaksā 1 eiro!" ,
      					"Picas piedevu izvēle",JOptionPane.QUESTION_MESSAGE,null,extra,extra[6]);
      			}
      			}while(exDz.length()==i);
      			
      			
      			
      			int cenaPicEx;
      			cenaPicEx=1*exDz.length();
      			
      			JOptionPane.showMessageDialog(null, cenaPicEx);
      			
      			
      			
      			String[] daudzumss = {"1", "2", "3","4","5","6","7","8","9","10"};
      			String daudz;
      			daudz = (String)JOptionPane.showInputDialog(null,"Cik picas jūs gribēsiet?" ,
      					"Picas daudzuma izvēle",JOptionPane.QUESTION_MESSAGE,null,daudzumss,daudzumss[9]);
      			
      			
      			
      			
      			
      		}else{
      				
      			adrese = "Pašsavākšana picērijā";
      			
      			String[] picas = {"Siera picu", "Veģitāro picu", "Peperoni picu","Havaiešu picu","Šķiņķa picu"};
      			String picIzvele;
      			picIzvele = (String)JOptionPane.showInputDialog(null,"Kādu picu jūs sūtīsiet?  Siera pica: no 4 e/gab, Veģitārā pica: no 4e/gab,"
      					+ "Peperoni pica: no 5e/gab, Havaiešu pica: no 5e/gab, Šķiņķa pica: no 6e/gab",
      					"Picas izvēle",JOptionPane.QUESTION_MESSAGE,null,picas,picas[4]);
      			
      			
      			
      			String[] picuLiel = {"Mazā ir 25cm, un cena ir tāda paša", "Vidējā ir 35cm, bet cena pieaug pa 3 eiro gabalā",
      					"Lielā ir 50cm, bet cena pieaug pa 5 eiro gabalā"};
      			String picLIzvele;
      			picLIzvele = (String)JOptionPane.showInputDialog(null,"Cik liela būs jūsu pica?" ,
      					"Picas lieluma izvēle",JOptionPane.QUESTION_MESSAGE,null,picuLiel,picuLiel[2]);
      			
      			
      			String[] extra = {"Siers", "Gaļa", "Peperoni","Sīpoli","Mērce","Sēnes","Zaļumi"};
      			String exIzv;
      			exIzv = (String)JOptionPane.showInputDialog(null,"Kādas peidevas jūs gribēsiet? Par piedevu jāmaksā 1 eiro!" ,
      					"Picas piedevu izvēle",JOptionPane.QUESTION_MESSAGE,null,extra,extra[6]);
      			
      			
      			
      			String[] daudzumss = {"1", "2", "3","4","5","6","7","8","9","10"};
      			String daudz;
      			daudz = (String)JOptionPane.showInputDialog(null,"Cik picas jūs gribēsiet?" ,
      					"Picas daudzuma izvēle",JOptionPane.QUESTION_MESSAGE,null,daudzumss,daudzumss[9]);
      				
      		
      		}

				break;
			
				
				
				
				
				
				case"Apskatīt klienta informāciju":
					if(vards.length()==0){
						JOptionPane.showMessageDialog(null, "No sākuma ir jādabūn klients!");
					}else{
					JOptionPane.showMessageDialog(null, "\nKlienta vārds: "+vards+"\nKlienta telefona nummurs: "+telNr+"\nKlienta adrese: "+adrese+
							"\nKlientam būs jāmaksā: "+cena);
					}
					break;
				
				
		
				
				case"Nodot picu klientam":
					
					if(cena==0){
						JOptionPane.showMessageDialog(null, "Vēl nav apreiķināts cik klientam būs jāmaksā!","Brīdinājums",JOptionPane.WARNING_MESSAGE);
					}else{
						
						
						
				}
					
					
					break;
			
					
					
					
				case"Apskatīties šodienas peļņu":
				
				JOptionPane.showMessageDialog(null, "Šodienas peļņa ir: "+pelna);
				
					break;
				
				
				
				
				case"Beigt darbu":
					
					JOptionPane.showMessageDialog(null, "Šodeinai darbu beidzam, un šodein esat nopelnījuši "+pelna+" eiro", "Informācija",JOptionPane.INFORMATION_MESSAGE);
					
					break;
			
					
					
		
			}
		}while(!izvele.equalsIgnoreCase("Beigt darbu"));
		
	}
}
