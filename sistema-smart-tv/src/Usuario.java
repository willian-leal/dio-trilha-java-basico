public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        System.out.println("TV LIGADA? " + smartTv.ligada);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("CANAL ATUAL: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("VOLUME ATUAL: " + smartTv.volume);
    }
}
