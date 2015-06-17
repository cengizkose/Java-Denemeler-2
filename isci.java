package ornekler2;

public class isci {
	String ad;
	String soyad;
	int maas;
	String sehir;
	String gorev;
	public isci(String ad, String soyad, int maas, String sehir, String gorev){
		this.ad=ad;
		this.soyad=soyad;
		this.maas=maas;
		this.sehir=sehir;
		this.gorev=gorev;	
	}
	public static void main(String [] args){
		isci nesne=new isci("cengiz","kose",2100,"istanbul","yazýlým mühendisi");
		System.out.println(nesne.ad);
		System.out.println(nesne.soyad);
		System.out.println(nesne.maas);
		System.out.println(nesne.sehir);
		System.out.println(nesne.gorev);
	}
}