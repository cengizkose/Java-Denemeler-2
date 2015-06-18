package ornekUygulama;


interface Arayuz1{
	interface Arayuz2{ //arayuz icindeki arayuz
		public void metod2();
	}
	public void metod1();
}
class Sinif1 implements Arayuz1{

	@Override
	public void metod1() {
		System.out.println("Burasý Arayuz1'deki metod1");
	}	
}
class Sinif2 implements Arayuz1.Arayuz2{

	@Override
	public void metod2() {
		System.out.println("Burasý Arayuz2'deki metod2");
	}
}

public class arayuzOrnek {
	
	public static void main(String[] args) {
		Sinif1 s1=new Sinif1();
		s1.metod1();
		Sinif2 s2=new Sinif2();
		s2.metod2();	
	}
}
