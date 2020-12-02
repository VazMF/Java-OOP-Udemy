package aula092.application;

public class Program {
    public static void main(String[] args) {

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        //imprimindo os dados com for
        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("------------------");

        //imprimindo os dados com for each
        for (String name: vect) {
            System.out.println(name);
        }
    }
}
