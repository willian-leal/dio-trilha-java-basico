package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, int codigoProduto, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigoProduto, preco, quantidade));
    }

    public Set<Produto> exibiProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto("shapoo", 01, 20.0, 100);
        cadastroProdutos.adicionarProduto("condicionador", 02, 25.0, 80);
        cadastroProdutos.adicionarProduto("máscara", 03, 35.0, 50);

        System.out.println(cadastroProdutos.produtoSet);
        System.out.println("");

        System.out.println(cadastroProdutos.exibiProdutosPorNome());
        System.out.println("");

        System.out.println(cadastroProdutos.exibirPorPreco());
    }
}
