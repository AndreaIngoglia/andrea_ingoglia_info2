package andrea_ingoglia_info2;

public class main {

	public static void main(String[] args) {

		Personaggio franco=  new Guerriero('W', "Franco");
		Personaggio franci = new Guerriero('W',  "giacomo");
		franco.Aumenta();
		franci.Aumenta();
		
		Personaggio mago = new Mago('M', "Maghetto");
		mago.Aumenta();
		mago.Aumenta();
		mago.Aumenta();
		
		
	}

}
