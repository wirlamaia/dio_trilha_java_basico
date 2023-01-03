// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Em qual turno estuda? coloque a letra respectiva (M-matutino ou V-Vespertino ou N- Noturno): ");
        char turno = leitor.next().toUpperCase().charAt(0);
  
            switch (turno) {
            case 'M':
                System.out.println("Bom Dia!");
                break;
            case 'V':
                System.out.println("Boa Tarde!");
                break;
            case 'N':
                System.out.println("Boa Noite!");
                break;
            case 'T':
                System.out.println("Valor Inválido");
                break;
            default:
                System.out.println("Valor Incorreto");
            }

//TODO: Implemente uma solução para que seja impresso a saída correto do seu turno:      
        }
}
