package math.obserble.bertori;

public class Coordenador implements Observador {
    private String nome;

    public Coordenador(String nome) {
        this.nome = nome;
    }

    public void atualizar(Aluno aluno) {
        System.out.println("Coordenador " + nome + " recebeu a notificação de que o aluno " + aluno.nome + " está " + aluno.getHumor());
    }
}