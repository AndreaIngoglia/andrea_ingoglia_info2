package andrea_ingoglia_info2;

public class Guerriero extends Personaggio implements MetodiPersonaggi{
	
	boolean spada; 
	
	Guerriero(char selezione, String nome) {
		
		super(selezione, nome);
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
			
			System.out.println("Il Guerriero " + super.ID + " " + super.nomePersonaggio+ " ha conquistato una spada!");
		}else {
			
			System.out.println("Il Guerriero " + super.ID + " " + super.nomePersonaggio+ " ha già una spada! "); 
		}
	}
	
	
	
	
	
	
}
