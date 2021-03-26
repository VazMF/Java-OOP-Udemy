package exercicios.ex01.application;

import exercicios.ex01.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int num = input.nextInt();
        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.printf("Employee #%d:\n", i+1);
            System.out.print("Id: ");
            int id = input.nextInt();

            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = input.nextInt();
            }

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Salary: $");
            Double salary = input.nextDouble();
            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int empId = input.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == empId).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        input.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}