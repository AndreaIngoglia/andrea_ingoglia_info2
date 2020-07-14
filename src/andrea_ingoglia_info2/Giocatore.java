package andrea_ingoglia_info2;

import java.util.Vector;

public class Giocatore {
	
	String nome; 
	Vector <Personaggio> personaggi= new Vector <Personaggio>();
	//L'univocità del nome del personaggio la controllo quando viene inserita all'interno del Vector.
	
	
	Giocatore(String nome){
		this.nome= nome;
	}
	
	

}
