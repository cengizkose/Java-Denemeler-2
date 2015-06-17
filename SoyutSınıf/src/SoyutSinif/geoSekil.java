package SoyutSinif;

public abstract class geoSekil {

	private String isim;
	public void isimBelirle(String isim){
		this.isim=isim; //þeklin ismini belirledim	
	}
public String isimGetir(){
	return this.isim;
}
public abstract double alanHesap();
}