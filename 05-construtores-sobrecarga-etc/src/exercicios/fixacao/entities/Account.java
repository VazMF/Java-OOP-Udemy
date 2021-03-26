package exercicios.fixacao.entities;

public class Account {
    private int number;
    private String holder;
    private double balance;
    
    public Account(int _number, String _holder, double initialDeposit) {
        number = _number;
        holder = _holder;
        deposit(initialDeposit);
    }

    public Account(int _number, String _holder) {
        number = _number;
        holder = _holder;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String _holder) {
        holder = _holder;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= (value + 5.00);
    }

    @Override
    public String toString() {
        return "Account: " + number + ", "
        + "Holder: " + holder + ", "
        + String.format("Balance: $%.2f\n", balance);
    }
}
