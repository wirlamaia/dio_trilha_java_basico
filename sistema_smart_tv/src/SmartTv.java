public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume=25;

   
        public void mudarCanal (int novoCanal){//parametro
            canal = novoCanal;
        }    
        public void aumentarCanal(){//metodo
            canal++;
            System.out.println("Aumentando o canal para: " + canal);
        }
        public void diminuirCanal(){
            canal--;
            System.out.println("Diminuindo o canal para: " + canal);
        }
    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}