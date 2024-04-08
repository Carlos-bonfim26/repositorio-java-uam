package formas;

import java.util.Scanner;

import javafx.scene.transform.Scale;

public class calculadora {
    
    public double area(double raio){
        double area = Math.PI * Math.pow(raio, 2);
        
        return area(raio);
    }
    public double area(double base, double altura){

        double area = base * altura;
        return area(base, altura);
    }
    public double area(double ladoA, double ladoB, double ladoC){
        double perimetro = (ladoA + ladoB + ladoC) /2;
        double area = Math.sqrt(perimetro * (perimetro - ladoA) * (perimetro - ladoB) * (perimetro - ladoC));
        return area(ladoA, ladoB, ladoC);
    } 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        calculadora pessoa = new calculadora();

        System.out.println(
            "qual forma geométrica você deseja calcular: círculo - 1, retângulo - 2, triângulo escaleno - 3");
    int forma = entrada.nextInt();
    switch (forma) {
        case 1:
            System.out.println("me diga a raio:");
            double raio = entrada.nextDouble();
            System.out.println("a área do raio é " + pessoa.area(raio));
            break;
        case 2:
            System.out.println("me diga a base:");
            double base = entrada.nextDouble();
            System.out.println("me diga a altura:");
            double altura = entrada.nextDouble();
            System.out.println("a área do retângulo é " + pessoa.area(base, altura));
            break;
        case 3:
            System.out.println("me informe o Lado A do triangulo");
            double ladoA = entrada.nextDouble();
            System.out.println("me informe o Lado B do triangulo");
            double ladoB = entrada.nextDouble();
            System.out.println("me informe o Lado C do triangulo");
            double ladoC = entrada.nextDouble();
            System.out.println("a área do triângulo escaleno é: " + pessoa.area(ladoA, ladoB, ladoC));
            break;
        default:
            System.out.println("opção inválida!");
            break;
    }
    entrada.close();
    }
}
