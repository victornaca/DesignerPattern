package math.obserble.bertori;

import java.util.ArrayList;
import java.util.List;

public class VerificadorHumor {
    private Aluno aluno;
    private List<Observador> observadores;

    public VerificadorHumor(Aluno aluno) {
        this.aluno = aluno;
        this.observadores = new ArrayList<Observador>();
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }
    
    public void verificarHumor() {
        String[] humores = {"triste", "neutro", "feliz"};
        int indiceHumorAleatorio = (int) (Math.random() * humores.length);
        String humorAleatorio = humores[indiceHumorAleatorio];
        aluno.setHumor(humorAleatorio);
        for (Observador observador : observadores) {
        	observador.atualizar(aluno);
        }
    }
}
