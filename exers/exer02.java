package exers;

import java.util.Scanner;

public class exer02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual o seu salário?: ");
        double salario = entrada.nextDouble();

        double salarioNovo = salario * 1.25;

        System.out.println("seu novo salário é de " + salarioNovo);
        entrada.close();
    }
}
