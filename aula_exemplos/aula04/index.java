package aula04;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um valor para contador contar até ele:");
        int limite = entrada.nextInt();
       int contador = 1;
       while(contador <= limite){
        System.out.print(contador + " ");
        contador = contador + 1;
       } 
       entrada.close();
    }
}
