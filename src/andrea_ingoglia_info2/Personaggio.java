package andrea_ingoglia_info2;

abstract class Personaggio implements MetodiPersonaggi {
	
	String ID; 
	static int numeroProgressivo = 0; 
	String nomePersonaggio; 
	
	//L'unica scelta che il giocatore può effettuare è la scelta del TIPO di personaggio. 
	//Per evitare ID uguali il numeroProgressivo viene assegnato automaticamente.
	//Non ho creato eccezioni perché non vanno bene con il costruttore.
	
	Personaggio(char selezione, String nome){
		
		switch(selezione) {
		case 'W' : 	ID = "" + selezione + numeroProgressivo;
		System.out.println("Hai creato un Guerriero"); this.nomePersonaggio= nome; break;
		case 'M' : ID = "" + selezione + numeroProgressivo; 
		System.out.println("Hai creato un Mago"); this.nomePersonaggio= nome; break;
		case 'S' : ID = "" + selezione + numeroProgressivo; 
		System.out.println("Hai creato un Saggio"); this.nomePersonaggio= nome; break;
		case 'C' : ID = "" + selezione + numeroProgressivo; 
		System.out.println("Hai creato un commerciante"); this.nomePersonaggio= nome;  break; 
		
		default : System.out.println("Personaggio non creato"); numeroProgressivo ++ ; break;
		
		}
	}

	
	@Override
	public int Forza() {
		return 0;
	}

	@Override
	public void Aumenta() {
		
	}

}
