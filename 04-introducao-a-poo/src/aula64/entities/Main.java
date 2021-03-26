package aula64.entities;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        String large;

        System.out.println("Digite as medidas do Triângulo X");
        System.out.print("a = ");
        x.ladoA = input.nextDouble();
        System.out.print("b = ");
        x.ladoB = input.nextDouble();
        System.out.print("c = ");
        x.ladoC = input.nextDouble();
        double areaX = x.area();

        System.out.println("Digite as medidas do Triângulo Y");
        System.out.print("a = ");
        y.ladoA = input.nextDouble();
        System.out.print("b = ");
        y.ladoB = input.nextDouble();
        System.out.print("c = ");
        y.ladoC = input.nextDouble();
        double areaY = y.area();

        if (areaX > areaY) {
            large = "X";
        } else {
            large = "Y";
        }

        System.out.printf("Área do triângulo X: %.4f\n", areaX);
        System.out.printf("Área do triângulo Y: %.4f\n", areaY);
        System.out.println("Maior área: " + large);

        input.close();
    }
}
