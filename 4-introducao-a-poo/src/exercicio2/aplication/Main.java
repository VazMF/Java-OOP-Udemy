package exercicio2.aplication;

import exercicio2.entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler os dados de um funcionário (nome, salário brutoo e imposto). Em
 * segudia, mostrar os dados do funcionário (nome e salário líquido). Depois, aumetar o salário
 * com base na procentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar
 * novamente os dados do funcionário. Use a classe projetada abaixo.
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = input.nextLine();
        System.out.print("Gross salary: $");
        employee.grossSalary = input.nextDouble();
        System.out.print("Tax: $");
        employee.tax = input.nextDouble();
        System.out.println();

        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = input.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.println("Update data: ");
        System.out.println("Employee: " + employee);
        input.close();
    }
}
