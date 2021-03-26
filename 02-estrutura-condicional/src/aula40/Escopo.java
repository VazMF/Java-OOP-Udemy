package aula40;

public class Escopo {
    public static void main(String[] args) {

        //a variavel tem que ser inicializada de alguma forma
        double price = 100.00;
        double discount = 0;

        if (price < 200.00) {
            discount = price * 0.1;
        }
        System.out.println(price - discount);
    }
}
