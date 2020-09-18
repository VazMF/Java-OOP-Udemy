package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia três números inteiros. Em seguida, mostre qual o menor
 * dentre os três números lidos. Em caso de empate, mostrar apenas uma vez.
 */

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num1, num2, num3, menor;

        System.out.print("Informe o 1° número: ");
        num1 = input.nextInt();
        System.out.print("Informe o 2° número: ");
        num2 = input.nextInt();
        System.out.print("Informe o 3° número: ");
        num3 = input.nextInt();

        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }
        System.out.println("Menor: " + menor);
        input.close();
    }
}
