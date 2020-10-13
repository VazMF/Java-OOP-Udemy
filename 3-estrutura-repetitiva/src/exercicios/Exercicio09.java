package exercicios;

import java.util.Scanner;

/**
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
 * Mostre quantos desses valores X estão dentro do intervalo 10... 20 e quantos estão fora, mostrando essa
 * informação conforme exemplo (use a palavra 'in' para dentro do intervalo e 'out' para fora).
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/en/problems/view/1072
 */

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números quer ler? ");
        int n = input.nextInt();

        int x, in = 0, out = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Informe um número: ");
            x = input.nextInt();

            if (10 <= x && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.println("in: " + in);
        System.out.println("out: " + out);
    }
}
