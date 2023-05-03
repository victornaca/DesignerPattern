package math.singleton.bertoti;

public class ExemploSingleton {
    public static void main(String[] args) {
        Singleton instancia1 = Singleton.getInstanciaUnica();
        Singleton instancia2 = Singleton.getInstanciaUnica();

        if (instancia1 == instancia2) {
            System.out.println("As instâncias são iguais!");
        }

        instancia1.mensagem();
    }
}

