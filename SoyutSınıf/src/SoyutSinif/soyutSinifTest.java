package SoyutSinif;

public class soyutSinifTest {
	public static void main(String[] args) {
		daire d=new daire();
		ucgen u=new ucgen();
		dikdortgen dik=new dikdortgen();
		
		d.bilgi(5.0);
		System.out.print(d.isimGetir()+" : ");
		System.out.println(d.alanHesap());
		
		u.bilgi(5.0,3.0);
		System.out.print(u.isimGetir()+" : ");
		System.out.println(u.alanHesap());
		
		dik.bilgi(5.0,4.0);
		System.out.print(dik.isimGetir()+" : ");
		System.out.println(dik.alanHesap());
	}

}
