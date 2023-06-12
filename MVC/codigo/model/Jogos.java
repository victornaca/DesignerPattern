package model;

public class Jogos {
	
	private String nome;
	private int anoLancamento;
	
	public Jogos(String n, int a){
		nome = n;
		anoLancamento = a;
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getAnoLancamento(){
		return anoLancamento;
	}
	
	public boolean matches(Jogos j){
		if(!nome.equals(j.nome)) return false;
		if(anoLancamento!=j.anoLancamento) return false;
		return true;
	}

}
