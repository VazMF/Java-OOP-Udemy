package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia um número inteiro, e depois diga se esse número é par ou ímpar.
 */

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número É PAR.");
        } else {
            System.out.println("O número É ÍMPAR.");
        }
        input.close();
    }
}
