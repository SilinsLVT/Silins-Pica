package picerija;



public class Picas_pircejs {

	private String vards;
	private int telNr;
//	private String kadPic;
//	private String cikPic;
	private String adrese;
	
	public Picas_pircejs(String vards, int telNr,String adrese){
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
	public int dabuttelNr(){
		return telNr;
	}
	public String dabutadresi(){
		return adrese;
	}
}
