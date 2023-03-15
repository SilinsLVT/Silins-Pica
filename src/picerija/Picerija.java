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
		
		
		String[] opcijas = {"Sakt darbu","Apskatīt klienta informāciju","Apreiķināt sūtijuma cenu",
				"Nodot picu klientam","Apskatīties šodienas peļņu", "Beigt darbu"};
		String izvele;
		
		
		do{
		izvele = (String)JOptionPane.showInputDialog(null,"Izvelies darbibu" , "Darbibas izvele",JOptionPane.QUESTION_MESSAGE,null,opcijas,opcijas[5]);
			
		switch(izvele){
			
			
		case"Sakt darbu":
				
			JOptionPane.showMessageDialog(null, "Jums zvana klients", "Informācija",JOptionPane.INFORMATION_MESSAGE);
				
			do{
				telNr = JOptionPane.showInputDialog("Klienta nummurs... ");
 
			}while (!(telNr.startsWith("2") && telNr.length() == 8));
				
			vards = JOptionPane.showInputDialog("Klientu sauc...");
				
			izvele = (String)JOptionPane.showInputDialog(null, "Vai jums būs jāpiegādā pica, vai paši atbrauksiet pakaļ?"
					+ " Piegāde Liepājā maksā: 10 eiro, Cimdiniekos: 15 eiro, Grobiņā: 20 eiro ",
						"Par piegādi", JOptionPane.QUESTION_MESSAGE, null, atbilde, atbilde[0]);
			izveletaisIndekss = Arrays.asList(atbilde).indexOf(izvele);
      		boolean pakal = (izveletaisIndekss==0) ? false : true;
      		if(pakal==false){
      				
      			String[] pilsetas = {"Liepāja", "Grobiņa", "Cimdinieki"};
      			String pilIzvele;
      			pilIzvele = (String)JOptionPane.showInputDialog(null,"Izvelies pilsētu, uz kuru gribi lai piegādā picu!" ,
      					"Pilsētas izvēle",JOptionPane.QUESTION_MESSAGE,null,pilsetas,pilsetas[2]);
      				
      			adrese = JOptionPane.showInputDialog("Labi, kāda ir jūsu adrese?");
      				
      			JOptionPane.showMessageDialog(null, "Tātad, veiksim piegādi uz "+pilIzvele+" "+adrese+" ielas",
      					"Informācija",JOptionPane.INFORMATION_MESSAGE);
      			
      			
      			String[] picas = {"Siera picu", "Veģitāro picu", "Peperoni picu","Havaiešu picu","Šķiņķa picu"};
      			String picIzvele;
      			picIzvele = (String)JOptionPane.showInputDialog(null,"Kādu picu jūs sūtīsiet?  Siera pica: no 4 e/gab, Veģitārā pica: no 4e/gab,"
      					+ "Peperoni pica: no 5e/gab, Havaiešu pica: no 5e/gab, Šķiņķa pica: no 6e/gab",
      					"Picas izvēle",JOptionPane.QUESTION_MESSAGE,null,picas,picas[4]);
      			
      			
      			String[] picuLiel = {"Mazā ir 25cm, un cena ir tāda paša", "Vidējā ir 35cm, bet cena pieaug pa 3 eiro",
      					"Lielā ir 50cm, bet cena pieaug pa 5 eiro"};
      			String picLIzvele;
      			picLIzvele = (String)JOptionPane.showInputDialog(null,"Cik liela būs jūsu pica?" ,
      					"Picas lieluma izvēle",JOptionPane.QUESTION_MESSAGE,null,picuLiel,picuLiel[2]);
      			
      			
      			String[] extra = {"Siers", "Gaļa", "Peperoni","Sīpoli","Mērce","Sēnes","Zaļumi"};
      			String exIzv;
      			exIzv = (String)JOptionPane.showInputDialog(null,"Kādas peidevas jūs gribēsiet?" ,
      					"Picas piedevu izvēle",JOptionPane.QUESTION_MESSAGE,null,extra,extra[6]);
      			
      			
      			
      			String[] daudzumss = {"1", "2", "3","4","5","6","7","8","9","10"};
      			String daudz;
      			daudz = (String)JOptionPane.showInputDialog(null,"Cik picas jūs gribēsiet?" ,
      					"Picas daudzuma izvēle",JOptionPane.QUESTION_MESSAGE,null,daudzumss,daudzumss[9]);
      			
      			
      			
      			
      			
      		}else{
      				
      			adrese = "pašsavākšana picērijā";
      			
      			String[] picas = {"Siera picu", "Veģitāro picu", "Peperoni picu","Havaiešu picu","Šķiņķa picu"};
      			String picIzvele;
      			picIzvele = (String)JOptionPane.showInputDialog(null,"Kādu picu jūs sūtīsiet?  Siera pica: no 4 e/gab, Veģitārā pica: no 4e/gab,"
      					+ "Peperoni pica: no 5e/gab, Havaiešu pica: no 5e/gab, Šķiņķa pica: no 6e/gab",
      					"Picas izvēle",JOptionPane.QUESTION_MESSAGE,null,picas,picas[4]);
      			
      			
      			String[] picuLiel = {"Mazā ir 25cm, un cena ir tāda paša", "Vidējā ir 35cm, bet cena pieaug pa 3 eiro",
      					"Lielā ir 50cm, bet cena pieaug pa 5 eiro"};
      			String picLIzvele;
      			picLIzvele = (String)JOptionPane.showInputDialog(null,"Cik liela būs jūsu pica?" ,
      					"Picas lieluma izvēle",JOptionPane.QUESTION_MESSAGE,null,picuLiel,picuLiel[2]);
      			
      			
      			String[] extra = {"Siers", "Gaļa", "Peperoni","Sīpoli","Mērce","Sēnes","Zaļumi"};
      			String exIzv;
      			exIzv = (String)JOptionPane.showInputDialog(null,"Kādas peidevas jūs gribēsiet?" ,
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
					JOptionPane.showMessageDialog(null, "\nKlienta vārds: "+vards+"\nKlienta telefona nummurs: "+telNr+"\nKlienta adrese: "+adrese);
					}
					break;
				
				
				case"Apreiķināt sūtijuma cenu":
					if(vards.length()==0){
						JOptionPane.showMessageDialog(null, "No sākuma ir jādabūn klients!");
					}else{
				
						
					
					}
				break;
				
				
				case"Nodot picu klientam":
					
					if(cena==0){
						JOptionPane.showMessageDialog(null, "Vēl nav apreiķināts cik klientam būs jāmaksā!","Brīdinājums",JOptionPane.WARNING_MESSAGE);
					}else{
						
						
						
				}
					
					
					break;
			
				case"Apskatīties šodienas peļņu":
				
				
				
					break;
				
				
				
				
				case"Beigt darbu":
					
					JOptionPane.showMessageDialog(null, "Šodeinai darbu beidzam, un šodein esat nopelnījuši "+pelna+" eiro", "Informācija",JOptionPane.INFORMATION_MESSAGE);
					
					break;
			
					
					
		
			}
		}while(!izvele.equalsIgnoreCase("Beigt darbu"));
		
	}
}
