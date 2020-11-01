package aula70.aplication;

import java.util.Locale;
import java.util.Scanner;
import aula70.util.Calculator;

/**
 * Fazer um programa para ler um valor numérico qualquer, e daí mostrar quanto seria o valor
 * de uma circunferência e do volume de uma esfera para um raio daquele valor. Informar tam-
 * bém o valor de PI com duas casas decimais.
 */

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double c = calc.circumference(radius);
        double v = calc.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", calc.PI);

        input.close();
    }

}
