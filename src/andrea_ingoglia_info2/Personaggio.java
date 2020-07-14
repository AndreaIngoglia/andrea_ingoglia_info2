package andrea_ingoglia_info2;

abstract class Personaggio implements Comparable <Personaggio>, MetodiPersonaggi{
	String ID; 
	static int numeroProgressivo = 0; 
	String nomePersonaggio; 
	
	//L'unica scelta che il giocatore può effettuare è la scelta del TIPO di personaggio. 
	//Per evitare ID uguali il numeroProgressivo viene assegnato automaticamente.
	
	
	Personaggio(char selezione, String nome){
		
		switch(selezione) {
		
		case 'W' : ID = "W" + numeroProgressivo ++; 
		System.out.println("Hai creato un Guerriero "+ this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome; break;
		
		case 'M' : ID = "M" + numeroProgressivo ++; 
		System.out.println("Hai creato un Mago "+ this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome; break;
		
		case 'S' : ID = "S" + numeroProgressivo++; 
		System.out.println("Hai creato un Saggio " + this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome; break;
		
		case 'C' : ID = "C" + numeroProgressivo++; 
		System.out.println("Hai creato un commerciante " + this.ID + " "+ this.nomePersonaggio); this.nomePersonaggio= nome;  break; 
		
		default : System.out.println("Personaggio non creato"); break;
		
		}
	}
	
	

	public String getName() {
		
		return this.nomePersonaggio;
	}
	
	public String getID() {
		
		return this.ID;
	}

	@Override
	public int compareTo(Personaggio o) {
		return this.nomePersonaggio.compareTo(o.nomePersonaggio);
		
	}
	
	
	
	
	
	
	
	
	

}
