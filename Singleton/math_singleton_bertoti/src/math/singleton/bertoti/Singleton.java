package math.singleton.bertoti;

public class Singleton {
    private static Singleton instanciaUnica;

    private Singleton() {}

    public static Singleton getInstanciaUnica() {
        if (instanciaUnica == null) {
            instanciaUnica = new Singleton();
        }
        return instanciaUnica;
    }

    public void mensagem() {
        System.out.println("Instância única criada!");
    }
}
