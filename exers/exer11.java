package exers;

import java.util.Scanner;

public class exer11 {
    public static void main(String[] args) {
        double ladoA, ladoB, ladoC;
        Scanner entrada = new Scanner(System.in);
        System.out.println("valor do lado A");
        ladoA = entrada.nextDouble();
        System.out.println("valor do lado B");
        ladoB = entrada.nextDouble();
        System.out.println("valor do lado C");
        ladoC = entrada.nextDouble();
        
        if(ladoA > ladoB + ladoC || ladoB > ladoA + ladoC || ladoC > ladoA + ladoB){
            System.out.println("não é um triangulo");
        } else{
            if(ladoA == ladoB && ladoC == ladoA){
                System.out.println("triangulo equilátero"); 
            } else{
                if(ladoA == ladoB || ladoB == ladoC || ladoC == ladoA){
                    System.out.println("triangulo Isósceles");  
                } else{
                    System.out.println("triangulo escaleno");  
                }
            }
        }
        entrada.close();
    }
}
