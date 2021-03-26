package exercicios;

import java.util.Scanner;

/**
 * Um posto de combustível deseja determinar qual de seus produtos tem a preferência de seus clientes. Faça um
 * programa para ler um tipo de combustível abastecido (codificado da seguinte forma: 1 Álcool, 2 Gasolina, 3
 * Diesel, 4 Fim). Caso o usuário informe um código inválido, deve ser solicitado um novo código (até que seja
 * válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem:
 * "Muito obrigado" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
 */

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int code = 0;
        int cont1 = 0, cont2 = 0, cont3 = 0;

        while (true) {
            System.out.println("[ 1 ] Álcool");
            System.out.println("[ 2 ] Gasolina");
            System.out.println("[ 3 ] Diesel");
            System.out.println("[ 4 ] Encerrar");
            System.out.print("Sua opção: ");
            code = input.nextInt();

            if (code == 1) {
                cont1 += 1;
            } else if (code == 2) {
                cont2 += 1;
            } else if (code == 3) {
                cont3 += 1;
            } else if (code == 4) {
                System.out.println("Muito obrigado!");
                break;
            } else {
                System.out.println("\033[31m[ERRO] DIGITE UMA OPÇÃO VÁLIDA\033[m");
                System.out.print("Sua opção: ");
                code = input.nextInt();
            }
        }
        System.out.println("Álcool: " + cont1);
        System.out.println("Gasolina: " + cont2);
        System.out.println("Diesel: " + cont3);
        input.close();
    }
}
