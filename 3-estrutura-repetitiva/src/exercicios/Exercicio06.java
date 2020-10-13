package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia um valor inteiro N (2 < N < 1000). A seguir mostre sua tabuada.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1078
 */

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        System.out.print("Digite um número: ");
        num = input.nextInt();

        if (num >= 2 && num < 1000) {
            for (int i = 0; i <= 10; i++) {
                int resultado = num * i;
                System.out.println(i + " x " + num + " = " + resultado);
            }
        }
    }
}
