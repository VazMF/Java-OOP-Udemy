package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia 2 valores com uma casa decimal (x e y), que devem representar as coordernadas de um
 * ponto em um plano. A seguir, determine qual quadrante ao qual pertence o ponto, ou se está sobre um dos eixos
 * cartesianos ou na origem (x = y = 0).
 */

public class ex10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x, y;

        System.out.print("Digite o primeiro valor: ");
        x = input.nextDouble();
        System.out.print("Digite o segundo valor: ");
        y = input.nextDouble();

        if (x == 0.0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0.0) {
            System.out.println("Eixo X");
        } else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }
        input.close();
    }
}
