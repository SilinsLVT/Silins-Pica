package picerija;

public class pica {

private String picIzvele;
private String picLIzvele;
private String exDz;
private String exIzv;
private String daudz;
private Double cena;

	public pica(String picIzvele, String picLIzvele,String exDz,String exIzv,String daudz,Double cena ){
		
	}
	
	public pica(pica kadaPica){
		
		this.picIzvele = kadaPica.dabutpicIzvele();
		this.picLIzvele = kadaPica.dabutpicLIzvele();
		this.exDz = kadaPica.dabutexDz();
		this.exIzv = kadaPica.dabutexIzv();
		this.daudz = kadaPica.dabutdaudz();
		this.cena = kadaPica.dabutcena();
		
	}
	
	
	public String dabutpicIzvele(){
		return picIzvele;
	}
	
	public String dabutpicLIzvele(){
		return picLIzvele;
	}
	
	public String dabutexDz(){
		return exDz;
	}
	
	public String dabutexIzv(){
		return exIzv;
	}
	
	public String dabutdaudz(){
		return daudz;
	}
	
	public Double dabutcena(){
		return cena;
	}
	public String izvaditPicu(){
		 return "Kada pica: "+dabutpicIzvele()
		 +"\nCik liela ir pica: "+dabutpicLIzvele()
		 +"\nPiedevu daudzums: "+dabutexDz()
		 +"\nKadas piedevas: "+dabutexIzv()
		 +"\nCik daudzas picas: "+dabutdaudz()
		 +"\nCik viss šis izmaksās: "+dabutcena();
		 
	}
}
