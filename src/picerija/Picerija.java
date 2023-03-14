package picerija;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		
		Boolean pakal = false;
		double pelna = 0,cena;         // jaaaaaaaaaaaamainaaaaaaaa pelnaaaaaaaaaaaaaaa
		String vards;
		String telNr ="";
		String adrese;
		
		
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
