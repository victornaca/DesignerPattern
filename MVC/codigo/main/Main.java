package main;
import controler.NotaFiscalCarioca;
import model.Estoque;
import model.Jogos;
import view.View;


public class Main {
	
	public static void main(String[] args) {
		
		Estoque e = new Estoque();
		e.addJogos(new Jogos("Grand Theft Auto: San Andreas", 2004));
		e.addJogos(new Jogos("Duck Hunt", 1984));
		
		View v = new View();
		
		e.registerObserver(v);
		
		NotaFiscalCarioca nfc = new NotaFiscalCarioca();
		
		v.setN(nfc);
		
		nfc.setV(v);
		
		e.buscarJogos(new Jogos("Grand Theft Auto: San Andreas", 2004));		
	}

}
