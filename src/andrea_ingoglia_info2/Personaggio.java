package andrea_ingoglia_info2;

abstract class Personaggio implements Comparable <Personaggio>, MetodiPersonaggi{
	
	public String ID; 
	static int numeroProgressivo = 0; 
	String nomePersonaggio; 
	
	//L'unica scelta che il giocatore può effettuare è la scelta del TIPO di personaggio. 
	//Per evitare ID uguali il numeroProgressivo viene assegnato automaticamente.
	
	Personaggio(String selezione, String nome){
		
		switch(selezione) {
		
		case "W" : ID = "W" + numeroProgressivo ++; this.nomePersonaggio = nome;
		System.out.println("Hai creato un Guerriero "+ this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome; break;
		
		case "M" : ID = "M" + numeroProgressivo ++;  this.nomePersonaggio = nome;
		System.out.println("Hai creato un Mago "+ this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome; break;
		
		case "S" : ID = "S" + numeroProgressivo++; this.nomePersonaggio = nome;
		System.out.println("Hai creato un Saggio " + this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome; break;
		
		case "C" : ID = "C" + numeroProgressivo++; this.nomePersonaggio = nome;
		System.out.println("Hai creato un commerciante " + this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome;  break; 
		
		default : System.out.println("Personaggio non creato"); break;
		
		}
	}

	public String toString() {
		return this.nomePersonaggio;
	}
	
	
	//Il confronto tra personaggi viene fatto in base al nome (ordine alfabetico)
	
	@Override
	public int compareTo(Personaggio o) {
		return this.nomePersonaggio.compareTo(o.nomePersonaggio);
		
	}
	
	
	//Metodo per consentire ai personaggi di combattere
	//Il vincitore viene decretato sulla base del punteggio FORZA maggiore
	
	public void combatti(Personaggio avversario) {
		
		if(this.Forza()> avversario.Forza()) {
			System.out.println(this.toString() + " ha vinto contro " + avversario.toString());
		
		}else {
			
			System.out.println(avversario.toString() + " ha vinto contro " + this.toString());

		}
	}

}
