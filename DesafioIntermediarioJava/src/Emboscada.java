import java.util.Scanner; 

public class Emboscada {
    public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
        
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();

        while(vidaDoJogador > 0 && vidaDoInimigo > 0){
                vidaDoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
                vidaDoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);

            if(vidaDoJogador<1){
                System.out.println("Jogador nao sobreviveu");
                break;  
            }else if(vidaDoJogador>vidaDoInimigo && vidaDoInimigo < 1){
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
                break; 
            }else{
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
                break; 
            }
        }
    }
}

/* import java.util.Scanner; 

public class Emboscada {
    public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
        
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();

        while(vidaDoJogador > 0 && vidaDoInimigo > 0){
            if(dados == 9){
                dados = 18;
        //        System.out.println("Dados = " + dados);
                continue;
            }
                vidaDoJogador = vidaDoJogador - (ataqueDoInimigo - (defesaDoJogador + dados));
                vidaDoInimigo = vidaDoInimigo - (ataqueDoJogador + dados);
        //        System.out.println("Vida Jogador = " + vidaDoJogador + " vidaDoInimigo " + vidaDoInimigo);
        //    if((vidaDoJogador<vidaDoInimigo) && (vidaDoJogador<1)){
            if(vidaDoJogador<1){
                System.out.println("Jogador nao sobreviveu");
                break;  
            }else if(vidaDoJogador>vidaDoInimigo && vidaDoInimigo < 1){
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
                break; 
 //           }else if(vidaDoJogador>vidaDoInimigo && ((vidaDoJogador > 0) && (vidaDoInimigo > 0))){
            }else{
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
                System.out.println("Novo valor do dado: ");  
                dados = leitor.nextInt();
                continue; 
            }
        }
    }
} */