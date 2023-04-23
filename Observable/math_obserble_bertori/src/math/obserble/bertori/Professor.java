package math.obserble.bertori;

public class Professor implements Observador {
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void atualizar(Aluno aluno) {
        System.out.println("Professor " + nome + " recebeu a notificação de que o aluno " + aluno.nome + " está " + aluno.getHumor());
    }
}
