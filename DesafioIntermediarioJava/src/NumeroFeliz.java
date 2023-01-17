import java.util.*;
public class NumeroFeliz {
    public static void main(String[] args){
        int cent = 0;
        int deze = 0;
        int unid = 0;
        int total = 0;
        boolean res = true;
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        while(num != 1){
            total = total+1;
            if((num < 1)||(total > 10)){
                res = false;
//                System.out.println("Resposta estouro " + res + " Total " + total); 
                break;
            }else if(num > 99){
                cent = (num/100);
                deze = ((num%100)/10);
                unid = (num%10);
//                    System.out.println("Passagem calculo número acima de 99: " + cent + " " + deze + " " + unid + " Numero: " + num);
                cent = cent*cent;
                deze = deze*deze;
                unid = unid*unid;
                num = cent + deze + unid;
//                    System.out.println("Passagem calculo valores ao quadrado de numero acima de 99: " + cent + " " + deze + " " + unid + " Numero: " + num);
            }else if((num > 9) && (num < 100)){
                cent = 0;                
                deze = ((num%100)/10);
                unid = (num%10);
//                System.out.println("Passagem calculo número acima de 9 e menor que 100: " + cent + " " + deze + " " + unid + " Numero: " + num);           
                deze = deze*deze;
                unid = unid*unid;
                num = deze + unid;
//                     System.out.println("Passagem calculo valores ao quadrado de numero acima de 9 e menor que 100: " + cent + " " + deze + " " + unid + " Numero: " + num);
            }else if((num < 10) && (num > 1)){
                cent = 0;  
                deze = 0;
                unid = num;
                num = num*num;
//                System.out.println("Passagem calculo valores ao quadrado de numero acima de 1 e menor que 10: " + cent + " " + deze + " " + unid + " Numero: " + num);
            }else if(num == 1){
                res = true;
//                System.out.println("Resultado verdadeiro igual a 1 durante passagens de números " + res);
                break; 
            }else{
                continue;
            }
        } 
//       System.out.println("Resposta final:  " + res);
       System.out.println(res);
        scan.close();
    }
}
