package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma casa
 * decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, o programa
 * deve mostrar o valor da area do terreno, cem como o valor do preço do terreno, ambos com duas casas
 * decimais.
 *
 * Fonte: Uri Onlie Judge
 */

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a largura do terreno [m]: ");
        double width = input.nextDouble();
        System.out.print("Informe o comprimento do terreno [m]: ");
        double length = input.nextDouble();

        double area = length * width;
        System.out.print("Informe o valor do m²: R$");
        double price = input.nextDouble();
        double total = area * price;

        System.out.printf("A área do terreno é %.2fm²\n", area);
        System.out.printf("O preço do terreno é R$%.2f\n", total);
        input.close();
    }
}