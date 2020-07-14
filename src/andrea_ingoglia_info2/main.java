package andrea_ingoglia_info2;

public class main {

	public static void main(String[] args) {

		//Main in cui vengono testati i metodi senza lettura da file (Togliere /**/ per verificare)
		
		
		Giocatore giocatore1 = new Giocatore("Andrea");
		
		Giocatore giocatore2 = new Giocatore("Giuseppe");
		
		
		Personaggio guerriero1=  new Guerriero("W", "franco");
		Personaggio guerriero2 = new Guerriero("W",  "giacomo");
		Personaggio mago1=  new Mago("M", "mago");
		Personaggio mago2=  new Mago("M", "magikarp");
		Personaggio saggio1=  new Saggio("S", "gandalf");
		Personaggio saggio2=  new Saggio("S", "silente");
		Personaggio commerciante1=  new Commerciante("C", "paperone");
		
		guerriero1.Aumenta();
		mago1.Aumenta();
		mago1.Aumenta();
		
		saggio1.Aumenta();
		
		
		giocatore1.aggiungiPersonaggio(guerriero1);
		giocatore1.aggiungiPersonaggio(guerriero2);
		giocatore1.aggiungiPersonaggio(mago1);
		giocatore1.aggiungiPersonaggio(mago2);
		giocatore1.aggiungiPersonaggio(saggio2);
		giocatore1.aggiungiPersonaggio(commerciante1);
		
		System.out.println("Il team di Giocatore1: " );
		giocatore1.stampaPerNome();
		
		System.out.println("Disparità di giocatore1: " + giocatore1.disparita());		
		
		giocatore1.Tradisci("W0", giocatore2);
		
		System.out.println("Il team di Giocatore2: " );
		giocatore2.stampaPerNome();
		
		System.out.println("Disparità di giocatore2: " + giocatore2.disparita());

		//Faccio lottare i personaggi
		
		saggio1.combatti(commerciante1);
		guerriero2.combatti(guerriero1);
		
		System.out.println("PROVA LETTURA DA FILE");
		
		giocatore1.caricaDaFile("path.txt");
		
		
	
		

	}

}
