package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();
    }

    public void AdicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.AdicionarContato("Willian", 12345);
        agendaContatos.AdicionarContato("Willian-trabalho", 67890);
        agendaContatos.AdicionarContato("Larissa", 1122333);
        agendaContatos.exibirContato();
        System.out.println(" ");

        System.out.println(agendaContatos.atualizarNumeroContato("Willian-trabalho", 123));
        agendaContatos.exibirContato();
        System.out.println(" ");

        System.out.println(agendaContatos.pesquisarPorNome("Willian"));
    }
}
