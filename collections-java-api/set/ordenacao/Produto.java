package set.ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto> {
    private String nome;
    private int codigoProduto;
    private double preco;
    private int quantidade;

    public Produto(String nome, int codigoProduto, double preco, int quantidade) {
        this.nome = nome;
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", codigoProduto=" + codigoProduto + ", preco=" + preco + ", quantidade="
                + quantidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoProduto;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigoProduto != other.codigoProduto)
            return false;
        return true;
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}