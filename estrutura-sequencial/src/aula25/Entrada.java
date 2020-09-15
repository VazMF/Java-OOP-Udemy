package aula25;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome;

        System.out.print("Informe seu nome: ");
        nome = input.next();
        System.out.println("Você digitou " + nome);

        input.close();
    }
}
