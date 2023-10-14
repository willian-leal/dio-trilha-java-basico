import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int condigoConvite) {
        convidadoSet.add(new Convidado(nome, condigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCondigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Willian", 001);
        conjuntoConvidados.adicionarConvidado("Larissa", 002);
        conjuntoConvidados.adicionarConvidado("Kaka", 003);
        conjuntoConvidados.adicionarConvidado("Danielle", 004);
        System.out.println(" ");

        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
        System.out.println(" ");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(001);
        conjuntoConvidados.exibirConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());
    }
}
