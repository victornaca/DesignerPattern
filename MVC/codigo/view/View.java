package view;

import java.util.List;

import controler.Nota;
import model.Jogos;

public class View implements Observer{
	
	private Nota n;
	private List listaJogos;
	
	public void setN(Nota nota){
		n = nota;
	}
	
	public void update(List l){
		listaJogos = l;
		n.emitirNota();	
	}
	
	public void imprimirDadosJogos(){
		if(!listaJogos.isEmpty()){
			for(Object i: listaJogos){
				Jogos j = (Jogos)i;
				System.out.println(j.getNome()+" "+j.getAnoLancamento());
			}
		}
		
	}
	
	public void imprimirNotaPaulista(){
		System.out.println("NOTA FISCAL CARIOCA");
		System.out.println("Dados da nota carioca...");
		System.out.println("CPF ....");
	}

}
