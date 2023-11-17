public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada : " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada : " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada : " + smartTv.ligada);
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.escolherCanal(10);

    }
}
