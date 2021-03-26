package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler um número inteiro e dizer se ele é negativo ou não.
 */

public class ex04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.print("O número " + num + " é negativo.");
        } else {
            System.out.println("O número " + num + " não é negativo.");
        }
        input.close();
    }
}