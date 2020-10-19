package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia um número positivo N. O program deve então mostrar na tela N linhas,
 * começandp de 1 até N. Para cada linha, mostrar o número da linhas, depois o quadrado e o cubo
 * do valor, conforme exemplo.
 *
 * Fonte:
 */

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número: ");
        int num = input.nextInt();

        for (int i=1; i <= num; i++) {
            System.out.println(i + " " + i * i + " " + i * i * i);
        }
        input.close();
    }
}
