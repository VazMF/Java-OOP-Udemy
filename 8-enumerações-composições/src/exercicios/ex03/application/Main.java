package exercicios.ex03.application;

import exercicios.ex03.model.entities.Client;
import exercicios.ex03.model.entities.Order;
import exercicios.ex03.model.entities.OrderItem;
import exercicios.ex03.model.entities.Product;
import exercicios.ex03.model.enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ler os dados de um pedido com N itens. Depois, mostrar um sumário do pedido conforme exemplo.
 * Nota: O instante do pedido deve ser o instante do sistema: new Date().
 */

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("ENTER THE CLIENT DATA:");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(input.next());
        Client client = new Client(name, email, birthDate);

        System.out.println();

        System.out.println("ENTER ORDER DATA:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(input.next());
        Order order = new Order(new Date(), status, client);
        System.out.print("How many items to this order? ");
        int itemsQuantity = input.nextInt();

        for (int i = 0; i < itemsQuantity; i++) {
            System.out.println();
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            input.nextLine();
            String productName = input.nextLine();
            System.out.print("Product price: $");
            double productPrice = input.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int productQuantity = input.nextInt();

            OrderItem item = new OrderItem(productQuantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        input.close();
    }
}
