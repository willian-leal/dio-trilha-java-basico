package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordernacaoPessoas = new OrdenacaoPessoas();

        ordernacaoPessoas.adicionarPessoa("Willian", 21, 1.72);
        ordernacaoPessoas.adicionarPessoa("Larissa", 21, 1.65);
        ordernacaoPessoas.adicionarPessoa("Geraldo", 50, 1.70);
        ordernacaoPessoas.adicionarPessoa("Claudine", 45, 1.60);
        ordernacaoPessoas.adicionarPessoa("Lyvea", 14, 1.55);

        System.out.println(ordernacaoPessoas.ordenarPorIdade());
        System.out.println(" ");
        System.out.println(ordernacaoPessoas.ordernarPorAltura());
    }
}