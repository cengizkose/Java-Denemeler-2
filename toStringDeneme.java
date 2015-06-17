package ornekler2;

class sekil {
	int kose;
	int kosegen;
	int icAci;
	sekil(int kose){
		this.kose=kose;
		kosegen=(kose*(kose-3))/2;
		icAci=(180*(kose-2))/kose;
	}
@Override
public String toString(){
	return kose+" koseli duzgun geometrik seklin "+kosegen+" adet köþegeni vardýr. Bir iç açýsý ise "+icAci+ " derecedir.";
	
}
}
public class toStringDeneme {
	public static void main(String [] args){
		sekil geo=new sekil(5);
		
		System.out.println(geo.toString());
	}

}

