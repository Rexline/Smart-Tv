public class SmartTv {
    Boolean ligada = false;
    Integer canal = 1;
    Integer volume = 25;

    public void ligar () {
        ligada = true;
    }
    public void desligar (){
        ligada=false;

    }


    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para : " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para : " + volume);
    }
    public void aumentarCanal() {
        canal++;
        System.out.println("Subiu para o canal : "+ canal );
    }
    public void diminuirCanal() {
        canal--;
        System.out.println("Desceu para o canal : "+ canal );
    }

    public void escolherCanal (Integer novoCanal) {
        canal = novoCanal;
        System.out.println("Mudou para o canal : " + canal );
    }





}
