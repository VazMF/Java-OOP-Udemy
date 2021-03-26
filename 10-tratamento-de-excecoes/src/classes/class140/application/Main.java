package classes.class140.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        method1();
        System.out.println("end of program");
    }

    public static void method1() {
        System.out.println("-- method1 start --");
        method2();
        System.out.println("-- method1 end --");
    }

    public static void method2() {
        Scanner input = new Scanner(System.in);

        System.out.println("-- method2 start --");

        try {
            String[] vector = input.nextLine().split(", ");
            int position = input.nextInt();
            System.out.println(vector[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position");
            e.printStackTrace();
            input.next();
        } catch (InputMismatchException e) {
            System.out.println("input error");
        }

        input.close();
        System.out.println("-- method2 end --");
    }
}
