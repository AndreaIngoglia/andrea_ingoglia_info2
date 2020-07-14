package andrea_ingoglia_info2;

public class Commerciante extends Personaggio implements MetodiPersonaggi {

	private int libri; 
	private double monete; 
	
	Commerciante(char selezione, String nome) {
		super(selezione, nome);
		
		libri = 0;
		monete =0;
	}
	
	
	
	@Override
	public int Forza() {
		
		if(monete >= 5000000 || libri >= 10) return 10;
		else return 2;
	}

	@Override
	public void Aumenta() {
		//Non riesco a calcolare il giorno corrente; 
		//Incremento il numero di monete
		monete+= 1000000;	

		//Incremento comunque il numero di libri
		
		libri+=1; 
		
		System.out.println("Il commerciante è stato potenziato: monete " + monete + " | libri: " + libri);
		
		
	}


	public String getID() {
		return this.ID;
	}
}
