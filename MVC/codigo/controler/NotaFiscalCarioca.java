package controler;

import view.View;

public class NotaFiscalCarioca implements Nota{

	private View view;
	
	public void setV(View newView){
		view = newView;
	}
	
	public void emitirNota(){
		view.imprimirDadosJogos();
		view.imprimirNotaPaulista();
	}
	
}
