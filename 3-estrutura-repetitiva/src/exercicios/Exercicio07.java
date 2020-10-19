package exercicios;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/en/problems/view/1071
 */

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o 1° número: ");
        int x = input.nextInt();
        System.out.print("Digite o 2° número: ");
        int y = input.nextInt();

        int min, max;
        if (x > y) {
            max = x;
            min = y;
        } else {
            max = y;
            min = x;
        }

        int soma = 0;
        for (int i = min + 1; i < max; i++) {

            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("A soma é: " + soma);
    }
}
