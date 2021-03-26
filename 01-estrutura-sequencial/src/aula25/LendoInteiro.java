package aula25;

import java.util.Scanner;

public class LendoInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("informe um número inteiro: ");
        num = input.nextInt();
        System.out.println("Você digitou o número " + num);

        input.close();
    }
}
