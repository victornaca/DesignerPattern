package model;
import java.util.LinkedList;
import java.util.List;

import view.Observer;

public class Estoque implements Subject{
	
	private List jogos;
	private List observers;
	
	public Estoque(){
		jogos = new LinkedList();
		observers = new LinkedList();
	}
		
	public void registerObserver(Observer o){
		observers.add(o);
	}
		
	public void notifyObservers(List encontrados){
		for(Object i: observers){
			Observer ob = (Observer)i;
			ob.update(encontrados);
		}
	}
	
	public void addJogos(Jogos j){
		jogos.add(j);
	}
	
	public void buscarJogos(Jogos j){
		List encontrados = new LinkedList();
		for(Object i: jogos){
			Jogos jogoEstoque = (Jogos)i;
			if(jogoEstoque.matches(j)) 
				encontrados.add(jogoEstoque);
		}
		notifyObservers(encontrados);
	}

}
