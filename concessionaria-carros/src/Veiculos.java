public abstract class Veiculos {
    public abstract void ligar();

    public void desligar() {
        System.out.println("VEÍCULO DESLIGADO");
    }

    protected void verificarCombustivel() {
        System.out.println("Combustível verificado");
    }

}
