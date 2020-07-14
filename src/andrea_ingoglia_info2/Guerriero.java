package andrea_ingoglia_info2;

public class Guerriero extends Personaggio implements MetodiPersonaggi{
	
	boolean spada; 
	
	Guerriero(char selezione, String nome) {
		
		super(selezione, nome);
		ID = "W" + numeroProgressivo; 
		spada = false;
	}

	@Override
	public int Forza() {
		
		if(spada) return 6;
		
		else return 0;
	}

	@Override
	public void Aumenta() {
		
		if(spada == false) {
			
			spada = true; 
			System.out.println("Il guerriero ha acquisito la spada");
		}else {
			
			System.out.println("Upgrade già effettuato");
		}
		
	}
	
	
	
	
	
}
