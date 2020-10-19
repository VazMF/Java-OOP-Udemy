package aula38;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa para ler um valor inteiro de 1 a 7 representando
 * um dia da semana (sendo 1 = domingo e 2 = segunda...). Escreva na
 * tela o dia da semana correspondente, conforme exemplos.
 */

public class Semana {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num;
        String day = "";

        System.out.print("Informe um número: ");
        num = input.nextInt();

        switch (num) {
            case 1:
                day = "Domingo";
                break;
            case 2:
                day = "Segunda";
                break;
            case 3:
                day = "Terça";
                break;
            case 4:
                day = "Quarta";
                break;
            case 5:
                day = "Quinta";
                break;
            case 6:
                day = "Sexta";
                break;
            case 7:
                day = "Sábado";
                break;
            default:
                day = "[ERRO] Insira um número de 1 a 7.";
                break;
        }
        System.out.println("Dia da semana: " + day);
        input.close();
    }
}
