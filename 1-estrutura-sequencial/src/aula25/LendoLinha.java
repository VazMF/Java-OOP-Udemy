package aula25;

import java.util.Locale;
import java.util.Scanner;

public class LendoLinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = input.next();
        y = input.nextInt();
        z = input.nextDouble();

        System.out.println("Você digitou: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        input.close();
    }

}