package aula088.application;

import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler um número inteiro N e a altura de N pessoas.
 * Armazene as N alturas em um vetor. Em seguida, mostrar a altura média
 * dessas pessoas.
 */

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Amount of people: ");
        int amount = input.nextInt();

        double sum = 0.0;
        double[] vect = new double[amount]; // declaração do vetor
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%d° height: ", i+1);
            vect[i] = input.nextDouble();
            sum += vect[i];
        }

        double avg = sum / amount;
        System.out.printf("Average height: %.2f\n", avg);

        input.close();
    }
}