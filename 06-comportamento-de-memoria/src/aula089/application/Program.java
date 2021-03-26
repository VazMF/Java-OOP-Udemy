package aula089.application;

import aula089.entities.Product;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e os dados (nome e preço)
 * de N produtos. Armazene os N produtos em um vetor. Em seguida, mostrar o
 * preço médio dos produtos.
 */

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Amount of products: ");
        int amount = input.nextInt();

        double sum = 0.0;
        Product vect[] = new Product[amount];
        for (int i = 0; i < vect.length; i++) {
            System.out.println("-------------------------------");
            System.out.printf("%d° PRODUCT\n", i+1);
            input.nextLine();
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Price: R$");
            double price = input.nextDouble();
            vect[i] = new Product(name, price);
            sum += vect[i].getPrice();
        }

        double avg = sum / amount;
        System.out.println("-------------------------------");
        System.out.printf("Average price: R$%.2f\n", avg);

        input.close();
    }
}