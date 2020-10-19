package aula24;

public class Casting {
    public static void main(String[] args) {
        int a, b;
        double resultado;
        a = 5;
        b = 2;

        resultado = (double) a / b; //o casting significa que nao queremos truncar o numero

        System.out.println(resultado);
    }
}
