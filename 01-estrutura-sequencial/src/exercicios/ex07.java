package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule
 * e mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1012
 */

public class ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B, C;
        double rightTriangle, circle, trapezoid, square, rectangle;

        System.out.print("Digite o valor de A: ");
        A = input.nextDouble();
        System.out.print("Digite o valor de B: ");
        B = input.nextDouble();
        System.out.print("Digite o valor de C: ");
        C = input.nextDouble();

        //a) Triângulo retângulo
        rightTriangle = (A * C) / 2;
        System.out.printf("Triângulo: %.3f\n", rightTriangle);

        //b) Circulo
        circle = 3.14159 * (Math.pow(C, 2));
        System.out.printf("Círculo: %.3f\n", circle);

        //c) Trapézio
        trapezoid = (A + B) / 2.0 * C;
        System.out.printf("Trapézio: %.3f\n", trapezoid);

        //d) Quadrado
        square = B * B;
        System.out.printf("Quadrado: %.3f\n", square);
        
        //e) Retângulo
        rectangle = A * B;
        System.out.printf("Retângulo: %.3f\n", rectangle);
    }
}