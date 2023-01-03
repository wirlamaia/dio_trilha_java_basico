// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner; 
 
public class Main3 { 
 
    public static void main(String[] args) { 
 
    String[] nomesFila = new String[3]; 
    Scanner nome = new Scanner(System.in); 

    for (int i=0;i<=2;i++){
        System.out.println("Entre com nome " + (i+1) + ":" );  
        nomesFila[i] = nome.next();
    }

    System.out.println("\nLista");
    for (int i=0;i<=2;i++){
        System.out.println(nomesFila[i] + " - esta na posição: " + (i+1));  
    }
    
    /* **Também deu certo
    System.out.println(nomesFila[0] + " - esta na posicao: 1");
    System.out.println(nomesFila[1] + " - esta na posicao: 2");
    System.out.println(nomesFila[2] + " - esta na posicao: 3");*/

 //TODO: Implemente uma condição que simule uma fila bancaria, gerando o nome a posição do cliente na fila:
  

  } 
}
