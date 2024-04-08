package exers;

import java.util.Scanner;

public class exer05 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual a quantidade de pontos que você conseguiu?; ");
        int pontos = entrada.nextInt();
        System.out.println("qual a quantidade de chaves que você conseguiu?; ");
        int chaves = entrada.nextInt();

        if(pontos >= 1000 && chaves >= 3){
            System.out.println("passou para a próxima fase");
        } else{
            System.out.println("não passou para a próxima fase");
        }
        entrada.close();
    }
    
}
