public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("Mudando estado da tv para: " + ligada);
    }

    public void desligar() {
        ligada = false;
        System.out.println("Mudando estado da tv para: " + ligada);
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Mudando volume da tv para: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Mudando volume da tv para: " + volume);
    }

    public void aumentarCanal() {
        canal++;
        System.out.println("Mudando canal da tv para: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Mudando canal da tv para: " + canal);
    }
}