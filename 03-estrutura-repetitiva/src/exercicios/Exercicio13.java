package exercicios;

import java.util.Scanner;

/**
 * Ler um númerp inteiro e calcular seus divisores.
 */

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        for (int i=1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
