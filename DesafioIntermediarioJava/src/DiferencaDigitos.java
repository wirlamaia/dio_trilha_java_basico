import java.util.*;
public class DiferencaDigitos {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mult = 1, adic = 0;
        int resp;
   int numero = scan.nextInt();

        
   String numeroEmString = String.valueOf(numero);
   String[] split = numeroEmString.split("");

   int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

   //for(int i = 0; i < numerosAleatorios.length; i++) {
     for(int i = 0; i < ints.length; i++) {
          mult = mult * ints[i];
          adic = adic + ints[i];
     }
     resp = (mult - adic);
     System.out.println(resp);
          /* 
   if(ints[0] != 0){
     mult = ints[0]*ints[1]*ints[2]*ints[3];
     adic = ints[0]+ints[1]+ints[2]+ints[3];
   }else{
     mult = ints[0]*ints[1]*ints[2];
     adic = ints[0]+ints[1]+ints[2];
   }
   res = mult - adic;
       // System.out.println(split[0]);*/


       
   }    
}

