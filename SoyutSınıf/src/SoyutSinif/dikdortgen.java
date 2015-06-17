package SoyutSinif;

public class dikdortgen extends geoSekil {
	private double uzunKenar;
	private double kisaKenar;
	
	public void bilgi(double uzunKenar, double kisaKenar){
		this.kisaKenar=kisaKenar;
		this.uzunKenar=uzunKenar;
		isimBelirle("Dikdörtgen nesnesi");
	}
	@Override
	public double alanHesap(){
		return kisaKenar*uzunKenar;
	}
}