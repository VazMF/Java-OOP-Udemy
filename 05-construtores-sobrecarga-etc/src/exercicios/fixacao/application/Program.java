package exercicios.fixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exercicios.fixacao.entities.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Account acc;

        System.out.print("Enter account number: ");
        int accountNumber = input.nextInt();

        System.out.print("Enter account holder: ");
        input.nextLine();
        String holder = input.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char answer = input.next().charAt(0);

        if (answer == 'y') {
            System.out.print("Enter the initial deposit value: $");
            double initialDeposit = input.nextDouble();
            acc = new Account(accountNumber, holder, initialDeposit);
        } else {
            acc = new Account(accountNumber, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(acc);

        System.out.print("Enter a deposit value: $");
        double value = input.nextDouble();
        acc.deposit(value);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.print(acc);

        System.out.println();
        System.out.print("Enter a withdraw value: $");
        value = input.nextDouble();
        acc.withdraw(value);

        System.out.println();
        System.out.println("Updated account data:");
        System.out.println(acc);
        
        input.close();
    }
}
