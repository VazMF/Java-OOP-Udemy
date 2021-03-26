package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler o valor do raio de um circulo, e depois mostrar o valor da área deste círculo
 * com quatro casas decimais.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1002
 */

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe o valor do raio do círculo: ");
        double radius = input.nextDouble();
        double area = 3.14159 * (Math.pow(radius, 2));
        System.out.printf("A área é %.4f", area);
    }
}
