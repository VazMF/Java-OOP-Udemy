package aula090.application;

import java.util.Scanner;
import aula090.entities.Rent;

/**
 * A dona de um pensionato possui dez quartos para alugar para estudantes,
 * sendo esses quartos identificados por número de 0 a 9.
 * 
 * Faça um programa que inicie com todos os quartos vázios, e depois leia
 * uma quantidade N representando o número de estudantes que vão alugar os
 * quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N
 * estudantes. Para cada registro de aluguel, informar o nome e email do
 * estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
 * que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
 * um relatório de todas as ocupações do pensionato, por ordem de quarto.
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Rent bedrooms[] = new Rent[10];
        
        System.out.print("How many rooms will be rented? ");
        int n = input.nextInt();
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d\n", i+1 );
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Email: ");
            String email = input.nextLine();
            System.out.print("Room: ");
            int room = input.nextInt();
            System.out.println();
            bedrooms[room] = new Rent(name, email);
        }
        
        System.out.println("Busy Rooms:");
        for (int i = 0; i < 10; i++) {
            if (bedrooms[i] != null) {
                System.out.println(i + ": " + bedrooms[i]);
            }
        }

        input.close();
    }
    
}
