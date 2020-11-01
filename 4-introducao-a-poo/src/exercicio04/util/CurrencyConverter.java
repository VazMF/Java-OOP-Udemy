package exercicio04.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarToReal(double price, double amount) {
        return (price * amount) + (price * amount * IOF);
    }
}
