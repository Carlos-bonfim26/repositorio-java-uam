package exers;

import java.util.Scanner;

public class exer08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um número: ");
        double n1 = entrada.nextDouble();
        System.out.println("digite um número: ");
        double n2 = entrada.nextDouble();
        System.out.println("qual operação você deseja fazer (+ - x / )");
        String operador = entrada.nextLine();
        double res;
        switch (operador) {
            case "-":
                res = n1 - n2;
                System.out.println("o resultado da operação é " + res);
                break;
            case "+":
                res = n1 + n2;
                System.out.println("o resultado da operação é " + res);
                break;
            case "x":
                res = n1 * n2;
                System.out.println("o resultado da operação é " + res);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("impossível dividir");
                } else {
                    res = n1 / n2;
                    System.out.println("o resultado da operação é " + res);
                }
                break;
            default:
                System.out.println("operador inválido");
                break;
        }
        entrada.close();
    }
}