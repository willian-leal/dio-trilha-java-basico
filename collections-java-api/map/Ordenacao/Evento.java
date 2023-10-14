package map.Ordenacao;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String nome, String Atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
    }
}
