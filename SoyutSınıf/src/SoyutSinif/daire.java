package SoyutSinif;

public class daire extends geoSekil {
	private double yariCap;
	public void bilgi(double yariCap){
		this.yariCap=yariCap;
		isimBelirle("Daire nesnesi");
	}
	@Override
	public double alanHesap(){
		return Math.PI*Math.pow(yariCap,2);
	}
}
