package exercicios;

import java.util.Scanner;

/**
 * Faça um programa que leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produtdo de C e D segundo a fórmula: (A * B - C * D).S
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1007
 */

public class ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.print("Informe o valor de A: ");
        A = input.nextInt();
        System.out.print("Informe o valor de B: ");
        B = input.nextInt();
        System.out.print("Informe o valor de C: ");
        C = input.nextInt();
        System.out.print("Informe o valor de D: ");
        D = input.nextInt();

        diferenca = (A * B - C * D);
        System.out.println("DIFERENÇA: " + diferenca);

    }
}
