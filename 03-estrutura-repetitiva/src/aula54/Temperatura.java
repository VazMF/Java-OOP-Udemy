package aula54;

import java.util.Locale;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double f;
        char resp;

        do {
            System.out.print("Informe a temperatura [°C]: ");
            double c = input.nextDouble();
            f = (9 * c / 5) + 32;
            System.out.printf("%.1f °C é igual a %.1f °F\n", c, f);
            System.out.print("Quer continuar? [s/n]: ");
            resp = input.next().charAt(0);
            System.out.println("-------------------------------");
        } while (resp != 'n');

    }
}
