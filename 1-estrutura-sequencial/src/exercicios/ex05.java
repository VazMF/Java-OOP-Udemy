package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora
 * e calcule o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1008
 */

public class ex05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int num;
        double workHours, hours, salary;

        System.out.print("Número do Funcionário: ");
        num = input.nextInt();

        System.out.print("Horas trabalhadas: ");
        workHours = input.nextDouble();

        System.out.print("Valor da hora: U$");
        hours = input.nextDouble();

        salary = workHours * hours;

        System.out.println("Number: " + num);
        System.out.printf("Salary: U$%.2f\n", salary);
        input.close();
    }
}