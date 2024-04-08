package aula01;

import java.util.Scanner;

/**
 * index2
 */
public class index2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome:");
        String nome = teclado.nextLine();
        System.out.println("digite a sua idade:");
        int idade = teclado.nextInt();
        System.out.println(nome + idade);
        teclado.close();
    }

}