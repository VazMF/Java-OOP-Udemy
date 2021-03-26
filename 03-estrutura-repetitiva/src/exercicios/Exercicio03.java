package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
 * incorreta informada, escrever a mensagem "senha inválida". Quando a senha for informada corretamente, deve
 * ser impressa a mensagem "Acesso permitido" e o algoritmo encerrado. Considere a senha correta o valor 2002.
 *
 * Fonte: https://www.urionlinejudge.com.br/judge/pt/problems/view/1114
 */

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int password;
        System.out.print("Informe a senha: ");
        password = input.nextInt();

        while (password != 2002) {
            System.out.println("\033[31mSenha inválida.\033[m");
            System.out.print("Informe a senha: ");
            password = input.nextInt();
        }
        System.out.println("\033[32mAcesso permitido.\033[m");
        input.close();
    }
}
