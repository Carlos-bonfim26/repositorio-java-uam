package exers;

import java.util.Scanner;


public class exer10 {
    public static void main(String[] args) {

    double nota1, nota2, nota3, exame, media;
    int faltas;

    Scanner entrada = new Scanner(System.in);
    System.out.println("quantas faltas você teve?");
    faltas = entrada.nextInt();
   
    if(faltas >= 16){
        System.out.println("reprovado por falta");
    } else{
        System.out.println("qual foi a primeira nota?");
        nota1 = entrada.nextDouble();
        System.out.println("qual foi a segunda nota?");
        nota2 = entrada.nextDouble();
        System.out.println("qual foi a terceira nota?");
        nota3 = entrada.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        if(media >= 6){
            System.out.println(media + " de media, aluno aprovado");
        } else{
            
            System.out.println("quanto foi a sua nota do exame?");
            exame = entrada.nextInt();
            media = (exame + media) / 2;

            if(media >= 5){
                System.out.println(media +" de media, aprovado no exame");
            } else{
                System.out.println(media + " de media, aluno reprovado");
            }
        }
    }
    entrada.close();
    }
}
