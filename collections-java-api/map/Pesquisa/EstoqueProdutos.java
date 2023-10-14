package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double valorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obeteProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(001, "Coca-Cola", 8.0, 100);
        estoqueProdutos.adicionarProduto(002, "Guaraná", 7.0, 120);
        estoqueProdutos.adicionarProduto(003, "Itubaina", 6.0, 80);
        estoqueProdutos.exibirProdutos();
        System.out.println("");

        System.out.println("Valor total do estoque: " + estoqueProdutos.valorTotalEstoque());
        System.out.println("");

        System.out.println("Produto mais caro do estoque: " + estoqueProdutos.obeteProdutoMaisCaro());
    }
}
