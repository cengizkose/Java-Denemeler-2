package ornekler2;

enum Arabalar {
	BMW("mavi"),OPEL("sari"),MERCEDES("kirmizi"),AUDI("siyah");
	public String renk;
	Arabalar (String renk){
		this.renk=renk;
	}		
}
public class EnumDeneme {

	public static void main(String [] args){
		
		for (Arabalar x:Arabalar.values()){
			System.out.print(x.ordinal()+" "); // ordinal() metodu ile indislere ulaşıyoruz
			System.out.print(x.name()+"--"); // Araba isimleri
			System.out.println(x.renk); 	// renkleri
		}
	}

}
