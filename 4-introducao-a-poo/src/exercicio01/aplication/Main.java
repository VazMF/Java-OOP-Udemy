package exercicio01.aplication;

import exercicio01.entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa pare ler os valores da largura e altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 * Usar classes.
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter the rectangle width and height:");
        System.out.print("width: ");
        rectangle.width = input.nextDouble();
        System.out.print("height: ");
        rectangle.height = input.nextDouble();

        System.out.printf("AREA: %.2f\n", rectangle.area());
        System.out.printf("PERIMETER: %.2f\n", rectangle.perimeter());
        System.out.printf("DIAGONAL: %.2f\n", rectangle.diagonal());
    }
}
