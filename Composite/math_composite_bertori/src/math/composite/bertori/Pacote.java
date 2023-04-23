package math.composite.bertori;

import java.util.ArrayList;
import java.util.List;

public class Pacote implements Item {
    private List<Item> itens;

    public Pacote() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    @Override
    public double getPreco() {
        double precoTotal = 0;
        for (Item item : itens) {
            precoTotal += item.getPreco();
        }
        return precoTotal;
    }
}