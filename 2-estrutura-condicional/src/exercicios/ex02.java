package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia 3 valores de ponto flutuante e efetue o cálculo da equação de Bhaskara. Se não for possível
 * calcular as raízes, mostre a mensagem correspondente "Impossível calcular", caso haja uma divisão
 * por 0 ou raiz de número negativo.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1036
 */

public class ex02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double a, b, c, delta, r1, r2;

        System.out.print("Digite o valor de A: ");
        a = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        b = input.nextDouble();
        System.out.print("Digite o valor de C: ");
        c = input.nextDouble();

        delta = b * b - 4.0 * a * c;

        if (delta < 0 || a == 0) {
            System.out.println("Impossível calcular.");
        }else {
            r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
            System.out.printf("R1 = %.5f\n", r1);
            System.out.printf("R2 = %.5f\n", r2);
        }
        input.close();
    }
}
