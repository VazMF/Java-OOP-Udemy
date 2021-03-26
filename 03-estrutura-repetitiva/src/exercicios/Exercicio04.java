package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa para ler as coordenadas x e y de uma quantidade indeterminada de pontos no sistema cartesiano.
 * Para cada ponto cartesiano escreva o quadrante que ele pertence. O algoritmo será encerrado quando pelo menos uma
 * das duas coordenadas for NULA (nesta situação sem escrever mensagem nenhuma).
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1115
 */

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x, y;
        System.out.print("x: ");
        x = input.nextInt();
        System.out.print("y: ");
        y = input.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro quadrante.");
            } else if (y > 0 && x < 0) {
                System.out.println("Segundo quadrante.");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro quadrante.");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto quadrante.");
            }

            System.out.print("x: ");
            x = input.nextInt();
            System.out.print("y: ");
            y = input.nextInt();
        }
        input.close();
    }
}
