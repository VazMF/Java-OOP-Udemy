package aula63.aplication;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). Em seguida,
mostre o valor das áreas dos triângulos e diga qual tem a maior área. A fórmula para calcular a área de um triângulo
a partir das medidas dos seus lados a, b e c é chamada de fórmula de Heron: area √p(p-a)(p-b)(p-c) onde p = a+b+c/2.
 */

public class Triangulos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double pX, pY, areaX, areaY;
        String large;

        System.out.println("Digite as medidas do Triângulo X");
        System.out.print("a = ");
        double x1 = input.nextDouble();
        System.out.print("b = ");
        double x2 = input.nextDouble();
        System.out.print("c = ");
        double x3 = input.nextDouble();
        pX = (x1 + x2 + x3) / 2;
        areaX = Math.sqrt(pX * (pX - x1) * (pX - x2) * (pX - x3));

        System.out.println("Digite as medidas do Triângulo Y");
        System.out.print("a = ");
        double y1 = input.nextDouble();
        System.out.print("b = ");
        double y2 = input.nextDouble();
        System.out.print("c = ");
        double y3 = input.nextDouble();
        pY = (y1 + y2 + y3) / 2;
        areaY = Math.sqrt(pY * (pY - y1) * (pY - y2) * (pY - y3));

        if (areaX > areaY) {
            large = "X";
        } else {
            large = "Y";
        }

        System.out.printf("Área do triângulo X: %.4f\n", areaX);
        System.out.printf("Área do triângulo Y: %.4f\n", areaY);
        System.out.println("Maior área: " + large);

        input.close();
    }
}
