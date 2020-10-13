package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia um valor inteiro N, que representa o número de casos de teste que vem a seguir.
 * Cada caso de teste consiste em ler 3 valores reais, cada um deles com uma casa decimal. Apresente a média
 * para cada um deste conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso
 * 3 e o terceiro valor tem peso 5.
 */

public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num;
        double n1, n2, n3, media;

        System.out.print("Quantas leituras quer fazer? ");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print("1° valor: ");
            n1 = input.nextDouble();
            System.out.print("2° valor: ");
            n2 = input.nextDouble();
            System.out.print("3° valor: ");
            n3 = input.nextDouble();

            media = ((2.0 * n1) + (3.0 * n2) + (5.0 * n3)) / (2.0 + 3.0 + 5.0);

            System.out.printf("MÉDIA: %.1f\n", media);
            System.out.println("----------------");
        }
        input.close();
    }
}
