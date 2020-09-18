package exercicios;

import java.util.Scanner;

/**
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1003
 */

public class ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = input.nextInt();
        System.out.print("Informe o segundo número: ");
        int n2 = input.nextInt();

        int sum = n1 + n2;

        System.out.println("A soma é " + sum);
        input.close();
    }
}