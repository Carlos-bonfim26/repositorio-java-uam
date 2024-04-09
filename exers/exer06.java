package exers;
import java.util.Scanner;
public class exer06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um número");
       double num = entrada.nextDouble();
      
   String   res = (num % 2 == 0)? "par" : "impar";
      System.out.println("o número é "+ res);
      entrada.close();
    }
}











