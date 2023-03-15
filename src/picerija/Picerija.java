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
      			
      			JOptionPane.showMessageDialog(null, pakal);
				
				
				
				
				
				
				
				
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
