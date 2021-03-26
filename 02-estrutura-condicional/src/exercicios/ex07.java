package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia a hora inicial e final de um jogo. A seguir, calcule a duração do jogo, sabendo que o mesmo
 * começar em um dia e terminar no outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */

public class ex07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int start, end, duration;
        System.out.print("Que horas o jogo começou? ");
        start = input.nextInt();
        System.out.print("Que horas o jogo terminou? ");
        end = input.nextInt();

        if (start < end) {
            duration = end - start;
        } else {
            duration = 24 - start + end;
        }

        System.out.println("O jogo durou " + duration + " hora(s).");
        input.close();
    }
}
