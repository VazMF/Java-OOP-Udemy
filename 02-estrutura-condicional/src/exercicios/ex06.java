package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia dois valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "são múltiplos" ou "não são múltiplos",
 * indicando se os valores lidos são múltiplos entre si. Atenção, número devem poder ser digitados em ordem crescente
 * ou decrescente.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1044
 */

public class ex06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("Digite um número: ");
        a = input.nextInt();
        System.out.print("Digite outro número: ");
        b = input.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
        }
        input.close();
    }
}
