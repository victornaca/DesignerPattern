package controler;

import view.View;

public class SemNotaCarioca implements Nota{
	
	private View view;
	
	public void setV(View newView){
		view = newView;
	}
	
	public void emitirNota(){
		view.imprimirDadosJogos();
	}

}
