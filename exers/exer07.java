package exers;
import java.util.Scanner;
public class exer07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um número");
       double num = entrada.nextDouble();
      
   String   res = (num >= 0)? "positivo" : "negativo";
      System.out.println("o número é "+ res);
    }
}