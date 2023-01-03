// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.*;
 
public class Main4{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Informe o valor de mercado do produto: ");            
        int M = input.nextInt();
        System.out.printf("Informe o valor de desconto do produto: "); 
        int D = input.nextInt();  
        System.out.printf("\nResultado:\n");
        System.out.println("O desconto foi de " + ((((D *100)/M)-100)*-1) + "%");
        //TODO:  Retorne o percentual de desconto que foi aplicado no produto
    }
}
