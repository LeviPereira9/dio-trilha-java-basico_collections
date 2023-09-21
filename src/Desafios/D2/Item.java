package Desafios.D2;

public class Item {
    private String name;
    private double preco;
    private int quantidade;

    public Item(String name, double preco, int quantidade) {
        this.name = name;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getName() {
        return name;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String toString() {
        return "{Nome: '" + name + "', Preço: " + preco + ", Quantidade: " + quantidade + "}";
    }
}
