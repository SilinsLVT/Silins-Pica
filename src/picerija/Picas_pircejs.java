package picerija;



public class Picas_pircejs {

	private String vards;
	private String telNr;
	private String adrese;
	
	public Picas_pircejs(String vards, String telNr,String adrese){
		this.vards = vards;
		this.telNr = telNr;
		this.adrese = adrese;
	}
	
	
	public Picas_pircejs(Picas_pircejs kadspircejs){
		this.vards = kadspircejs.dabutvardu();
		this.telNr = kadspircejs.dabuttelNr();
		this.adrese = kadspircejs.dabutadresi();
		

	}
	
	public String dabutvardu(){
		return vards;
	}
	public String dabuttelNr(){
		return telNr;
	}
	public String dabutadresi(){
		return adrese;
	}
	public String izvadit(){
		 return "Vards: "+dabutvardu()
		 +"\nTelefona nummurs: +371 "+dabuttelNr()
		 +"\nAdrese: "+dabutadresi();
}
}
