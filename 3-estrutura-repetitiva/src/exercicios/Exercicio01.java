package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia uma quantidade indeterminada de duplas de valores inteiros x e y. Escreva para
 * cada x e y uma mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.
 * O programa deve ser encerrado se for fornecido valores iguais para x e y.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1113
 */

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;

        System.out.print("x = ");
        x = input.nextInt();
        System.out.print("y = ");
        y = input.nextInt();

        while (x != y) {

            if (x > y) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }

            System.out.print("x = ");
            x = input.nextInt();
            System.out.print("y = ");
            y = input.nextInt();
        }
        input.close();
    }
}
