package aula094.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        System.out.println("First list: ");
        System.out.println(list);
        System.out.println("------------------------------------");

        list.add(2, "Marco");
        System.out.println("List after add Marco: ");
        System.out.println(list);
        System.out.println("------------------------------------");

        System.out.println("Size of List: " + list.size());
        System.out.println("------------------------------------");

        // Removendo todos os elementos que começam com M
        list.removeIf(name -> name.charAt(0) == 'M');

        System.out.println("List without names beginning with M: ");
        for (String name: list) {
            System.out.println(name);
        }

        System.out.println("------------------------------------");
        // Localizando um elemento pelo conteúdo
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("------------------------------------");
        // Separando os nome que começam com A em outra lista
        List<String> result = list.stream().filter(name -> name.charAt(0) == 'A').collect(Collectors.toList());

        System.out.println("Just names beginning with A: ");
        for (String name: result) {
            System.out.println(name);
        }

        System.out.println("------------------------------------");
        // Mostrando o primeiro nome que começa com A
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("First name starting with A: " + name);
    }
}
