package exercicios.ex03.application;

import java.util.Scanner;

/**
 * Faça um programa para ler dois números inteiros M e N, e depois de ler, faça uma matriz de
 * M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler
 * um número inteiro X que pertence a matriz. Para cada ocorrência de X mostrar os valores à
 * esquerda, acima, à direita e abaixo de X quando houver.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the M value: ");
        int m = input.nextInt();
        System.out.print("Enter the N value: ");
        int n = input.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter the X value: ");
        int x = input.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if (j < matrix[i].length - 1) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }
        input.close();
    }
}
