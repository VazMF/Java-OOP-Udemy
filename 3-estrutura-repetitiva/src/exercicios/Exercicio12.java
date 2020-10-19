package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia um valor N. Calcule e escreva seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3)
 * Lembrando que, por definição, o fatorial de 0 é 1.
 */

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, f = 1;
        System.out.print("Digite um número: ");
        n = input.nextInt();

        for (int i = 1; n >= i; i++) {
            f = f * i;
        }
        System.out.println("Fatorial: " + f);
        input.close();
    }
}
