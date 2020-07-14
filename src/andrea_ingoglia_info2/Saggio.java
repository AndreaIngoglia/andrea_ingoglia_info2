package andrea_ingoglia_info2;

public class Saggio extends Personaggio implements MetodiPersonaggi {
	
	private int libri; 
	
	Saggio(char selezione, String nome) {
		super(selezione, nome);
		
		libri = 0; 
	}

	
	@Override
	public int Forza() {
		
		if(libri >= 10) return 10;
		else return libri;
	}

	@Override
	public void Aumenta() {
		libri ++ ;
		System.out.println("Il Saggio " + super.ID + " " + super.nomePersonaggio + " ha acquisito un libro:  " + libri );
	}
	

	public String getID() {
		return this.ID;
	}

}
