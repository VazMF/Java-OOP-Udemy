package exercicios;

import java.util.Locale;
import java.util.Scanner;

/**
 * Faça um programa que leia duas notas que um aluno obteve no primeiro e segundo semestre de uma
 * disciplina anual. Em seguida, mostre a nota final que o aluno obteve no ano juntamente com um
 * texto explicativo. Casi a nota final do aluno seja inferiror a 60.0, mostrar a mensagem "reprovado",
 * todos os valores devem ter uma casa decimal.
 */

public class ex01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Nota do 1° semestre: ");
        double nota1 = input.nextDouble();

        System.out.print("Nota do 2° semestre: ");
        double nota2 = input.nextDouble();

        double notaFinal = nota1 + nota2;

        System.out.printf("NOTA FINAL: %.1f\n", notaFinal);
        if (notaFinal < 60.0){
            System.out.println("REPROVADO");
        }

        input.close();
    }
}