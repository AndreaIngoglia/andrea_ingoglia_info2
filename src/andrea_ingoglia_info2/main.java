package andrea_ingoglia_info2;

public class main {

	public static void main(String[] args) {

		
		Giocatore andrea = new Giocatore("Andrea");
		
		Personaggio franco=  new Guerriero('W', "Franco");
		Personaggio franci = new Guerriero('W',  "giacomo");
		franco.Aumenta();
		franci.Aumenta();
		franco.Aumenta();
		
		Personaggio mago = new Mago('M', "Maghetto");
		mago.Aumenta();
		mago.Aumenta();
		mago.Aumenta();
		
		Personaggio saggio = new Saggio ('S', "saggio");
		
		System.out.println(saggio.Forza());
		
		saggio.Aumenta();
		System.out.println(saggio.Forza());
		
		andrea.aggiungiPersonaggio(franco);
		andrea.aggiungiPersonaggio(franci);
		andrea.aggiungiPersonaggio(mago);
		andrea.aggiungiPersonaggio(saggio);
		
		andrea.stampaPerNome();





	}

}
