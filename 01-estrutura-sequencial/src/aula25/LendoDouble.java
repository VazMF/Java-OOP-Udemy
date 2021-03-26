package aula25;

import java.util.Locale;
import java.util.Scanner;

public class LendoDouble {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //muda a localizacao pro EUA para aceitar o valor com "."
        Scanner input = new Scanner(System.in);
        
        double num;
        System.out.print("Digite um valor real: "); 
        num = input.nextDouble();
        System.out.printf("Você informou o valor %.2f\n", num);
        
        input.close();
    }
}
