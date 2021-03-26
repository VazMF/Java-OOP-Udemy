package exercicio03.aplication;

import exercicio03.entities.Student;
import java.util.Locale;
import java.util.Scanner;

/**
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final
 * do aluno no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos
 * pontos faltaram para o aluno obter o minímo para ser aprovado (que é 60% da nota), Você deve criar uma classe
 * Student para resolver o problema.
 */

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Name: ");
        student.name = input.nextLine();
        System.out.print("First grade: ");
        student.grade1 = input.nextDouble();
        System.out.print("Second grade: ");
        student.grade2 = input.nextDouble();
        System.out.print("Third grade: ");
        student.grade3 = input.nextDouble();
        System.out.println();

        System.out.printf("FINAL GRADE: %.2f\n", student.finalGrade());
        if (student.finalGrade() > 60) {
            System.out.println("\033[32mPASS\033[m");
        } else {
            System.out.println("\033[31mFAILED\33[m");
            System.out.printf("MISSING %.2f POINTS", student.missingPoints());
        }
        input.close();
    }
}
