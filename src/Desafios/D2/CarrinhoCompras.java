package Desafios.D2;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String name, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(name, preco, quantidade));
    }

    public void removerItem(String name) {
        List<Item> itemParaRemover = new ArrayList<>();

        for (Item item : carrinhoDeCompras) {
            if (item.getName().equalsIgnoreCase(name)) {
                itemParaRemover.add(item);
            }
        }

        carrinhoDeCompras.removeAll(itemParaRemover);
    }

    public double calcularCarrinho() {
        double total = 0.0;

        for (Item item : carrinhoDeCompras) {
            total += item.getPreco() * item.getQuantidade();
        }

        return total;
    }

    public void exibirItems() {
        System.out.println(carrinhoDeCompras);
    }

    public int tamanhoDoCarrinho() {
        return carrinhoDeCompras.size();
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        System.out.printf("O carrinho de compras possui %d items.\n", carrinhoCompras.tamanhoDoCarrinho());

        carrinhoCompras.adicionarItem("Leite", 10.50, 2);
        carrinhoCompras.adicionarItem("Queijo", 23.29, 5);
        carrinhoCompras.adicionarItem("Maça", 1.50, 20);
        System.out.printf("O carrinho de compras possui %d items.\n", carrinhoCompras.tamanhoDoCarrinho());

        carrinhoCompras.removerItem("Leite");
        System.out.printf("O carrinho de compras possui %d items.\n", carrinhoCompras.tamanhoDoCarrinho());

        System.out.printf("Todos os itens dentro do carrinho, valem no total: %.2f.\n",
                carrinhoCompras.calcularCarrinho());

        carrinhoCompras.exibirItems();
    }
}
