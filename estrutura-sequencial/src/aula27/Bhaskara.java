package aula27;

import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a, b, c, delta, x1, x2;

        System.out.println("CALCULADORA DE BHASKARA");

        System.out.print("Informe o valor de a: ");
        a = input.nextDouble();
        System.out.print("Informe o valor de b: ");
        b = input.nextDouble();
        System.out.print("Informe o valor de c: ");
        c = input.nextDouble();

        delta = Math.pow(b, 2.0) - 4*a*c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println("x' = " + x1);
        System.out.println("x'' = " + x2);
    }
}
