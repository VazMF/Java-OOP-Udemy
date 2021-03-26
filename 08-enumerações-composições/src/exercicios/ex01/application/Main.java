package exercicios.ex01.application;

import exercicios.ex01.entities.Department;
import exercicios.ex01.entities.HourContract;
import exercicios.ex01.entities.Worker;
import exercicios.ex01.entities.enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * Ler os dados de um trabalhador com N contratos (fornecidos pelo user). Depois, solicitar do usuário
 * um mês e mostrar qual foi o salário do funcionário nesse mês.
 */

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = input.nextLine();

        System.out.println("ENTER WORKER DATA: ");
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Level: ");
        String level = input.nextLine();
        System.out.print("Base salary: $");
        double baseSalary = input.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int contracts = input.nextInt();
        System.out.println();

        for (int i = 0; i < contracts; i++) {
            System.out.println("Enter the contract " + "#" + (i+1) + " data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = dateFormat.parse(input.next());
            System.out.print("Value per hour: $");
            double value = input.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = input.nextInt();
            HourContract contract = new HourContract(contractDate, value, duration);
            worker.addContract(contract);
            System.out.println();
        }

        System.out.print("Enter month and year to calculate (MM/YYYY): ");
        String monthAndYear = input.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": $" + String.format("%.2f", worker.income(year, month)));

        input.close();
    }
}
