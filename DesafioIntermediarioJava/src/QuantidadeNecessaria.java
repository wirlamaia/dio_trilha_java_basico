import java.util.*;

public class QuantidadeNecessaria {
    public static void main(String[] args){
    final int SLICE = 4;
        int i, j, soma, T, N, X;
        float resp;

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //Casos de teste

        for(i=0; i<T; i++){
            soma = 0;
            N = scanner.nextInt(); // Quantidade de amigos
                X = scanner.nextInt(); // Quantidade de fatias para cada amigo           
                    soma = N * X;
                    resp=soma%SLICE;
                    if(resp>0){
                        System.out.println((soma/SLICE)+1);
                    }else{
                        System.out.println(soma/SLICE);
                    }
            }  
            
/*             for(i=0; i<T; i++){
                soma = 0;
                N = scanner.nextInt(); // Quantidade de amigos
                    for(j=0; j<N; j++){            
                    X = scanner.nextInt(); // Quantidade de fatias para cada amigo           
                        soma = soma + X;
                    }
                        resp=soma%SLICE;
                        if(resp>0){
                            System.out.println("Resposta " + ((soma/SLICE)+1));
                        }else{
                            System.out.println("Resposta " + soma/SLICE);
                        }
    
                }  */
        scanner.close();
    }
}