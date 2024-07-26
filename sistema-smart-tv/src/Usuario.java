public class Usuario {

    public static void main (String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo Status -> A TV está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume Atual: " + smartTv.volume);

        smartTv.avancarCanal();
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);

        smartTv.voltarCanal();
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Novo Status -> Canal Atual: " + smartTv.canal);
    }
    
}