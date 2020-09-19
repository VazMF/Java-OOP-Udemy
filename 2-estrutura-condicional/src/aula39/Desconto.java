package aula39;

import java.util.Locale;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double price;

        System.out.print("Preço do produto: R$");
        price = input.nextDouble();

        double sale = (price < 20.0) ? price * 0.1 : price * 0.05;
        System.out.println(sale);
        input.close();
    }
}
