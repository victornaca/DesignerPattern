package math.obserble.bertori;
public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");

        Professor professor = new Professor("Maria");
        Coordenador coordenador = new Coordenador("José");
        
        VerificadorHumor verificadorHumor = new VerificadorHumor(aluno);
        verificadorHumor.adicionarObservador(professor);
        verificadorHumor.adicionarObservador(coordenador);

        verificadorHumor.verificarHumor();
    }
}