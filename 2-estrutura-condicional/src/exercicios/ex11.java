package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Em um país imaginário denominado Lisarb. todos os habitantes ficam felies em pagar seus impostos, pois sabem
 * que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população,
 * sem qualquer desvio. A moeda desse país é o Rumbos, cujo o símbolo é o R$.
 *
 * Faça um programa que leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb.
 * Em seguida, calcule e mostre qual valor que está pessoa deve pagar de imposto de renda, segundo a tabeça abaixo.
 *
 * RENDA                          IMPOSTO DE RENDA
 * de R$ 0.00 a R$ 2000.00        Isento
 * de R$ 2000.01 até R$ 3000.00   8%
 * de R$ 3000.01 até 4500.00      18%
 * acima de R$ 4500.00            28%
 *
 * Fonte:
 */

public class ex11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double value, tax = 0;

        System.out.print("Informe um valor: R$");
        value = input.nextDouble();

        if (value <= 2000.0) {
            System.out.println("Isento.");
        } else if (value <= 3000.0) {
            tax = (value - 2000.0) * 0.08;
        } else if (value <= 4500.0) {
            tax = (value - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            tax = (value - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        System.out.printf("R$ %.2f", tax);
        input.close();
    }
}
