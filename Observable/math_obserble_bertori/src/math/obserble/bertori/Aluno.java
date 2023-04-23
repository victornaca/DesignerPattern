package math.obserble.bertori;

public class Aluno {
    String nome;
    private String humor;

    public Aluno(String nome) {
        this.nome = nome;
        this.humor = "neutro";
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getHumor() {
        return humor;
    }
}
