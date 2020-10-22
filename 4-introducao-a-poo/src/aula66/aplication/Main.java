package aula66.aplication;

import aula66.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Product product = new Product();

        System.out.println("\033[35mENTER PRODUCT DATA: \033[m");
        System.out.print("Name: ");
        product.name = input.nextLine();
        System.out.print("Price: $");
        product.price = input.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = input.nextInt();

        System.out.println("\033[35mPRODUCT DATA: \033[m");
        System.out.println(product);

        input.close();
    }
}
