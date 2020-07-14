package andrea_ingoglia_info2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Giocatore <Personaggio extends Comparable <Personaggio>>{
	
	String nome; 
	Vector <Personaggio> personaggi= new Vector <Personaggio>();
	//L'univocità del nome del personaggio la controllo quando viene inserita all'interno del Vector.
	
	
	Giocatore(String nome){
		this.nome= nome;
	}
	
	
	public void aggiungiPersonaggio(Personaggio o) {
		
		//Controllo che il personaggio da inserire non abbia lo stesso nome di altri personaggi già presenti
		
		for(Personaggio cur : personaggi) {
			//Confronta i nomi.
			
			if(cur.equals(o)){
				
				System.out.println("Il personaggio " + o.toString()+ " ha lo stesso nome di un personaggio già presente nel team - Non è possibile inserirlo");
				break;
			}
		}
		
		//Se il ciclo non si è interrotto prima è possibile inserirlo
		
		personaggi.add(o);
		System.out.println(o.toString()+ " fa parte del Team");
	}
	
	public void stampaPerNome() {
		
		System.out.println(personaggi.toString());
		
	}
	
}
