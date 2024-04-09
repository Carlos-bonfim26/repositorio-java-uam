package w3schools.inicio;

import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char opcao;
do{
        System.out.println("cardápio: \n "
                + "1-hotdog: R$ 7,50, \n"
                + "2-hamburguer: R$ 13,00, \n"
                + "3-suco: 3,70, \n"
                + "4-refri: 8,25 \n");
        System.out.println("escolha uma opção:");
        int pedido = input.nextInt();

        switch (pedido) {
            case 1:
                System.out.println("você escolheu o hotdog que custa R$7,50");
                break;
            case 2:
                System.out.println("você escolheu o hamburguer que custa R$13,00");
                break;
            case 3:
                System.out.println("você escolheu o suco que custa R$3,70");
                break;
            case 4:
                System.out.println("você escolheu o refri que custa R$8,25");
                break;
            default:
                System.out.println("o pedido que você digitou não existe.");
        }
       
        System.out.println("você deseja um novo item? (s ou n)");
        opcao = input.next().charAt(0);
    } while(opcao == 's');
   
    input.close();
    }

}
