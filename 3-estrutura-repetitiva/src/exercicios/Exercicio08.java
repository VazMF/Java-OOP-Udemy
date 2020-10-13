package exercicios;


import java.util.Scanner;

/**
 * Faça um programa que leia um valor inteiro X (1 <= X <= 1000). Em seguida, mostre os ímpares
 * de 1 até X, um valor por linha, inclusive o X se for o caso.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/en/problems/view/1067
 */

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int x = input.nextInt();

        int odd;
        if (x >= 1 && x <= 1000) {
            for (int i = 1; i <= x; i++) {
                if (i % 2 != 0) {
                    odd = i;
                    System.out.println(odd);
                }
            }
        } else {
            System.out.println("\033[31m[ERRO] INFORME UM VALOR DE 1 ATÉ 1000.\033[m");
        }
    }
}
