package exercises.ex02.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import exercises.ex02.entities.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char type = input.next().charAt(0);

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Price: $");
            double price = input.nextDouble();

            if (type == 'c') {
                list.add(new Product(name, price));
            } else if (type == 'i') {
                System.out.print("Customs fee: $");
                double customsFee = input.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (type == 'u') {
                System.out.print("Manufacture date: (DD/MM/YYYY): ");
                Date manufactureDate = dateFormat.parse(input.next());
                list.add(new UsedProduct(name, price, manufactureDate));
            }
            System.out.println();

        }

        System.out.println("PRICE TAGS");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

    }
}
