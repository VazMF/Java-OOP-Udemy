package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
 * segundp. Se o denominador for igual zero, mostrar a mensagem "divisão impossível".
 */

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, n1, n2;
        double div;

        System.out.print("Repetições: ");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("n1: ");
            n1 = input.nextInt();

            System.out.print("n2: ");
            n2 = input.nextInt();

            if (n2 != 0) {
                div = (double) n1 / n2;
                System.out.println("Resultado: " + div);
            } else {
                System.out.println("Divisão impossível.");
            }
        }
        input.close();
    }
}
