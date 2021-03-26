package classes.class139.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("names: ");
            String[] vector = input.nextLine().split(", ");

            System.out.print("index: ");
            int position = input.nextInt();

            System.out.println("#" + position + " - " + vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position");
        } catch (InputMismatchException e) {
            System.out.println("input error");
        }

        System.out.println("end of program");


        input.close();
    }
}
