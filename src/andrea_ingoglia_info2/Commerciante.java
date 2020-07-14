package andrea_ingoglia_info2;

import javafx.scene.chart.PieChart.Data;

public class Commerciante extends Personaggio implements MetodiPersonaggi {

	private int libri; 
	private double monete; 
	
	Commerciante(String selezione, String nome) {
		super(selezione, nome);
		
		libri = 0;
		monete =0;
	}
	
	
	
	@Override
	public int Forza() {
		
		if(monete >= 5000000 || libri >= 10) return 10;
		else return 2;
	}

	//Per commerciante è necessario incrementare il numero di monete e il numero di libri 
	//Il numero di libri viene incrementato se la data corrisponde a quella odierna.
	
	@Override
	public void Aumenta() {
		
		monete+= 1000000;
		//Non sono riuscito ad implementare il confronto tra date
		libri+=1; 
		
		System.out.println("Il commerciante è stato potenziato: monete " + monete + " | libri: " + libri);
		
		
	}
	
	public String getID() {
		return this.ID;
	}
}
