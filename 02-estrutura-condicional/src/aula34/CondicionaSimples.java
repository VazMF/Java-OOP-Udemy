package aula34;

import java.util.Scanner;

public class CondicionaSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;

        System.out.print("Quantos anos você tem? ");
        idade = input.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        }

        input.close();
    }
}
