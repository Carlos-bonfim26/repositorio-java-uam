package w3schools.inicio;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite o número da sua opção: 1-hotdog: R$ 7,50, 2-hamburguer: R$ 13,00, 3-suco: 3,70, 4-refri: 8,25");
        int pedido = teclado.nextInt();
        if(pedido == 1){
            System.out.println("você escolheu o hotdog que custa R$7,50");
        } else if(pedido == 2){
            System.out.println("você escolheu o hamburguer que custa R$13,00");
        }  else if(pedido == 3){
            System.out.println("você escolheu o suco que custa R$3,70");
        } else if(pedido == 4){
            System.out.println("você escolheu o refri que custa R$8,25");
    } else{
        System.out.println("o pedido que você digitou não existe.");
    }
}}
