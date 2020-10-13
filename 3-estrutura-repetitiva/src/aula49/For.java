package aula49;

import java.util.Scanner;

/**
 * Faça um programa que leia um valor inteiro N e depois N números inteiros.
 * Ao final, mostrar a soma dos N números lidos.
 */

public class For {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int qtd, soma = 0;
        System.out.print("Quantos números você quer ler? ");
        qtd = input.nextInt();

        for (int i = 0; i < qtd; i++) {
            int num;
            System.out.print("Digite um número: ");
            num = input.nextInt();
            soma += num;
        }
        System.out.println("Soma dos números: " + soma);
    }
}
