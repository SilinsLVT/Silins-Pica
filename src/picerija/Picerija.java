package picerija;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		
		
		double pelna = 0,cena;
		String vards;
		String telNr ="";
		String adrese;
		String[] atbilde = {"Jā, es gribu piegādi uz savu adresi", "Nē, es atbraukšu pats pakaļ"};
		int izveletaisIndekss = 1;
		
		
		String[] opcijas = {"Sakt darbu", "Apskatīties šodienas peļņu", "Beigt darbu"};
		String izvele;
		
		
		do{
		izvele = (String)JOptionPane.showInputDialog(null,"Izvelies darbibu" , "Darbibas izvele",JOptionPane.QUESTION_MESSAGE,null,opcijas,opcijas[2]);
			
		switch(izvele){
			
			
		case"Sakt darbu":
				
			JOptionPane.showMessageDialog(null, "Jums zvana klients", "Informācija",JOptionPane.INFORMATION_MESSAGE);
				
			do{
				telNr = JOptionPane.showInputDialog("Klienta nummurs... ");
 
			}while (!(telNr.startsWith("2") && telNr.length() == 8));
				
			vards = JOptionPane.showInputDialog("Klientu sauc...");
				
			izvele = (String)JOptionPane.showInputDialog(null, "Vai jums bus japiegada pica, vai paši atbrauksiet pakaļ? ",
						"Par piegādi", JOptionPane.QUESTION_MESSAGE, null, atbilde, atbilde[0]);
			izveletaisIndekss = Arrays.asList(atbilde).indexOf(izvele);
      		boolean pakal = (izveletaisIndekss==0) ? false : true;
      		if(pakal==false){
      				
      			String[] pilsetas = {"Liepaja", "Grobiņa", "Cimdinieki"};
      			String pilIzvele;
      			pilIzvele = (String)JOptionPane.showInputDialog(null,"Izvelies pilsētu, uz kuru gribi lai piegādā picu!" ,
      					"Pilsētas izvēle",JOptionPane.QUESTION_MESSAGE,null,pilsetas,pilsetas[2]);
      				
      			adrese = JOptionPane.showInputDialog("Labi, kāda ir jūsu adrese?");
      				
      			JOptionPane.showMessageDialog(null, "Tātad, veiksim piegādi uz "+pilIzvele+" "+adrese+" ielas",
      					"Informācija",JOptionPane.INFORMATION_MESSAGE);
      			
      			
      			String[] picas = {"Siera picu", "Veģitāro picu", "Peperoni picu","Havaiešu picu","Šķiņķa picu"};
      			String picIzvele;
      			picIzvele = (String)JOptionPane.showInputDialog(null,"Kādu picu jūs sūtīsiet?" ,
      					"Picas izvēle",JOptionPane.QUESTION_MESSAGE,null,picas,picas[4]);
      			
      			
      			String[] picuLiel = {"20cm", "25cm", "30cm","35cm","40cm","45cm","50cm"};
      			String picLIzvele;
      			picLIzvele = (String)JOptionPane.showInputDialog(null,"Cik liela būs jūsu pica?" ,
      					"Picas lieluma izvēle",JOptionPane.QUESTION_MESSAGE,null,picuLiel,picuLiel[6]);
      			
      			
      			String[] extra = {"Siers", "Gaļa", "Peperoni","Sīpoli","Mērce","Sēnes","Zaļumi"};
      			String exIzv;
      			exIzv = (String)JOptionPane.showInputDialog(null,"Kādas peidevas jūs gribēsiet?" ,
      					"Picas piedevu izvēle",JOptionPane.QUESTION_MESSAGE,null,extra,extra[6]);
      			
      			
      			String[] daudzumss = {"1", "2", "3","4","5","6","7","8","9","10"};
      			String daudz;
      			daudz = (String)JOptionPane.showInputDialog(null,"Cik picas jūs gribēsiet?" ,
      					"Picas daudzuma izvēle",JOptionPane.QUESTION_MESSAGE,null,daudzumss,daudzumss[9]);
      		}else{
      				
      			String[] picas = {"Siera picu", "Veģitāro picu", "Peperoni picu","Havaiešu picu","Šķiņķa picu"};
      			String picIzvele;
      			picIzvele = (String)JOptionPane.showInputDialog(null,"Kādu picu jūs sūtīsiet?" ,
      					"Picas izvēle",JOptionPane.QUESTION_MESSAGE,null,picas,picas[4]);
      			
      			
      			String[] picuLiel = {"20cm", "25cm", "30cm","35cm","40cm","45cm","50cm"};
      			String picLIzvele;
      			picLIzvele = (String)JOptionPane.showInputDialog(null,"Cik liela būs jūsu pica?" ,
      					"Picas lieluma izvēle",JOptionPane.QUESTION_MESSAGE,null,picuLiel,picuLiel[6]);
      			
      			
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
			
				
				
			
			
			case"Apskatīties šodienas peļņu":
				
				
				
				break;
		
				case"Beigt darbu":
					
					JOptionPane.showMessageDialog(null, "Šodeinai darbu beidzam, un šodein esat nopelnījuši "+pelna+" eiro", "Informācija",JOptionPane.INFORMATION_MESSAGE);
					
					break;
			
					
					
		
			}
		}while(!izvele.equalsIgnoreCase("Beigt darbu"));
		
	}
}
