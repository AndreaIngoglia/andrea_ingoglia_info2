package andrea_ingoglia_info2;

public class Mago extends Personaggio implements MetodiPersonaggi {
	
	final int MAX = 10;
	final int MAX_alloro = 2;
	int numeroCasuale; 

	private int basilico; 
	private int alloro;
	private int rosmarino;
	private int muschio;
	
	
	
	Mago(char selezione, String nome) {
		super(selezione, nome);
		
		basilico = 0;
		alloro= 0; 
		rosmarino = 0;
		muschio = 0;
	}
	
	
	@Override
	public int Forza() {
		
		if(basilico > 4) return 10;
		else return 6;
	}

	@Override
	public void Aumenta() {
		//Bisogna aumentare una spezia a caso.
		//Creo ogni volta un numero casuale a seconda del quale aumento una spezia a caso.
		numeroCasuale = (int) Math.random()*4;
		
		switch(numeroCasuale) {
		
		case 0: 
			if(basilico < MAX) {
				basilico ++ ; 
				System.out.println("Hai aumentato la quantità di basilico: " + basilico);
				}break;
		case 1: 
			if(alloro < MAX_alloro) {
				alloro ++ ; 
				System.out.println("Hai aumentato la quantità di alloro: " + alloro);
				}break;
			
		case 2: 
			
			if(rosmarino < MAX) {
				rosmarino ++ ; 
				System.out.println("Hai aumentato la quantità di rosmarino: " + rosmarino);
				}break;
		case 3: 
			
			if(muschio < MAX) {
				muschio ++ ; 
				System.out.println("Hai aumentato la quantità di muschio: " + muschio);
				}break;	
		}
	}


	public String getID() {
		return this.ID;
	}
}
