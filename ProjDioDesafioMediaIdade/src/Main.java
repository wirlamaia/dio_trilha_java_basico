// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       // double media;

        System.out.printf("Informe a idade da primeira pessoa: ");
        int idade1 = leitor.nextInt();
        System.out.printf("Informe a idade da segunda pessoa: ");
        int idade2 = leitor.nextInt();
        System.out.printf("Informe a idade da terceira pessoa: ");
        int idade3 = leitor.nextInt();

       float media=(idade1+idade2+idade3)/3;

        System.out.printf("\nResultado:\n");
        if (media < 26) {
            System.out.println("Turma Jovem");
        } else if (media > 25 && media < 61) {
            System.out.println("Turma Adulta");
        } else {
            System.out.println("Turma Idosa");
        }
        System.out.printf("Obrigada, fim! \n\n");
 //TODO: Implemente um condição de verifique a média de idade da turma conforme a descrição do desafio:
    }
}
