package aula04;

import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite um valor");
        int numero = entrada.nextInt();
        int contador = 1;
        while(contador <= 10){
            System.out.println(numero + " x " + contador + " = " + numero *contador );
            contador++;
        }
        entrada.close();
    }
}
