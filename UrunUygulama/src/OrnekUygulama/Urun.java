package OrnekUygulama;

public class Urun {
	String urunAdi;
	int fiyat;
	Urun(String urunAdi, int fiyat){
		this.fiyat=fiyat;
		this.urunAdi=urunAdi;
	}
	void kdv(){
		System.out.println("Kdv Dahil: "+(fiyat+(fiyat*0.18)));
	}
	public static void main(String[] args) {
		teknoloji nesne=new teknoloji("fare",1000,"A4","Optik");
		System.out.println(nesne.fiyat);
		nesne.kdv();
		gida nesne2=new gida("domates",1000,1000,"sebze");
		nesne2.kdv();
	}
}
class teknoloji extends Urun{
	String marka,model;
	teknoloji(String ad, int fiyat, String marka, String model){
		super(ad,fiyat);
		this.marka=marka;
		this.model=model;
	}
	void kdv(){
		System.out.println("Teknoloji - Kdv Dahil: "+(fiyat*1.2));
	}
}
class tekstil extends Urun{
	int beden;
	String turu;
	tekstil(String ad, int fiyat, int beden, String turu){
		super(ad,fiyat);
		this.beden=beden;
		this.turu=turu;
	}
	void kdv(){
		System.out.println("tekstil - Kdv Dahil: "+(fiyat*1.18));
	}
}
class gida extends Urun{
	int gramaj;
	String turu;
	gida(String ad, int fiyat, int gramaj, String turu){
		super(ad,fiyat);
		this.gramaj=gramaj;
		this.turu=turu;
	}
	void kdv(){
		
		System.out.println("gida - Kdv Dahil: "+(fiyat*gramaj/1000)*(1.18));
	}
}
