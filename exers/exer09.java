package exers;

import java.util.Scanner;
public class exer09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("qual foi sua primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.println("qual foi sua segunda nota: ");
        double n2 = entrada.nextDouble();

       double media = (n1 + n2) / 2;

       if(media >= 7){
        System.out.println(media + " de média, aluno aprovado");
       }
       else if(media >= 5){
        System.out.println(media + " de média, aluno em exame");
       }
       else{
        System.out.println(media + " de média, aluno reprovado");
       }
       entrada.close();
    }
    
}
