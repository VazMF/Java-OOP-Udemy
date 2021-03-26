package exercicios.ex02.application;

import java.util.Scanner;

/**
 * Faça um programa para ler um número inteiro N e uma matriz de ordem N contendo números inteiros.
 * Em seguida, mostrar a diagonal principal e a quantidade de valores negativos da matriz.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = input.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();

        int negativeNum = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    negativeNum ++;
                }
            }
        }
        System.out.println("Negative numbers = " + negativeNum);

        input.close();
    }
}
