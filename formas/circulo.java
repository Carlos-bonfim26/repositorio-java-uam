package formas;

import java.util.Scanner;

public class circulo {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(
                "qual forma geométrica você deseja calcular: círculo - 1, retângulo - 2, triângulo escaleno - 3");
        int forma = entrada.nextInt();
        switch (forma) {
            case 1:
                System.out.println("me diga a raio:");
                double raio = entrada.nextDouble();
                double areaCir = Math.PI * Math.pow(raio, 2);
                System.out.println("a área do raio é " + areaCir);
                break;
            case 2:
                System.out.println("me diga a base:");
                double base = entrada.nextDouble();
                System.out.println("me diga a altura:");
                double altura = entrada.nextDouble();
                double areaRet = base * altura;
                System.out.println("a área do retângulo é " + areaRet);
                break;
            case 3:
                System.out.println("me informe o Lado A do triangulo");
                double ladoA = entrada.nextDouble();
                System.out.println("me informe o Lado B do triangulo");
                double ladoB = entrada.nextDouble();
                System.out.println("me informe o Lado C do triangulo");
                double ladoC = entrada.nextDouble();
                double perimetro = (ladoA + ladoB + ladoC) /2;
                double areaTri = Math.sqrt(perimetro * (perimetro - ladoA) * (perimetro - ladoB) * (perimetro - ladoC));
                System.out.println("a área do triângulo escaleno é: " + areaTri);
                break;
            default:
                System.out.println("opção inválida!");
                break;
        }
        entrada.close();
    }
  
}