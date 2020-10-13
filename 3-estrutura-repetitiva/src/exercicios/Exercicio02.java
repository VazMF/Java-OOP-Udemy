package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo.
 * O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir na tela
 * a idade média deste grupo de indivíduos. Se for digitado um valor negativo na primeira vez, mostrara mensagem
 * "impossível calcular".
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int age, sum = 0, cont = 0;
        double media = 0.0;

        System.out.print("Digite uma idade: ");
        age = input.nextInt();

        while (age >= 0) {
            sum += age;
            cont += 1;

            System.out.print("Digite uma idade: ");
            age = input.nextInt();
        }

        if (cont > 0) {
            media = (double) sum / cont;
            System.out.printf("Média: %.2f\n", media);
        } else {
            System.out.println("Impossível calcular.");
        }
        input.close();
    }
}
