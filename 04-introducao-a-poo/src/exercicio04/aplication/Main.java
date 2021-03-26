package exercicio04.aplication;

import exercicio04.util.CurrencyConverter;
import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Crie uma classe CurrencyConverter
 * para ser responsável pelos cálculos.
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice = input.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantity = input.nextDouble();

        System.out.printf("Amount to be paid: R$%.2f\n", CurrencyConverter.dollarToReal(dollarPrice, quantity));

        input.close();
    }
}
