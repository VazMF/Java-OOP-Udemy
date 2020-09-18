package aula23;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        double x = 10.342454;
        System.out.printf("%.2f\n", x);
        System.out.printf("%.4f\n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f\n", x);
        System.out.println("Resultado = " + x);
        System.out.printf("Resultado = %.2f metros \n", x);

    }
}
