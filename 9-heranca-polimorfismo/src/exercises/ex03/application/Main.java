package exercises.ex03.application;

import exercises.ex03.entities.*;
import exercises.ex03.entities.enums.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de N figuras, e depois mostrar as áreas
 * destas figuras na mesma ordem que foram digitadas.
 */

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Shape #" + (i+1) + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            char shape = input.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(input.next());

            if (shape == 'r') {
                System.out.print("Width: ");
                double width = input.nextDouble();

                System.out.print("Height: ");
                double height = input.nextDouble();

                shapeList.add(new Rectangle(color, width, height));
            } else if (shape == 'c') {
                System.out.print("Radius: ");
                double radius = input.nextDouble();

                shapeList.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape1 : shapeList) {
            System.out.println(String.format("%.2f", shape1.area()));
        }

        input.close();
    }
}
