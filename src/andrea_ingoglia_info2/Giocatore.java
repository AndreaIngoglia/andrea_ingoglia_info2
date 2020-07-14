package andrea_ingoglia_info2;

import java.util.Vector;

import prog.io.FileInputManager;

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
	
	public void Tradisci (String ID_traditore, Giocatore destinazione) {
		//Controllo che il personaggio da trasferire sia nella lista dei  personaggi
		
		for(Personaggio cur: personaggi) {
			
			if(cur instanceof Guerriero) {
				
				if(((Guerriero) cur).getID().equals(ID_traditore)) {
				personaggi.remove(cur);
				destinazione.personaggi.add(cur);
				return;
				}
				
			}else if(cur instanceof Mago) {
				
				if(((Mago) cur).getID().equals(ID_traditore)) {
				personaggi.remove(cur);
				destinazione.personaggi.add(cur);
				return;

				}
				
			}else if(cur instanceof Commerciante) {
				
				if(((Commerciante) cur).getID().equals(ID_traditore)) {
				personaggi.remove(cur);
				destinazione.personaggi.add(cur);
				return;
				}
				
			}else if(cur instanceof Saggio) {

				if(((Saggio) cur).getID().equals(ID_traditore)) {
				personaggi.remove(cur);
				destinazione.personaggi.add(cur);
				return;

				}

			}
		}
		
		System.out.println("Il personaggio non è presente nella lista");
	}
	

	public int disparita() {
		
		//Stampo i punti forza totali del giocatore
		
		int somma = 0; 
		
		for(Personaggio cur: personaggi) {
			
			if(cur instanceof Guerriero) {
				somma+= ((Guerriero) cur).Forza();
				
			}else if(cur instanceof Mago) {
				somma+= ((Mago) cur).Forza();

			}else if(cur instanceof Commerciante) {
				somma+= ((Commerciante) cur).Forza();
			
			}else if(cur instanceof Saggio) {
				somma+= ((Saggio) cur).Forza();
			}

		}
		
		return somma;
		
	}
	
	
	
	public void caricaDaFile(String path) {
		
		String righe;
		String campi[] = new String[5];
		
		FileInputManager in = new FileInputManager(path);
		
		do {
			righe = in.readLine();
			if (righe != null) {
				
				campi = righe.split(",");
				String scelta = campi[0];
				
				String nome = campi[1];
				
				
				if (scelta.equals("W")){
					
					Personaggio nuovo = (Personaggio) new Guerriero("W", nome);
					this.aggiungiPersonaggio(nuovo);
				
				
				} else if(scelta.equals("M")) {
					
					Personaggio nuovo = (Personaggio) new Mago("M", nome);
					this.aggiungiPersonaggio(nuovo);
				
				
				}else if(scelta.equals("S")) {
					
					Personaggio nuovo = (Personaggio) new Saggio("S", nome);
					this.aggiungiPersonaggio(nuovo);	
				
				}else if(scelta.equals("C")) {
					
					Personaggio nuovo = (Personaggio) new Commerciante("C", nome);
					this.aggiungiPersonaggio(nuovo);
				}
		}
			
	} while (righe != null);

	}
	






}
	
		
	
	
	
	
