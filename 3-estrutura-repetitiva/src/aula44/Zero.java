package aula44;

import java.util.Scanner;

/**
 * Faça um programa que lê números inteiros até que um zero seja lido.
 * Ao final mostra a soma dos números lidos.
 */

public class Zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sum = 0;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        while (num != 0) {
            sum += num;
            System.out.print("Digite mais um número: ");
            num = input.nextInt();
        }
        System.out.println("A soma de todos os números lidos é " + sum);
        input.close();
    }
}
