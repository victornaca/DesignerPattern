package math.composite.bertori;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto("Camisa", 50.0);
        Produto p2 = new Produto("Calça", 80.0);
        Produto p3 = new Produto("Meia", 10.0);
        
        Pacote pacote = new Pacote();
        pacote.adicionarItem(p1);
        pacote.adicionarItem(p2);
        pacote.adicionarItem(p3);

        System.out.println("Preço total do pacote: " + pacote.getPreco());
    }
}
