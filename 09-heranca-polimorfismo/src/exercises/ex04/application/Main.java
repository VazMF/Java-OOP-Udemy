package exercises.ex04.application;

import exercises.ex04.entities.Company;
import exercises.ex04.entities.Individual;
import exercises.ex04.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de N contribuintes, os quais podem ser pessoa física
 * ou jurídica, e depois mostrar o valor do imposto pago por cada um, bem como o total de
 * imposto arrecadado.
 */

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = input.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Tax payer #" + (i+1) + " data:");

            System.out.print("Individual or company (i/c)? ");
            char type = input.next().charAt(0);
            input.nextLine();

            System.out.print("Name: ");
            String name = input.nextLine();


            System.out.print("Annual income: $");
            double annualIncome = input.nextDouble();

            if (type == 'i') {
                System.out.print("Health expenditures: $");
                double healthExpenditures = input.nextDouble();

                list.add(new Individual(name, annualIncome, healthExpenditures));
            } else if (type == 'c'){
                System.out.print("Number of employees: ");
                int employees = input.nextInt();

                list.add(new Company(name, annualIncome, employees));
            }
        }

        System.out.println();
        double total = 0.0;
        System.out.println("TAXES PAID:");
        for (TaxPayer payer: list) {
            System.out.println(payer);
            total += payer.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", total));

        input.close();
    }
}
