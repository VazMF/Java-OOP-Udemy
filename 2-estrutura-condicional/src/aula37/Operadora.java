package aula37;

import java.util.Locale;
import java.util.Scanner;

/**
 * Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
 * dá direito a 100 minutos de telefone. Cada minuto que exceder a
 * franquia de 100 minutos custa R$ 2.00. Faça um programa para ler a
 * quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
 * a ser pago.
 */

public class Operadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int minutes;
        double total = 50.0;

        System.out.print("Informe os minutos: ");
        minutes = input.nextInt();

        if (minutes > 100) {
            total += (minutes - 100) * 2.0;
        }
        System.out.printf("Valor a pagar: R$ %.2f\n", total);
        input.close();
    }
}
