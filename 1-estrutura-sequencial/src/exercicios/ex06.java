package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia o código de ume peça 1,  número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor uniário de cada peça 2. Calcule e mostre o valor a ser pago.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1010
 */

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod1, cod2, num1,  num2;
        double value1, value2, total;

        System.out.print("Código da peça 1: ");
        cod1 = input.nextInt();
        System.out.print("Número de unidades da peça 1: ");
        num1 = input.nextInt();
        System.out.print("Valor unitário da peça 1: R$");
        value1 = input.nextDouble();

        System.out.print("Código da peça 2: ");
        cod2 = input.nextInt();
        System.out.print("Número de unidades da peça 2: ");
        num2 = input.nextInt();
        System.out.print("Valor unitário da peça 2: R$");
        value2 = input.nextDouble();

        total = value1 * num1 + value2 * num2;
        System.out.printf("Total a pagar: R$%.2f\n", total);
        input.close();
    }
}
