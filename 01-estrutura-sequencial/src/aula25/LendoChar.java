package aula25;
import java.util.Scanner;

public class LendoChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char x;

        System.out.print("Informe um caractere: ");
        x = input.next().charAt(0);
        System.out.println("Você digitou " + x);

        input.close();
    }
    
}
