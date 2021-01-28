package exercicies.ex01.application;

import exercicies.ex01.entities.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = input.next().charAt(0);

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Hours: ");
            int hours = input.nextInt();

            System.out.print("Value per hour: $");
            double value = input.nextDouble();

            if (outsourced == 'y') {
                System.out.print("Additional Charge: ");
                double additional = input.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, value, additional));
            } else {
                list.add(new Employee(name, hours, value));
            }
            System.out.println();
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        input.close();
    }
}