package SoyutSinif;

public class ucgen extends geoSekil {
	
	private double yukseklik;
	private double taban;
	public void bilgi(double yukseklik, double taban){
		isimBelirle("��gen nesnesi");
		this.taban=taban;
		this.yukseklik=yukseklik;
	}
	@Override
	public double alanHesap() {
		return (taban*yukseklik/2);
	}
}