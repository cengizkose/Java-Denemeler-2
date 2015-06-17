package ornekler2;

class SA {
	protected int sayi=7;
	public String ad=" cengiz ";
	public String metod(){
		return ad+sayi;
	}
}

class SB extends SA{
	public String metod(){
		return ad+sayi+ad;
	}
}
public class calistir{
	public static void main(String [] args){
		SB nesne=new SB();
		System.out.println(nesne.metod());
	}
}
