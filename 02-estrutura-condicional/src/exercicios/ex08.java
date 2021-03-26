package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
 * A seguira, calule e mostre o valor a pagar.
 *
 * Cod. Especificação     Preço
 * 1    cachorro quente   R$ 4.00
 * 2    X-Salada          R$ 4.50
 * 3    X-Bacon           R$ 5.00
 * 4    Torrada simples   R$ 2.00
 * 5    Refrigerante      R$ 1.50
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1038
 */

public class ex08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod, qtd;
        double price = 0;

        System.out.println("[ 1 ] Cachorro-Quente");
        System.out.println("[ 2 ] X-Salada");
        System.out.println("[ 3 ] X-Bacon");
        System.out.println("[ 4 ] Torrada simples");
        System.out.println("[ 5 ] Refrigerante");

        System.out.print("SEU PEDIDO:  ");
        cod = input.nextInt();
        System.out.print("QUANTIDADE DESEJADA: ");
        qtd = input.nextInt();

        if (cod == 1) {
            price = 4.0 * qtd;
        } else if (cod == 2) {
            price = 4.5 * qtd;
        } else if (cod == 3) {
            price = 5.0 * qtd;
        } else if (cod == 4) {
            price = 2.0 * qtd;
        } else if (cod == 5) {
            price = 1.5 * qtd;
        } else {
            System.out.println("[ERRO] Este produto não existe.");
        }

        System.out.printf("Total: R$%.2f\n", price);

    }
}
